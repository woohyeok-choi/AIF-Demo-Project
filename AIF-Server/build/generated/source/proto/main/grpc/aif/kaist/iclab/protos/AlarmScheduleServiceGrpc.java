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
    comments = "Source: alarm.proto")
public final class AlarmScheduleServiceGrpc {

  private AlarmScheduleServiceGrpc() {}

  public static final String SERVICE_NAME = "aif.kaist.AlarmScheduleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.List,
      aif.kaist.iclab.protos.AlarmProtos.Alarm> getListAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAlarm",
      requestType = aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.List.class,
      responseType = aif.kaist.iclab.protos.AlarmProtos.Alarm.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.List,
      aif.kaist.iclab.protos.AlarmProtos.Alarm> getListAlarmMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.List, aif.kaist.iclab.protos.AlarmProtos.Alarm> getListAlarmMethod;
    if ((getListAlarmMethod = AlarmScheduleServiceGrpc.getListAlarmMethod) == null) {
      synchronized (AlarmScheduleServiceGrpc.class) {
        if ((getListAlarmMethod = AlarmScheduleServiceGrpc.getListAlarmMethod) == null) {
          AlarmScheduleServiceGrpc.getListAlarmMethod = getListAlarmMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.List, aif.kaist.iclab.protos.AlarmProtos.Alarm>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.AlarmScheduleService", "ListAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.List.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.AlarmProtos.Alarm.getDefaultInstance()))
                  .setSchemaDescriptor(new AlarmScheduleServiceMethodDescriptorSupplier("ListAlarm"))
                  .build();
          }
        }
     }
     return getListAlarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Get,
      aif.kaist.iclab.protos.AlarmProtos.Alarm> getGetAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAlarm",
      requestType = aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Get.class,
      responseType = aif.kaist.iclab.protos.AlarmProtos.Alarm.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Get,
      aif.kaist.iclab.protos.AlarmProtos.Alarm> getGetAlarmMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Get, aif.kaist.iclab.protos.AlarmProtos.Alarm> getGetAlarmMethod;
    if ((getGetAlarmMethod = AlarmScheduleServiceGrpc.getGetAlarmMethod) == null) {
      synchronized (AlarmScheduleServiceGrpc.class) {
        if ((getGetAlarmMethod = AlarmScheduleServiceGrpc.getGetAlarmMethod) == null) {
          AlarmScheduleServiceGrpc.getGetAlarmMethod = getGetAlarmMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Get, aif.kaist.iclab.protos.AlarmProtos.Alarm>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.AlarmScheduleService", "GetAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Get.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.AlarmProtos.Alarm.getDefaultInstance()))
                  .setSchemaDescriptor(new AlarmScheduleServiceMethodDescriptorSupplier("GetAlarm"))
                  .build();
          }
        }
     }
     return getGetAlarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Create,
      aif.kaist.iclab.protos.AlarmProtos.Alarm> getCreateAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAlarm",
      requestType = aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Create.class,
      responseType = aif.kaist.iclab.protos.AlarmProtos.Alarm.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Create,
      aif.kaist.iclab.protos.AlarmProtos.Alarm> getCreateAlarmMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Create, aif.kaist.iclab.protos.AlarmProtos.Alarm> getCreateAlarmMethod;
    if ((getCreateAlarmMethod = AlarmScheduleServiceGrpc.getCreateAlarmMethod) == null) {
      synchronized (AlarmScheduleServiceGrpc.class) {
        if ((getCreateAlarmMethod = AlarmScheduleServiceGrpc.getCreateAlarmMethod) == null) {
          AlarmScheduleServiceGrpc.getCreateAlarmMethod = getCreateAlarmMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Create, aif.kaist.iclab.protos.AlarmProtos.Alarm>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.AlarmScheduleService", "CreateAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Create.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.AlarmProtos.Alarm.getDefaultInstance()))
                  .setSchemaDescriptor(new AlarmScheduleServiceMethodDescriptorSupplier("CreateAlarm"))
                  .build();
          }
        }
     }
     return getCreateAlarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Delete,
      com.google.protobuf.Empty> getDeleteAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAlarm",
      requestType = aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Delete.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Delete,
      com.google.protobuf.Empty> getDeleteAlarmMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Delete, com.google.protobuf.Empty> getDeleteAlarmMethod;
    if ((getDeleteAlarmMethod = AlarmScheduleServiceGrpc.getDeleteAlarmMethod) == null) {
      synchronized (AlarmScheduleServiceGrpc.class) {
        if ((getDeleteAlarmMethod = AlarmScheduleServiceGrpc.getDeleteAlarmMethod) == null) {
          AlarmScheduleServiceGrpc.getDeleteAlarmMethod = getDeleteAlarmMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Delete, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.AlarmScheduleService", "DeleteAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Delete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AlarmScheduleServiceMethodDescriptorSupplier("DeleteAlarm"))
                  .build();
          }
        }
     }
     return getDeleteAlarmMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlarmScheduleServiceStub newStub(io.grpc.Channel channel) {
    return new AlarmScheduleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlarmScheduleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AlarmScheduleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlarmScheduleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AlarmScheduleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AlarmScheduleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.List request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.AlarmProtos.Alarm> responseObserver) {
      asyncUnimplementedUnaryCall(getListAlarmMethod(), responseObserver);
    }

    /**
     */
    public void getAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Get request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.AlarmProtos.Alarm> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAlarmMethod(), responseObserver);
    }

    /**
     */
    public void createAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Create request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.AlarmProtos.Alarm> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAlarmMethod(), responseObserver);
    }

    /**
     */
    public void deleteAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Delete request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAlarmMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListAlarmMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.List,
                aif.kaist.iclab.protos.AlarmProtos.Alarm>(
                  this, METHODID_LIST_ALARM)))
          .addMethod(
            getGetAlarmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Get,
                aif.kaist.iclab.protos.AlarmProtos.Alarm>(
                  this, METHODID_GET_ALARM)))
          .addMethod(
            getCreateAlarmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Create,
                aif.kaist.iclab.protos.AlarmProtos.Alarm>(
                  this, METHODID_CREATE_ALARM)))
          .addMethod(
            getDeleteAlarmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Delete,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ALARM)))
          .build();
    }
  }

  /**
   */
  public static final class AlarmScheduleServiceStub extends io.grpc.stub.AbstractStub<AlarmScheduleServiceStub> {
    private AlarmScheduleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlarmScheduleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmScheduleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlarmScheduleServiceStub(channel, callOptions);
    }

    /**
     */
    public void listAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.List request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.AlarmProtos.Alarm> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListAlarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Get request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.AlarmProtos.Alarm> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAlarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Create request,
        io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.AlarmProtos.Alarm> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAlarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Delete request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAlarmMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AlarmScheduleServiceBlockingStub extends io.grpc.stub.AbstractStub<AlarmScheduleServiceBlockingStub> {
    private AlarmScheduleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlarmScheduleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmScheduleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlarmScheduleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<aif.kaist.iclab.protos.AlarmProtos.Alarm> listAlarm(
        aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.List request) {
      return blockingServerStreamingCall(
          getChannel(), getListAlarmMethod(), getCallOptions(), request);
    }

    /**
     */
    public aif.kaist.iclab.protos.AlarmProtos.Alarm getAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Get request) {
      return blockingUnaryCall(
          getChannel(), getGetAlarmMethod(), getCallOptions(), request);
    }

    /**
     */
    public aif.kaist.iclab.protos.AlarmProtos.Alarm createAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Create request) {
      return blockingUnaryCall(
          getChannel(), getCreateAlarmMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Delete request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAlarmMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AlarmScheduleServiceFutureStub extends io.grpc.stub.AbstractStub<AlarmScheduleServiceFutureStub> {
    private AlarmScheduleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlarmScheduleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmScheduleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlarmScheduleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<aif.kaist.iclab.protos.AlarmProtos.Alarm> getAlarm(
        aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Get request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAlarmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<aif.kaist.iclab.protos.AlarmProtos.Alarm> createAlarm(
        aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Create request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAlarmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAlarm(
        aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Delete request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAlarmMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_ALARM = 0;
  private static final int METHODID_GET_ALARM = 1;
  private static final int METHODID_CREATE_ALARM = 2;
  private static final int METHODID_DELETE_ALARM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlarmScheduleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlarmScheduleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_ALARM:
          serviceImpl.listAlarm((aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.List) request,
              (io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.AlarmProtos.Alarm>) responseObserver);
          break;
        case METHODID_GET_ALARM:
          serviceImpl.getAlarm((aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Get) request,
              (io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.AlarmProtos.Alarm>) responseObserver);
          break;
        case METHODID_CREATE_ALARM:
          serviceImpl.createAlarm((aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Create) request,
              (io.grpc.stub.StreamObserver<aif.kaist.iclab.protos.AlarmProtos.Alarm>) responseObserver);
          break;
        case METHODID_DELETE_ALARM:
          serviceImpl.deleteAlarm((aif.kaist.iclab.protos.AlarmProtos.Alarm.Query.Delete) request,
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

  private static abstract class AlarmScheduleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlarmScheduleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return aif.kaist.iclab.protos.AlarmProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlarmScheduleService");
    }
  }

  private static final class AlarmScheduleServiceFileDescriptorSupplier
      extends AlarmScheduleServiceBaseDescriptorSupplier {
    AlarmScheduleServiceFileDescriptorSupplier() {}
  }

  private static final class AlarmScheduleServiceMethodDescriptorSupplier
      extends AlarmScheduleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlarmScheduleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AlarmScheduleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlarmScheduleServiceFileDescriptorSupplier())
              .addMethod(getListAlarmMethod())
              .addMethod(getGetAlarmMethod())
              .addMethod(getCreateAlarmMethod())
              .addMethod(getDeleteAlarmMethod())
              .build();
        }
      }
    }
    return result;
  }
}
