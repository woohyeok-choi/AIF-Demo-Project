from google.protobuf.wrappers_pb2 import Int32Value, StringValue
import grpc

from calendar_pb2 import GoogleCalendar, GoogleCalendarEvent
from calendar_pb2_grpc import GoogleCalendarServiceStub

from datetime import datetime

from examples.utils import grpc_call, datetime_to_protobuf


# ========== CRUD Operations for Google Calendar ==========

@grpc_call
def list_calendars(stub: GoogleCalendarServiceStub, user_id: str, limit: int = 100):
    query = GoogleCalendar.Query.List(
        user_id=user_id,
        limit=Int32Value(value=limit)
    )
    result = stub.ListGoogleCalendar(query)

    return list(result)  # Here, ListGoogleCalendar returns generator, not List; so, force to change into List.


@grpc_call
def get_calendar(stub: GoogleCalendarServiceStub, user_id: str, calendar_id: str):
    query = GoogleCalendar.Query.Get(
        user_id=user_id,
        calendar_id=calendar_id
    )
    result = stub.GetGoogleCalendar(query)

    return result


@grpc_call
def create_calendar(stub: GoogleCalendarServiceStub, user_id: str, summary: str, **kwargs):
    query = GoogleCalendar.Query.Create(
        user_id=user_id,
        calendar=GoogleCalendar(
            summary=StringValue(value=summary),
            description=StringValue(value=kwargs.get('description')) if kwargs.get('description') else None,
            location=StringValue(value=kwargs.get('location')) if kwargs.get('location') else None,
            timezone=StringValue(value=kwargs.get('timezone')) if kwargs.get('timezone') else None
        )
    )
    result = stub.CreateGoogleCalendar(query)

    return result


@grpc_call
def update_calendar(stub: GoogleCalendarServiceStub, user_id: str, calendar_id: str, **kwargs):
    query = GoogleCalendar.Query.Update(
        user_id=user_id,
        calendar_id=calendar_id,
        calendar=GoogleCalendar(
            summary=StringValue(value=kwargs.get('summary')) if kwargs.get('summary') else None,
            description=StringValue(value=kwargs.get('description')) if kwargs.get('description') else None,
            location=StringValue(value=kwargs.get('location')) if kwargs.get('location') else None,
            timezone=StringValue(value=kwargs.get('timezone')) if kwargs.get('timezone') else None
        )
    )
    result = stub.UpdateGoogleCalendar(query)

    return result


@grpc_call
def delete_calendar(stub: GoogleCalendarServiceStub, user_id: str, calendar_id: str):
    query = GoogleCalendar.Query.Delete(
        user_id=user_id,
        calendar_id=calendar_id
    )
    result = stub.DeleteGoogleCalendar(query)

    return result


# ============================================================


# ======== CRUD Operations for Google Calendar Events ========

@grpc_call
def list_events(stub: GoogleCalendarServiceStub, user_id: str, calendar_id: str, limit: int = 100,
                start_time: datetime = None, end_time: datetime = None):
    query = GoogleCalendarEvent.Query.List(
        user_id=user_id,
        calendar_id=calendar_id,
        limit=Int32Value(value=limit),
        start_time=datetime_to_protobuf(start_time) if start_time else None,
        end_time=datetime_to_protobuf(end_time) if end_time else None
    )
    result = stub.ListGoogleCalendarEvent(query)

    return list(result)


@grpc_call
def get_event(stub: GoogleCalendarServiceStub, user_id: str, calendar_id: str, event_id: str):
    query = GoogleCalendarEvent.Query.Get(
        user_id=user_id,
        calendar_id=calendar_id,
        event_id=event_id
    )
    result = stub.GetGoogleCalendarEvent(query)
    return result


@grpc_call
def create_event(stub: GoogleCalendarServiceStub, user_id: str, calendar_id: str, summary: str, start: datetime, end: datetime, **kwargs):
    query = GoogleCalendarEvent.Query.Create(
        user_id=user_id,
        calendar_id=calendar_id,
        event=GoogleCalendarEvent(
            summary=StringValue(value=summary),
            start=datetime_to_protobuf(start),
            end=datetime_to_protobuf(end),
            description=StringValue(value=kwargs.get('description')) if kwargs.get('description') else None,
            location=StringValue(value=kwargs.get('location')) if kwargs.get('location') else None
        )
    )
    result = stub.CreateGoogleCalendarEvent(query)
    return result


@grpc_call
def update_event(stub: GoogleCalendarServiceStub, user_id: str, calendar_id: str, event_id: str, **kwargs):
    query = GoogleCalendarEvent.Query.Update(
        user_id=user_id,
        calendar_id=calendar_id,
        event_id=event_id,
        event=GoogleCalendarEvent(
            summary=StringValue(value=kwargs.get('summary')) if kwargs.get('summary') else None,
            start=datetime_to_protobuf(kwargs.get('start')) if kwargs.get('start') and type(kwargs.get('start')) is datetime else None,
            end=datetime_to_protobuf(kwargs.get('end')) if kwargs.get('end') and type(
                kwargs.get('end')) is datetime else None,
            description=StringValue(value=kwargs.get('description')) if kwargs.get('description') else None,
            location=StringValue(value=kwargs.get('location')) if kwargs.get('location') else None
        )
    )
    result = stub.UpdateGoogleCalendarEvent(query)
    return result


@grpc_call
def delete_event(stub: GoogleCalendarServiceStub, user_id: str, calendar_id: str, event_id: str):
    query = GoogleCalendarEvent.Query.Delete(
        user_id=user_id,
        calendar_id=calendar_id,
        event_id=event_id
    )
    result = stub.DeleteGoogleCalendarEvent(query)
    return result

# ============================================================

