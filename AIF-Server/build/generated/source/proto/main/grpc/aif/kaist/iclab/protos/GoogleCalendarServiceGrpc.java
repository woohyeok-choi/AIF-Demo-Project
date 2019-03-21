package aif.kaist.iclab.protos;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: calendar.proto")
public final class GoogleCalendarServiceGrpc {

  private GoogleCalendarServiceGrpc() {}

  public static final String SERVICE_NAME = "aif.kaist.GoogleCalendarService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.List,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> getListGoogleCalendarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGoogleCalendar",
      requestType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.List.class,
      responseType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.List,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> getListGoogleCalendarMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.List, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> getListGoogleCalendarMethod;
    if ((getListGoogleCalendarMethod = GoogleCalendarServiceGrpc.getListGoogleCalendarMethod) == null) {
      synchronized (GoogleCalendarServiceGrpc.class) {
        if ((getListGoogleCalendarMethod = GoogleCalendarServiceGrpc.getListGoogleCalendarMethod) == null) {
          GoogleCalendarServiceGrpc.getListGoogleCalendarMethod = getListGoogleCalendarMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.List, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.GoogleCalendarService", "ListGoogleCalendar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.List.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleCalendarServiceMethodDescriptorSupplier("ListGoogleCalendar"))
                  .build();
          }
        }
     }
     return getListGoogleCalendarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Get,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> getGetGoogleCalendarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGoogleCalendar",
      requestType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Get.class,
      responseType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Get,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> getGetGoogleCalendarMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Get, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> getGetGoogleCalendarMethod;
    if ((getGetGoogleCalendarMethod = GoogleCalendarServiceGrpc.getGetGoogleCalendarMethod) == null) {
      synchronized (GoogleCalendarServiceGrpc.class) {
        if ((getGetGoogleCalendarMethod = GoogleCalendarServiceGrpc.getGetGoogleCalendarMethod) == null) {
          GoogleCalendarServiceGrpc.getGetGoogleCalendarMethod = getGetGoogleCalendarMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Get, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.GoogleCalendarService", "GetGoogleCalendar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Get.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleCalendarServiceMethodDescriptorSupplier("GetGoogleCalendar"))
                  .build();
          }
        }
     }
     return getGetGoogleCalendarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Create,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> getCreateGoogleCalendarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGoogleCalendar",
      requestType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Create.class,
      responseType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Create,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> getCreateGoogleCalendarMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Create, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> getCreateGoogleCalendarMethod;
    if ((getCreateGoogleCalendarMethod = GoogleCalendarServiceGrpc.getCreateGoogleCalendarMethod) == null) {
      synchronized (GoogleCalendarServiceGrpc.class) {
        if ((getCreateGoogleCalendarMethod = GoogleCalendarServiceGrpc.getCreateGoogleCalendarMethod) == null) {
          GoogleCalendarServiceGrpc.getCreateGoogleCalendarMethod = getCreateGoogleCalendarMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Create, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.GoogleCalendarService", "CreateGoogleCalendar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Create.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleCalendarServiceMethodDescriptorSupplier("CreateGoogleCalendar"))
                  .build();
          }
        }
     }
     return getCreateGoogleCalendarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Update,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> getUpdateGoogleCalendarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGoogleCalendar",
      requestType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Update.class,
      responseType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Update,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> getUpdateGoogleCalendarMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Update, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> getUpdateGoogleCalendarMethod;
    if ((getUpdateGoogleCalendarMethod = GoogleCalendarServiceGrpc.getUpdateGoogleCalendarMethod) == null) {
      synchronized (GoogleCalendarServiceGrpc.class) {
        if ((getUpdateGoogleCalendarMethod = GoogleCalendarServiceGrpc.getUpdateGoogleCalendarMethod) == null) {
          GoogleCalendarServiceGrpc.getUpdateGoogleCalendarMethod = getUpdateGoogleCalendarMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Update, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.GoogleCalendarService", "UpdateGoogleCalendar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Update.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleCalendarServiceMethodDescriptorSupplier("UpdateGoogleCalendar"))
                  .build();
          }
        }
     }
     return getUpdateGoogleCalendarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Delete,
      com.google.protobuf.Empty> getDeleteGoogleCalendarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGoogleCalendar",
      requestType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Delete.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Delete,
      com.google.protobuf.Empty> getDeleteGoogleCalendarMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Delete, com.google.protobuf.Empty> getDeleteGoogleCalendarMethod;
    if ((getDeleteGoogleCalendarMethod = GoogleCalendarServiceGrpc.getDeleteGoogleCalendarMethod) == null) {
      synchronized (GoogleCalendarServiceGrpc.class) {
        if ((getDeleteGoogleCalendarMethod = GoogleCalendarServiceGrpc.getDeleteGoogleCalendarMethod) == null) {
          GoogleCalendarServiceGrpc.getDeleteGoogleCalendarMethod = getDeleteGoogleCalendarMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Delete, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.GoogleCalendarService", "DeleteGoogleCalendar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Delete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleCalendarServiceMethodDescriptorSupplier("DeleteGoogleCalendar"))
                  .build();
          }
        }
     }
     return getDeleteGoogleCalendarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.List,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> getListGoogleCalendarEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGoogleCalendarEvent",
      requestType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.List.class,
      responseType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.List,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> getListGoogleCalendarEventMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.List, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> getListGoogleCalendarEventMethod;
    if ((getListGoogleCalendarEventMethod = GoogleCalendarServiceGrpc.getListGoogleCalendarEventMethod) == null) {
      synchronized (GoogleCalendarServiceGrpc.class) {
        if ((getListGoogleCalendarEventMethod = GoogleCalendarServiceGrpc.getListGoogleCalendarEventMethod) == null) {
          GoogleCalendarServiceGrpc.getListGoogleCalendarEventMethod = getListGoogleCalendarEventMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.List, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.GoogleCalendarService", "ListGoogleCalendarEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.List.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleCalendarServiceMethodDescriptorSupplier("ListGoogleCalendarEvent"))
                  .build();
          }
        }
     }
     return getListGoogleCalendarEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Get,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> getGetGoogleCalendarEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGoogleCalendarEvent",
      requestType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Get.class,
      responseType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Get,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> getGetGoogleCalendarEventMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Get, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> getGetGoogleCalendarEventMethod;
    if ((getGetGoogleCalendarEventMethod = GoogleCalendarServiceGrpc.getGetGoogleCalendarEventMethod) == null) {
      synchronized (GoogleCalendarServiceGrpc.class) {
        if ((getGetGoogleCalendarEventMethod = GoogleCalendarServiceGrpc.getGetGoogleCalendarEventMethod) == null) {
          GoogleCalendarServiceGrpc.getGetGoogleCalendarEventMethod = getGetGoogleCalendarEventMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Get, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.GoogleCalendarService", "GetGoogleCalendarEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Get.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleCalendarServiceMethodDescriptorSupplier("GetGoogleCalendarEvent"))
                  .build();
          }
        }
     }
     return getGetGoogleCalendarEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Create,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> getCreateGoogleCalendarEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGoogleCalendarEvent",
      requestType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Create.class,
      responseType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Create,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> getCreateGoogleCalendarEventMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Create, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> getCreateGoogleCalendarEventMethod;
    if ((getCreateGoogleCalendarEventMethod = GoogleCalendarServiceGrpc.getCreateGoogleCalendarEventMethod) == null) {
      synchronized (GoogleCalendarServiceGrpc.class) {
        if ((getCreateGoogleCalendarEventMethod = GoogleCalendarServiceGrpc.getCreateGoogleCalendarEventMethod) == null) {
          GoogleCalendarServiceGrpc.getCreateGoogleCalendarEventMethod = getCreateGoogleCalendarEventMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Create, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.GoogleCalendarService", "CreateGoogleCalendarEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Create.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleCalendarServiceMethodDescriptorSupplier("CreateGoogleCalendarEvent"))
                  .build();
          }
        }
     }
     return getCreateGoogleCalendarEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Update,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> getUpdateGoogleCalendarEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGoogleCalendarEvent",
      requestType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Update.class,
      responseType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Update,
      aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> getUpdateGoogleCalendarEventMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Update, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> getUpdateGoogleCalendarEventMethod;
    if ((getUpdateGoogleCalendarEventMethod = GoogleCalendarServiceGrpc.getUpdateGoogleCalendarEventMethod) == null) {
      synchronized (GoogleCalendarServiceGrpc.class) {
        if ((getUpdateGoogleCalendarEventMethod = GoogleCalendarServiceGrpc.getUpdateGoogleCalendarEventMethod) == null) {
          GoogleCalendarServiceGrpc.getUpdateGoogleCalendarEventMethod = getUpdateGoogleCalendarEventMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Update, aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.GoogleCalendarService", "UpdateGoogleCalendarEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Update.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleCalendarServiceMethodDescriptorSupplier("UpdateGoogleCalendarEvent"))
                  .build();
          }
        }
     }
     return getUpdateGoogleCalendarEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Delete,
      com.google.protobuf.Empty> getDeleteGoogleCalendarEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGoogleCalendarEvent",
      requestType = aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Delete.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Delete,
      com.google.protobuf.Empty> getDeleteGoogleCalendarEventMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Delete, com.google.protobuf.Empty> getDeleteGoogleCalendarEventMethod;
    if ((getDeleteGoogleCalendarEventMethod = GoogleCalendarServiceGrpc.getDeleteGoogleCalendarEventMethod) == null) {
      synchronized (GoogleCalendarServiceGrpc.class) {
        if ((getDeleteGoogleCalendarEventMethod = GoogleCalendarServiceGrpc.getDeleteGoogleCalendarEventMethod) == null) {
          GoogleCalendarServiceGrpc.getDeleteGoogleCalendarEventMethod = getDeleteGoogleCalendarEventMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Delete, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.GoogleCalendarService", "DeleteGoogleCalendarEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Delete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new GoogleCalendarServiceMethodDescriptorSupplier("DeleteGoogleCalendarEvent"))
                  .build();
          }
        }
     }
     return getDeleteGoogleCalendarEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GoogleCalendarServiceStub newStub(io.grpc.Channel channel) {
    return new GoogleCalendarServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GoogleCalendarServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GoogleCalendarServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GoogleCalendarServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GoogleCalendarServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GoogleCalendarServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.List request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> responseObserver) {
      asyncUnimplementedUnaryCall(getListGoogleCalendarMethod(), responseObserver);
    }

    /**
     */
    public void getGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Get request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGoogleCalendarMethod(), responseObserver);
    }

    /**
     */
    public void createGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Create request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGoogleCalendarMethod(), responseObserver);
    }

    /**
     */
    public void updateGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Update request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGoogleCalendarMethod(), responseObserver);
    }

    /**
     */
    public void deleteGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Delete request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGoogleCalendarMethod(), responseObserver);
    }

    /**
     */
    public void listGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.List request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> responseObserver) {
      asyncUnimplementedUnaryCall(getListGoogleCalendarEventMethod(), responseObserver);
    }

    /**
     */
    public void getGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Get request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGoogleCalendarEventMethod(), responseObserver);
    }

    /**
     */
    public void createGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Create request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGoogleCalendarEventMethod(), responseObserver);
    }

    /**
     */
    public void updateGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Update request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGoogleCalendarEventMethod(), responseObserver);
    }

    /**
     */
    public void deleteGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Delete request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGoogleCalendarEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListGoogleCalendarMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.List,
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar>(
                  this, METHODID_LIST_GOOGLE_CALENDAR)))
          .addMethod(
            getGetGoogleCalendarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Get,
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar>(
                  this, METHODID_GET_GOOGLE_CALENDAR)))
          .addMethod(
            getCreateGoogleCalendarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Create,
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar>(
                  this, METHODID_CREATE_GOOGLE_CALENDAR)))
          .addMethod(
            getUpdateGoogleCalendarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Update,
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar>(
                  this, METHODID_UPDATE_GOOGLE_CALENDAR)))
          .addMethod(
            getDeleteGoogleCalendarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Delete,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_GOOGLE_CALENDAR)))
          .addMethod(
            getListGoogleCalendarEventMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.List,
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent>(
                  this, METHODID_LIST_GOOGLE_CALENDAR_EVENT)))
          .addMethod(
            getGetGoogleCalendarEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Get,
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent>(
                  this, METHODID_GET_GOOGLE_CALENDAR_EVENT)))
          .addMethod(
            getCreateGoogleCalendarEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Create,
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent>(
                  this, METHODID_CREATE_GOOGLE_CALENDAR_EVENT)))
          .addMethod(
            getUpdateGoogleCalendarEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Update,
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent>(
                  this, METHODID_UPDATE_GOOGLE_CALENDAR_EVENT)))
          .addMethod(
            getDeleteGoogleCalendarEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Delete,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_GOOGLE_CALENDAR_EVENT)))
          .build();
    }
  }

  /**
   */
  public static final class GoogleCalendarServiceStub extends io.grpc.stub.AbstractStub<GoogleCalendarServiceStub> {
    private GoogleCalendarServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoogleCalendarServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleCalendarServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoogleCalendarServiceStub(channel, callOptions);
    }

    /**
     */
    public void listGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.List request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListGoogleCalendarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Get request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGoogleCalendarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Create request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGoogleCalendarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Update request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGoogleCalendarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Delete request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGoogleCalendarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.List request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListGoogleCalendarEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Get request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGoogleCalendarEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Create request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGoogleCalendarEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Update request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGoogleCalendarEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Delete request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGoogleCalendarEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GoogleCalendarServiceBlockingStub extends io.grpc.stub.AbstractStub<GoogleCalendarServiceBlockingStub> {
    private GoogleCalendarServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoogleCalendarServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleCalendarServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoogleCalendarServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> listGoogleCalendar(
        aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.List request) {
      return blockingServerStreamingCall(
          getChannel(), getListGoogleCalendarMethod(), getCallOptions(), request);
    }

    /**
     */
    public aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar getGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Get request) {
      return blockingUnaryCall(
          getChannel(), getGetGoogleCalendarMethod(), getCallOptions(), request);
    }

    /**
     */
    public aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar createGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Create request) {
      return blockingUnaryCall(
          getChannel(), getCreateGoogleCalendarMethod(), getCallOptions(), request);
    }

    /**
     */
    public aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar updateGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Update request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGoogleCalendarMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteGoogleCalendar(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Delete request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGoogleCalendarMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> listGoogleCalendarEvent(
        aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.List request) {
      return blockingServerStreamingCall(
          getChannel(), getListGoogleCalendarEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent getGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Get request) {
      return blockingUnaryCall(
          getChannel(), getGetGoogleCalendarEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent createGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Create request) {
      return blockingUnaryCall(
          getChannel(), getCreateGoogleCalendarEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent updateGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Update request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGoogleCalendarEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteGoogleCalendarEvent(aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Delete request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGoogleCalendarEventMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GoogleCalendarServiceFutureStub extends io.grpc.stub.AbstractStub<GoogleCalendarServiceFutureStub> {
    private GoogleCalendarServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoogleCalendarServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoogleCalendarServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoogleCalendarServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> getGoogleCalendar(
        aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Get request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGoogleCalendarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> createGoogleCalendar(
        aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Create request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGoogleCalendarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar> updateGoogleCalendar(
        aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Update request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGoogleCalendarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteGoogleCalendar(
        aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Delete request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGoogleCalendarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> getGoogleCalendarEvent(
        aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Get request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGoogleCalendarEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> createGoogleCalendarEvent(
        aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Create request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGoogleCalendarEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent> updateGoogleCalendarEvent(
        aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Update request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGoogleCalendarEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteGoogleCalendarEvent(
        aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Delete request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGoogleCalendarEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_GOOGLE_CALENDAR = 0;
  private static final int METHODID_GET_GOOGLE_CALENDAR = 1;
  private static final int METHODID_CREATE_GOOGLE_CALENDAR = 2;
  private static final int METHODID_UPDATE_GOOGLE_CALENDAR = 3;
  private static final int METHODID_DELETE_GOOGLE_CALENDAR = 4;
  private static final int METHODID_LIST_GOOGLE_CALENDAR_EVENT = 5;
  private static final int METHODID_GET_GOOGLE_CALENDAR_EVENT = 6;
  private static final int METHODID_CREATE_GOOGLE_CALENDAR_EVENT = 7;
  private static final int METHODID_UPDATE_GOOGLE_CALENDAR_EVENT = 8;
  private static final int METHODID_DELETE_GOOGLE_CALENDAR_EVENT = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GoogleCalendarServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GoogleCalendarServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_GOOGLE_CALENDAR:
          serviceImpl.listGoogleCalendar((aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.List) request,
              (io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar>) responseObserver);
          break;
        case METHODID_GET_GOOGLE_CALENDAR:
          serviceImpl.getGoogleCalendar((aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Get) request,
              (io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar>) responseObserver);
          break;
        case METHODID_CREATE_GOOGLE_CALENDAR:
          serviceImpl.createGoogleCalendar((aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Create) request,
              (io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar>) responseObserver);
          break;
        case METHODID_UPDATE_GOOGLE_CALENDAR:
          serviceImpl.updateGoogleCalendar((aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Update) request,
              (io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar>) responseObserver);
          break;
        case METHODID_DELETE_GOOGLE_CALENDAR:
          serviceImpl.deleteGoogleCalendar((aif.kaist.iclab.protos.CalendarProtos.GoogleCalendar.Query.Delete) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_GOOGLE_CALENDAR_EVENT:
          serviceImpl.listGoogleCalendarEvent((aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.List) request,
              (io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent>) responseObserver);
          break;
        case METHODID_GET_GOOGLE_CALENDAR_EVENT:
          serviceImpl.getGoogleCalendarEvent((aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Get) request,
              (io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent>) responseObserver);
          break;
        case METHODID_CREATE_GOOGLE_CALENDAR_EVENT:
          serviceImpl.createGoogleCalendarEvent((aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Create) request,
              (io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent>) responseObserver);
          break;
        case METHODID_UPDATE_GOOGLE_CALENDAR_EVENT:
          serviceImpl.updateGoogleCalendarEvent((aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Update) request,
              (io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent>) responseObserver);
          break;
        case METHODID_DELETE_GOOGLE_CALENDAR_EVENT:
          serviceImpl.deleteGoogleCalendarEvent((aif.kaist.iclab.protos.CalendarProtos.GoogleCalendarEvent.Query.Delete) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GoogleCalendarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GoogleCalendarServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return aif.kaist.iclab.protos.CalendarProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GoogleCalendarService");
    }
  }

  private static final class GoogleCalendarServiceFileDescriptorSupplier
      extends GoogleCalendarServiceBaseDescriptorSupplier {
    GoogleCalendarServiceFileDescriptorSupplier() {}
  }

  private static final class GoogleCalendarServiceMethodDescriptorSupplier
      extends GoogleCalendarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GoogleCalendarServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GoogleCalendarServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GoogleCalendarServiceFileDescriptorSupplier())
              .addMethod(getListGoogleCalendarMethod())
              .addMethod(getGetGoogleCalendarMethod())
              .addMethod(getCreateGoogleCalendarMethod())
              .addMethod(getUpdateGoogleCalendarMethod())
              .addMethod(getDeleteGoogleCalendarMethod())
              .addMethod(getListGoogleCalendarEventMethod())
              .addMethod(getGetGoogleCalendarEventMethod())
              .addMethod(getCreateGoogleCalendarEventMethod())
              .addMethod(getUpdateGoogleCalendarEventMethod())
              .addMethod(getDeleteGoogleCalendarEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
