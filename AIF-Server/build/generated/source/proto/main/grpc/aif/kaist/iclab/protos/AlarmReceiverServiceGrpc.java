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
 * <pre>
 * For receiving alarms, this service should be implemented.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: alarm.proto")
public final class AlarmReceiverServiceGrpc {

  private AlarmReceiverServiceGrpc() {}

  public static final String SERVICE_NAME = "aif.kaist.AlarmReceiverService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm,
      com.google.protobuf.Empty> getReceiveAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReceiveAlarm",
      requestType = aif.kaist.iclab.protos.AlarmProtos.Alarm.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm,
      com.google.protobuf.Empty> getReceiveAlarmMethod() {
    io.grpc.MethodDescriptor<aif.kaist.iclab.protos.AlarmProtos.Alarm, com.google.protobuf.Empty> getReceiveAlarmMethod;
    if ((getReceiveAlarmMethod = AlarmReceiverServiceGrpc.getReceiveAlarmMethod) == null) {
      synchronized (AlarmReceiverServiceGrpc.class) {
        if ((getReceiveAlarmMethod = AlarmReceiverServiceGrpc.getReceiveAlarmMethod) == null) {
          AlarmReceiverServiceGrpc.getReceiveAlarmMethod = getReceiveAlarmMethod = 
              io.grpc.MethodDescriptor.<aif.kaist.iclab.protos.AlarmProtos.Alarm, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aif.kaist.AlarmReceiverService", "ReceiveAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aif.kaist.iclab.protos.AlarmProtos.Alarm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AlarmReceiverServiceMethodDescriptorSupplier("ReceiveAlarm"))
                  .build();
          }
        }
     }
     return getReceiveAlarmMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlarmReceiverServiceStub newStub(io.grpc.Channel channel) {
    return new AlarmReceiverServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlarmReceiverServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AlarmReceiverServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlarmReceiverServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AlarmReceiverServiceFutureStub(channel);
  }

  /**
   * <pre>
   * For receiving alarms, this service should be implemented.
   * </pre>
   */
  public static abstract class AlarmReceiverServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void receiveAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getReceiveAlarmMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReceiveAlarmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aif.kaist.iclab.protos.AlarmProtos.Alarm,
                com.google.protobuf.Empty>(
                  this, METHODID_RECEIVE_ALARM)))
          .build();
    }
  }

  /**
   * <pre>
   * For receiving alarms, this service should be implemented.
   * </pre>
   */
  public static final class AlarmReceiverServiceStub extends io.grpc.stub.AbstractStub<AlarmReceiverServiceStub> {
    private AlarmReceiverServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlarmReceiverServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmReceiverServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlarmReceiverServiceStub(channel, callOptions);
    }

    /**
     */
    public void receiveAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReceiveAlarmMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * For receiving alarms, this service should be implemented.
   * </pre>
   */
  public static final class AlarmReceiverServiceBlockingStub extends io.grpc.stub.AbstractStub<AlarmReceiverServiceBlockingStub> {
    private AlarmReceiverServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlarmReceiverServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmReceiverServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlarmReceiverServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty receiveAlarm(aif.kaist.iclab.protos.AlarmProtos.Alarm request) {
      return blockingUnaryCall(
          getChannel(), getReceiveAlarmMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * For receiving alarms, this service should be implemented.
   * </pre>
   */
  public static final class AlarmReceiverServiceFutureStub extends io.grpc.stub.AbstractStub<AlarmReceiverServiceFutureStub> {
    private AlarmReceiverServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlarmReceiverServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmReceiverServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlarmReceiverServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> receiveAlarm(
        aif.kaist.iclab.protos.AlarmProtos.Alarm request) {
      return futureUnaryCall(
          getChannel().newCall(getReceiveAlarmMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECEIVE_ALARM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlarmReceiverServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlarmReceiverServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECEIVE_ALARM:
          serviceImpl.receiveAlarm((aif.kaist.iclab.protos.AlarmProtos.Alarm) request,
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

  private static abstract class AlarmReceiverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlarmReceiverServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return aif.kaist.iclab.protos.AlarmProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlarmReceiverService");
    }
  }

  private static final class AlarmReceiverServiceFileDescriptorSupplier
      extends AlarmReceiverServiceBaseDescriptorSupplier {
    AlarmReceiverServiceFileDescriptorSupplier() {}
  }

  private static final class AlarmReceiverServiceMethodDescriptorSupplier
      extends AlarmReceiverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlarmReceiverServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AlarmReceiverServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlarmReceiverServiceFileDescriptorSupplier())
              .addMethod(getReceiveAlarmMethod())
              .build();
        }
      }
    }
    return result;
  }
}
