from alarm_pb2 import Alarm
from alarm_pb2_grpc import AlarmScheduleServiceStub

from examples.utils import grpc_call


@grpc_call
def list_alarm(stub: AlarmScheduleServiceStub, user_id: str):
    query = Alarm.Query.List(
        user_id=user_id
    )
    result = stub.ListAlarm(query)  # ListAlarm returns generator, not list.
    return list(result)


@grpc_call
def get_alarm(stub: AlarmScheduleServiceStub, user_id: str, alarm_id: str):
    query = Alarm.Query.Get(
        user_id=user_id,
        alarm_id=alarm_id
    )
    result = stub.GetAlarm(query)
    return result


@grpc_call
def create_alarm(stub: AlarmScheduleServiceStub, user_id: str, destination: str, delay_millis: int, content: str, **kwargs):
    query = Alarm.Query.Create(
        user_id=user_id,
        alarm=Alarm(
            destination=destination,
            delay_millis=delay_millis,
            content=content,
            interval_millis=kwargs.get('interval_millis') if kwargs.get('interval_millis') else None
        )
    )
    result = stub.CreateAlarm(query)
    return result


@grpc_call
def delete_alarm(stub: AlarmScheduleServiceStub, user_id: str, alarm_id: str):
    query = Alarm.Query.Delete(
        user_id=user_id,
        alarm_id=alarm_id
    )
    result = stub.DeleteAlarm(query)
    return result

