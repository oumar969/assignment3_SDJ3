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
public final class AnimalServiceGrpc {

  private AnimalServiceGrpc() {}

  public static final String SERVICE_NAME = "org.example.AnimalService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RegisterAnimalRequest,
          AnimalResponse> METHOD_CREATE_ANIMAL =
      io.grpc.MethodDescriptor.<RegisterAnimalRequest, AnimalResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.AnimalService", "createAnimal"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RegisterAnimalRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<AnimalIdRequest,
          AnimalResponse> METHOD_GET_ANIMAL_BY_ID =
      io.grpc.MethodDescriptor.<AnimalIdRequest, AnimalResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.AnimalService", "getAnimalById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<DateRequest,
          AnimalListResponse> METHOD_GET_ANIMALS_BY_DATE =
      io.grpc.MethodDescriptor.<DateRequest, AnimalListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.AnimalService", "getAnimalsByDate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              DateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<AnimalIdRequest,
          AnimalListResponse> METHOD_GET_ANIMALS_BY_TYPE =
      io.grpc.MethodDescriptor.<AnimalIdRequest, AnimalListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.AnimalService", "getAnimalsByType"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<AnimalIdRequest,
          AnimalListResponse> METHOD_GET_ANIMALS_BY_WEIGHT =
      io.grpc.MethodDescriptor.<AnimalIdRequest, AnimalListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.AnimalService", "getAnimalsByWeight"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<AnimalIdRequest,
          AnimalListResponse> METHOD_GET_ALL_ANIMALS =
      io.grpc.MethodDescriptor.<AnimalIdRequest, AnimalListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.AnimalService", "getAllAnimals"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<AnimalResponse,
          AnimalResponse> METHOD_UPDATE_ANIMAL =
      io.grpc.MethodDescriptor.<AnimalResponse, AnimalResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.AnimalService", "updateAnimal"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalResponse.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<AnimalIdRequest,
          AnimalResponse> METHOD_DELETE_ANIMAL =
      io.grpc.MethodDescriptor.<AnimalIdRequest, AnimalResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.AnimalService", "deleteAnimal"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalServiceStub newStub(io.grpc.Channel channel) {
    return new AnimalServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AnimalServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AnimalServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AnimalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAnimal(RegisterAnimalRequest request,
                             io.grpc.stub.StreamObserver<AnimalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_ANIMAL, responseObserver);
    }

    /**
     */
    public void getAnimalById(AnimalIdRequest request,
                              io.grpc.stub.StreamObserver<AnimalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ANIMAL_BY_ID, responseObserver);
    }

    /**
     */
    public void getAnimalsByDate(DateRequest request,
                                 io.grpc.stub.StreamObserver<AnimalListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ANIMALS_BY_DATE, responseObserver);
    }

    /**
     */
    public void getAnimalsByType(AnimalIdRequest request,
                                 io.grpc.stub.StreamObserver<AnimalListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ANIMALS_BY_TYPE, responseObserver);
    }

    /**
     */
    public void getAnimalsByWeight(AnimalIdRequest request,
                                   io.grpc.stub.StreamObserver<AnimalListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ANIMALS_BY_WEIGHT, responseObserver);
    }

    /**
     */
    public void getAllAnimals(AnimalIdRequest request,
                              io.grpc.stub.StreamObserver<AnimalListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_ANIMALS, responseObserver);
    }

    /**
     */
    public void updateAnimal(AnimalResponse request,
                             io.grpc.stub.StreamObserver<AnimalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ANIMAL, responseObserver);
    }

    /**
     */
    public void deleteAnimal(AnimalIdRequest request,
                             io.grpc.stub.StreamObserver<AnimalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_ANIMAL, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_ANIMAL,
            asyncUnaryCall(
              new MethodHandlers<
                      RegisterAnimalRequest,
                      AnimalResponse>(
                  this, METHODID_CREATE_ANIMAL)))
          .addMethod(
            METHOD_GET_ANIMAL_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                      AnimalIdRequest,
                      AnimalResponse>(
                  this, METHODID_GET_ANIMAL_BY_ID)))
          .addMethod(
            METHOD_GET_ANIMALS_BY_DATE,
            asyncUnaryCall(
              new MethodHandlers<
                      DateRequest,
                      AnimalListResponse>(
                  this, METHODID_GET_ANIMALS_BY_DATE)))
          .addMethod(
            METHOD_GET_ANIMALS_BY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                      AnimalIdRequest,
                      AnimalListResponse>(
                  this, METHODID_GET_ANIMALS_BY_TYPE)))
          .addMethod(
            METHOD_GET_ANIMALS_BY_WEIGHT,
            asyncUnaryCall(
              new MethodHandlers<
                      AnimalIdRequest,
                      AnimalListResponse>(
                  this, METHODID_GET_ANIMALS_BY_WEIGHT)))
          .addMethod(
            METHOD_GET_ALL_ANIMALS,
            asyncUnaryCall(
              new MethodHandlers<
                      AnimalIdRequest,
                      AnimalListResponse>(
                  this, METHODID_GET_ALL_ANIMALS)))
          .addMethod(
            METHOD_UPDATE_ANIMAL,
            asyncUnaryCall(
              new MethodHandlers<
                      AnimalResponse,
                      AnimalResponse>(
                  this, METHODID_UPDATE_ANIMAL)))
          .addMethod(
            METHOD_DELETE_ANIMAL,
            asyncUnaryCall(
              new MethodHandlers<
                      AnimalIdRequest,
                      AnimalResponse>(
                  this, METHODID_DELETE_ANIMAL)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalServiceStub extends io.grpc.stub.AbstractStub<AnimalServiceStub> {
    private AnimalServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnimalServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AnimalServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnimalServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAnimal(RegisterAnimalRequest request,
                             io.grpc.stub.StreamObserver<AnimalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_ANIMAL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalById(AnimalIdRequest request,
                              io.grpc.stub.StreamObserver<AnimalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMAL_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalsByDate(DateRequest request,
                                 io.grpc.stub.StreamObserver<AnimalListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMALS_BY_DATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalsByType(AnimalIdRequest request,
                                 io.grpc.stub.StreamObserver<AnimalListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMALS_BY_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalsByWeight(AnimalIdRequest request,
                                   io.grpc.stub.StreamObserver<AnimalListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMALS_BY_WEIGHT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllAnimals(AnimalIdRequest request,
                              io.grpc.stub.StreamObserver<AnimalListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_ANIMALS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAnimal(AnimalResponse request,
                             io.grpc.stub.StreamObserver<AnimalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ANIMAL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAnimal(AnimalIdRequest request,
                             io.grpc.stub.StreamObserver<AnimalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_ANIMAL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalServiceBlockingStub extends io.grpc.stub.AbstractStub<AnimalServiceBlockingStub> {
    private AnimalServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnimalServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AnimalServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnimalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public AnimalResponse createAnimal(RegisterAnimalRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_ANIMAL, getCallOptions(), request);
    }

    /**
     */
    public AnimalResponse getAnimalById(AnimalIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ANIMAL_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public AnimalListResponse getAnimalsByDate(DateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ANIMALS_BY_DATE, getCallOptions(), request);
    }

    /**
     */
    public AnimalListResponse getAnimalsByType(AnimalIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ANIMALS_BY_TYPE, getCallOptions(), request);
    }

    /**
     */
    public AnimalListResponse getAnimalsByWeight(AnimalIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ANIMALS_BY_WEIGHT, getCallOptions(), request);
    }

    /**
     */
    public AnimalListResponse getAllAnimals(AnimalIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_ANIMALS, getCallOptions(), request);
    }

    /**
     */
    public AnimalResponse updateAnimal(AnimalResponse request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ANIMAL, getCallOptions(), request);
    }

    /**
     */
    public AnimalResponse deleteAnimal(AnimalIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_ANIMAL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalServiceFutureStub extends io.grpc.stub.AbstractStub<AnimalServiceFutureStub> {
    private AnimalServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnimalServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AnimalServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnimalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalResponse> createAnimal(
        RegisterAnimalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_ANIMAL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalResponse> getAnimalById(
        AnimalIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMAL_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalListResponse> getAnimalsByDate(
        DateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMALS_BY_DATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalListResponse> getAnimalsByType(
        AnimalIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMALS_BY_TYPE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalListResponse> getAnimalsByWeight(
        AnimalIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMALS_BY_WEIGHT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalListResponse> getAllAnimals(
        AnimalIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_ANIMALS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalResponse> updateAnimal(
        AnimalResponse request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ANIMAL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AnimalResponse> deleteAnimal(
        AnimalIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_ANIMAL, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ANIMAL = 0;
  private static final int METHODID_GET_ANIMAL_BY_ID = 1;
  private static final int METHODID_GET_ANIMALS_BY_DATE = 2;
  private static final int METHODID_GET_ANIMALS_BY_TYPE = 3;
  private static final int METHODID_GET_ANIMALS_BY_WEIGHT = 4;
  private static final int METHODID_GET_ALL_ANIMALS = 5;
  private static final int METHODID_UPDATE_ANIMAL = 6;
  private static final int METHODID_DELETE_ANIMAL = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ANIMAL:
          serviceImpl.createAnimal((RegisterAnimalRequest) request,
              (io.grpc.stub.StreamObserver<AnimalResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_BY_ID:
          serviceImpl.getAnimalById((AnimalIdRequest) request,
              (io.grpc.stub.StreamObserver<AnimalResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMALS_BY_DATE:
          serviceImpl.getAnimalsByDate((DateRequest) request,
              (io.grpc.stub.StreamObserver<AnimalListResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMALS_BY_TYPE:
          serviceImpl.getAnimalsByType((AnimalIdRequest) request,
              (io.grpc.stub.StreamObserver<AnimalListResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMALS_BY_WEIGHT:
          serviceImpl.getAnimalsByWeight((AnimalIdRequest) request,
              (io.grpc.stub.StreamObserver<AnimalListResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_ANIMALS:
          serviceImpl.getAllAnimals((AnimalIdRequest) request,
              (io.grpc.stub.StreamObserver<AnimalListResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ANIMAL:
          serviceImpl.updateAnimal((AnimalResponse) request,
              (io.grpc.stub.StreamObserver<AnimalResponse>) responseObserver);
          break;
        case METHODID_DELETE_ANIMAL:
          serviceImpl.deleteAnimal((AnimalIdRequest) request,
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

  private static final class AnimalServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Slaghterhouse.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AnimalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_ANIMAL)
              .addMethod(METHOD_GET_ANIMAL_BY_ID)
              .addMethod(METHOD_GET_ANIMALS_BY_DATE)
              .addMethod(METHOD_GET_ANIMALS_BY_TYPE)
              .addMethod(METHOD_GET_ANIMALS_BY_WEIGHT)
              .addMethod(METHOD_GET_ALL_ANIMALS)
              .addMethod(METHOD_UPDATE_ANIMAL)
              .addMethod(METHOD_DELETE_ANIMAL)
              .build();
        }
      }
    }
    return result;
  }
}
