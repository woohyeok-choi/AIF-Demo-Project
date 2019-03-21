from alarm_pb2_grpc import AlarmScheduleServiceStub
from calendar_pb2_grpc import GoogleCalendarServiceStub
from datetime import datetime, timedelta
from . import def_ops_alarm as alarm, def_ops_calendar as calendar
from examples.utils import protobuf_to_datetime, merge_datetime
import time


# Specific use cases
# Use case 1: Find free time slots for schedule another appointments (e.g., exercise)
def find_free_time_slots(stub: GoogleCalendarServiceStub, user_id: str):
    # Add dummy calendar for this use case
    dummy_calendar = calendar.create_calendar(stub, user_id, 'dummy-calendar')
    dummy_calendar_id = dummy_calendar.id.value

    # Assume that there are some events already scheduled as followings:
    # [02:00 - 02:30, 05:00 - 06:00, 08:00 - 09:00, 13:00 - 14:30, 19:00 - 19:30, 22:00 - 23:30]
    dummy_event_time_slots = [
        (2, 0, 2, 30),
        (5, 0, 6, 0),
        (8, 0, 9, 0),
        (13, 0, 14, 30),
        (19, 0, 19, 30),
        (22, 0, 23, 30)
    ]

    # Add above events
    dummy_events = [
        calendar.create_event(stub, user_id, dummy_calendar_id,
                              'dummy-event ({}:{} - {}:{})'.format(start_hour, start_min, end_hour, end_min),
                              merge_datetime(hour=start_hour, minute=start_min, second=0),
                              merge_datetime(hour=end_hour, minute=end_min, second=0)
                              )
        for start_hour, start_min, end_hour, end_min in dummy_event_time_slots
    ]

    # Now, we want to two-hour free time slots, expected as followings:
    # [00:00 - 02:00, 02:30 - 05:00, 06:00 - 08:00, 09:00 - 13:00, 14:30 - 19:00, 19:30 - 22:00]

    # At first, get all events at this day (i.e., 2019-03-20)
    start = merge_datetime(hour=0, minute=0, second=0)
    end = merge_datetime(hour=23, minute=59, second=59)

    all_events = calendar.list_events(stub, user_id, dummy_calendar_id,
                                      start_time=start,
                                      end_time=end
                                      )
    # And then, extract start and end time for each event.
    all_events_time_slots = [
        (protobuf_to_datetime(event.start), protobuf_to_datetime(event.end))
        for event in all_events
    ]
    print(all_events_time_slots)

    # Sort these
    all_slots = sorted(
        [(start, start)] + all_events_time_slots + [(end, end)]
    )

    # Find 2 hours free slots
    free_slots = []
    for s, e in ((all_slots[i][1], all_slots[i+1][0]) for i in range(len(all_slots) - 1)):
        if s + timedelta(hours=2) <= e:
            print("Free time slots for 2 hours: {} - {}".format(s, e))
            free_slots.append((s, e))

    # Finally, delete dummy calendar
    calendar.delete_calendar(stub, user_id, dummy_calendar_id)

    return free_slots


# Use case 2: Register exercise event and corresponding multiple alarms
# In this case, we want to register some exercise event (lasting 3 minute), and sends multiple alarms for the event.
# Alarm setting is as followings:
# - 2 min before: the alarm will be delivered 2 min before event is started
# - At the time: the alarm will be delivered at the time that event is started.
# - Half: the alarm will be delivered when a half of time of the event (in this case, 1.5 min) passes by.
# - At the end: the alarm will be delivered when the event is finished.
def schedule_multiple_alarms(alarm_stub: AlarmScheduleServiceStub,
                             calendar_stub: GoogleCalendarServiceStub,
                             user_id: str,
                             receiver_server_address: str
                             ):
    # Add dummy calendar for this use case
    dummy_calendar = calendar.create_calendar(calendar_stub, user_id, 'dummy-calendar')
    dummy_calendar_id = dummy_calendar.id.value
    now = datetime.now()
    # Add dummy event which will be started after 4 minutes and lasted for 3 minutes,
    # meaning it will be end 7 minutes after now
    dummy_event = calendar.create_event(calendar_stub, user_id, dummy_calendar_id, 'dummy-event',
                                        now + timedelta(seconds=4 * 60),
                                        now + timedelta(seconds=4 * 60 + 3 * 60)
                                        )
    print(dummy_event)
    # Then, we add alarms 2 min before, at the time, a half, and at the end
    # The event will be triggered 4 min after and lasted 3 minutes; therefore,
    # 2 min before: now + 4 minutes - 2 minutes
    # at the tme: now + 4 minutes
    # a half: now + 4 minutes + 1.5 minutes
    # at the end: now + 4 minutes + 3 minutes
    alarm_settings = [
        now + timedelta(seconds=2 * 60),
        now + timedelta(seconds=4 * 60),
        now + timedelta(seconds=4 * 60 + 1.5 * 60),
        now + timedelta(seconds=4 * 60 + 3 * 60)
    ]
    for setting in alarm_settings:
        # delay should be milliseconds.
        alarm.create_alarm(alarm_stub, user_id, receiver_server_address, (setting - now).seconds * 1000,
                           'alarm will be triggered at: {}'.format(setting))

    # then, check whether four alarm is sent to your receiver server.

    time.sleep(7 * 60)

    # delete dummy calendar

    calendar.delete_calendar(calendar_stub, user_id, dummy_calendar_id)
