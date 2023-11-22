package com.example.assignment.Protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: Slaghterhouse.proto")
public final class SlaughterServiceGrpc {

  private SlaughterServiceGrpc() {}

  public static final String SERVICE_NAME = "org.example.SlaughterService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<AnimalIdRequest,
          AnimalResponse> METHOD_SLAUGHTER_ANIMAL =
      io.grpc.MethodDescriptor.<AnimalIdRequest, AnimalResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.SlaughterService", "slaughterAnimal"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterServiceStub newStub(io.grpc.Channel channel) {
    return new SlaughterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SlaughterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SlaughterServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SlaughterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void slaughterAnimal(AnimalIdRequest request,
                                io.grpc.stub.StreamObserver<AnimalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SLAUGHTER_ANIMAL, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SLAUGHTER_ANIMAL,
            asyncUnaryCall(
              new MethodHandlers<
                      AnimalIdRequest,
                      AnimalResponse>(
                  this, METHODID_SLAUGHTER_ANIMAL)))
          .build();
    }
  }

  /**
   */
  public static final class SlaughterServiceStub extends io.grpc.stub.AbstractStub<SlaughterServiceStub> {
    private SlaughterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SlaughterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SlaughterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SlaughterServiceStub(channel, callOptions);
    }

    /**
     */
    public void slaughterAnimal(AnimalIdRequest request,
                                io.grpc.stub.StreamObserver<AnimalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SLAUGHTER_ANIMAL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SlaughterServiceBlockingStub extends io.grpc.stub.AbstractStub<SlaughterServiceBlockingStub> {
    private SlaughterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SlaughterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SlaughterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SlaughterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public AnimalResponse slaughterAnimal(AnimalIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SLAUGHTER_ANIMAL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SlaughterServiceFutureStub extends io.grpc.stub.AbstractStub<SlaughterServiceFutureStub> {
    private SlaughterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SlaughterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SlaughterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SlaughterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalResponse> slaughterAnimal(
        AnimalIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SLAUGHTER_ANIMAL, getCallOptions()), request);
    }
  }

  private static final int METHODID_SLAUGHTER_ANIMAL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlaughterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlaughterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SLAUGHTER_ANIMAL:
          serviceImpl.slaughterAnimal((AnimalIdRequest) request,
              (io.grpc.stub.StreamObserver<AnimalResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class SlaughterServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Slaghterhouse.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SlaughterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterServiceDescriptorSupplier())
              .addMethod(METHOD_SLAUGHTER_ANIMAL)
              .build();
        }
      }
    }
    return result;
  }
}
