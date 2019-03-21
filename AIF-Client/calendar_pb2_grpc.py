# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import calendar_pb2 as calendar__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


class GoogleCalendarServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.ListGoogleCalendar = channel.unary_stream(
        '/aif.kaist.GoogleCalendarService/ListGoogleCalendar',
        request_serializer=calendar__pb2.GoogleCalendar.Query.List.SerializeToString,
        response_deserializer=calendar__pb2.GoogleCalendar.FromString,
        )
    self.GetGoogleCalendar = channel.unary_unary(
        '/aif.kaist.GoogleCalendarService/GetGoogleCalendar',
        request_serializer=calendar__pb2.GoogleCalendar.Query.Get.SerializeToString,
        response_deserializer=calendar__pb2.GoogleCalendar.FromString,
        )
    self.CreateGoogleCalendar = channel.unary_unary(
        '/aif.kaist.GoogleCalendarService/CreateGoogleCalendar',
        request_serializer=calendar__pb2.GoogleCalendar.Query.Create.SerializeToString,
        response_deserializer=calendar__pb2.GoogleCalendar.FromString,
        )
    self.UpdateGoogleCalendar = channel.unary_unary(
        '/aif.kaist.GoogleCalendarService/UpdateGoogleCalendar',
        request_serializer=calendar__pb2.GoogleCalendar.Query.Update.SerializeToString,
        response_deserializer=calendar__pb2.GoogleCalendar.FromString,
        )
    self.DeleteGoogleCalendar = channel.unary_unary(
        '/aif.kaist.GoogleCalendarService/DeleteGoogleCalendar',
        request_serializer=calendar__pb2.GoogleCalendar.Query.Delete.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.ListGoogleCalendarEvent = channel.unary_stream(
        '/aif.kaist.GoogleCalendarService/ListGoogleCalendarEvent',
        request_serializer=calendar__pb2.GoogleCalendarEvent.Query.List.SerializeToString,
        response_deserializer=calendar__pb2.GoogleCalendarEvent.FromString,
        )
    self.GetGoogleCalendarEvent = channel.unary_unary(
        '/aif.kaist.GoogleCalendarService/GetGoogleCalendarEvent',
        request_serializer=calendar__pb2.GoogleCalendarEvent.Query.Get.SerializeToString,
        response_deserializer=calendar__pb2.GoogleCalendarEvent.FromString,
        )
    self.CreateGoogleCalendarEvent = channel.unary_unary(
        '/aif.kaist.GoogleCalendarService/CreateGoogleCalendarEvent',
        request_serializer=calendar__pb2.GoogleCalendarEvent.Query.Create.SerializeToString,
        response_deserializer=calendar__pb2.GoogleCalendarEvent.FromString,
        )
    self.UpdateGoogleCalendarEvent = channel.unary_unary(
        '/aif.kaist.GoogleCalendarService/UpdateGoogleCalendarEvent',
        request_serializer=calendar__pb2.GoogleCalendarEvent.Query.Update.SerializeToString,
        response_deserializer=calendar__pb2.GoogleCalendarEvent.FromString,
        )
    self.DeleteGoogleCalendarEvent = channel.unary_unary(
        '/aif.kaist.GoogleCalendarService/DeleteGoogleCalendarEvent',
        request_serializer=calendar__pb2.GoogleCalendarEvent.Query.Delete.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )


class GoogleCalendarServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def ListGoogleCalendar(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetGoogleCalendar(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def CreateGoogleCalendar(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def UpdateGoogleCalendar(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DeleteGoogleCalendar(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ListGoogleCalendarEvent(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetGoogleCalendarEvent(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def CreateGoogleCalendarEvent(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def UpdateGoogleCalendarEvent(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DeleteGoogleCalendarEvent(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_GoogleCalendarServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'ListGoogleCalendar': grpc.unary_stream_rpc_method_handler(
          servicer.ListGoogleCalendar,
          request_deserializer=calendar__pb2.GoogleCalendar.Query.List.FromString,
          response_serializer=calendar__pb2.GoogleCalendar.SerializeToString,
      ),
      'GetGoogleCalendar': grpc.unary_unary_rpc_method_handler(
          servicer.GetGoogleCalendar,
          request_deserializer=calendar__pb2.GoogleCalendar.Query.Get.FromString,
          response_serializer=calendar__pb2.GoogleCalendar.SerializeToString,
      ),
      'CreateGoogleCalendar': grpc.unary_unary_rpc_method_handler(
          servicer.CreateGoogleCalendar,
          request_deserializer=calendar__pb2.GoogleCalendar.Query.Create.FromString,
          response_serializer=calendar__pb2.GoogleCalendar.SerializeToString,
      ),
      'UpdateGoogleCalendar': grpc.unary_unary_rpc_method_handler(
          servicer.UpdateGoogleCalendar,
          request_deserializer=calendar__pb2.GoogleCalendar.Query.Update.FromString,
          response_serializer=calendar__pb2.GoogleCalendar.SerializeToString,
      ),
      'DeleteGoogleCalendar': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteGoogleCalendar,
          request_deserializer=calendar__pb2.GoogleCalendar.Query.Delete.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'ListGoogleCalendarEvent': grpc.unary_stream_rpc_method_handler(
          servicer.ListGoogleCalendarEvent,
          request_deserializer=calendar__pb2.GoogleCalendarEvent.Query.List.FromString,
          response_serializer=calendar__pb2.GoogleCalendarEvent.SerializeToString,
      ),
      'GetGoogleCalendarEvent': grpc.unary_unary_rpc_method_handler(
          servicer.GetGoogleCalendarEvent,
          request_deserializer=calendar__pb2.GoogleCalendarEvent.Query.Get.FromString,
          response_serializer=calendar__pb2.GoogleCalendarEvent.SerializeToString,
      ),
      'CreateGoogleCalendarEvent': grpc.unary_unary_rpc_method_handler(
          servicer.CreateGoogleCalendarEvent,
          request_deserializer=calendar__pb2.GoogleCalendarEvent.Query.Create.FromString,
          response_serializer=calendar__pb2.GoogleCalendarEvent.SerializeToString,
      ),
      'UpdateGoogleCalendarEvent': grpc.unary_unary_rpc_method_handler(
          servicer.UpdateGoogleCalendarEvent,
          request_deserializer=calendar__pb2.GoogleCalendarEvent.Query.Update.FromString,
          response_serializer=calendar__pb2.GoogleCalendarEvent.SerializeToString,
      ),
      'DeleteGoogleCalendarEvent': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteGoogleCalendarEvent,
          request_deserializer=calendar__pb2.GoogleCalendarEvent.Query.Delete.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'aif.kaist.GoogleCalendarService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
