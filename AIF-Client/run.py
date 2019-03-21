from datetime import datetime, timedelta
import grpc
from calendar_pb2_grpc import GoogleCalendarServiceStub
from alarm_pb2_grpc import AlarmScheduleServiceStub
from dateutil import tz
from examples import def_ops_calendar as calendar_op, def_ops_alarm as alarm_op, use_cases
import time

KST = tz.gettz('Asia/Seoul')
TERM = 10


# Examples for calendar operations
def run_calendar(address: str, user_id: str):
    channel = grpc.insecure_channel(address)
    stub = GoogleCalendarServiceStub(channel)

    calendar_op.list_calendars(stub, user_id)
    time.sleep(TERM)

    new_calendar = calendar_op.create_calendar(stub, user_id, 'dummy-calendar', description='dummy-description')
    new_calendar_id = new_calendar.id.value
    time.sleep(TERM)

    calendar_op.get_calendar(stub, user_id, new_calendar_id)
    time.sleep(TERM)

    calendar_op.update_calendar(stub, user_id, new_calendar_id, description='updated-description')
    time.sleep(TERM)

    new_event_1 = calendar_op.create_event(stub, user_id, new_calendar_id, 'dummy-event-1',
                                           datetime.now() + timedelta(hours=1),
                                           datetime.now() + timedelta(hours=2),
                                           description='dummy-event-1-description'
                                           )

    new_event_2 = calendar_op.create_event(stub, user_id, new_calendar_id, 'dummy-event-2',
                                           datetime.now() + timedelta(hours=3),
                                           datetime.now() + timedelta(hours=4),
                                           description='dummy-event-2-description'
                                           )
    time.sleep(TERM)

    calendar_op.get_event(stub, user_id, new_calendar_id, new_event_1.id.value)
    time.sleep(TERM)

    calendar_op.list_events(stub, user_id, new_calendar_id, 100)
    time.sleep(TERM)

    calendar_op.update_event(stub, user_id, new_calendar_id, new_event_1.id.value,
                             description='dummy-event-1-updated-description')
    time.sleep(TERM)

    calendar_op.delete_event(stub, user_id, new_calendar_id, new_event_2.id.value)
    time.sleep(TERM)

    calendar_op.delete_calendar(stub, user_id, new_calendar_id)
    time.sleep(TERM)

    channel.close()


# Examples for alarm operations
# Make sure to run a server implementing AlarmReceiverService.ReceiveAlarm to get scheduled alarm message
def run_alarm(address: str, user_id: str, receiver_server_address: str):
    channel = grpc.insecure_channel(address)
    stub = AlarmScheduleServiceStub(channel)

    alarm1 = alarm_op.create_alarm(stub, user_id, receiver_server_address, 15 * 1000, content='dummy-alarm-1')
    alarm2 = alarm_op.create_alarm(stub, user_id, receiver_server_address, 30 * 1000, content='dummy-alarm-2')
    alarm3 = alarm_op.create_alarm(stub, user_id, receiver_server_address, 120 * 1000, content='dummy-alarm-3')
    time.sleep(TERM)

    alarm_op.list_alarm(stub, user_id)
    time.sleep(TERM)

    alarm_op.get_alarm(stub, user_id, alarm3.alarm_id)
    time.sleep(TERM)

    alarm_op.delete_alarm(stub, user_id, alarm3.alarm_id)
    time.sleep(TERM * 5)

    channel.close()


# Examples for specific use cases
# Make sure to run a server implementing AlarmReceiverService.ReceiveAlarm to get scheduled alarm message
def run_use_cases(address: str, user_id: str, receiver_server_address: str):
    channel = grpc.insecure_channel(address)
    calendar_stub = GoogleCalendarServiceStub(channel)
    alarm_stub = AlarmScheduleServiceStub(channel)

    use_cases.find_free_time_slots(calendar_stub, user_id)
    time.sleep(TERM)

    use_cases.schedule_multiple_alarms(alarm_stub, calendar_stub, user_id, receiver_server_address)
    time.sleep(TERM * 6)

    channel.close()


if __name__ == '__main__':
    aif_server_address = 'aif.kaist.ac.kr:50051'
    your_user_id = 'should-set-your-id'  # should set user id
    receiver_address = 'should-set-your-receiver-server-address'  # should set receiver address

    run_calendar(aif_server_address, your_user_id)
    run_alarm(aif_server_address, your_user_id, receiver_address)
    run_use_cases(aif_server_address, your_user_id, receiver_address)
