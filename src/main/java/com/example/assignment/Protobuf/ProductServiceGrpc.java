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
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "org.example.ProductService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<AnimalIdRequest,
          ProductListResponse> METHOD_GET_PRODUCTS_INCLUDING_ANIMAL_REG_ID =
      io.grpc.MethodDescriptor.<AnimalIdRequest, ProductListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.ProductService", "getProductsIncludingAnimalRegId"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              AnimalIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ProductListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ProductIdRequest,
          ProductResponse> METHOD_GET_PRODUCT_BY_ID =
      io.grpc.MethodDescriptor.<ProductIdRequest, ProductResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.ProductService", "getProductById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ProductIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ProductResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ProductIdRequest,
          ProductListResponse> METHOD_GET_ALL_PRODUCTS =
      io.grpc.MethodDescriptor.<ProductIdRequest, ProductListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.ProductService", "getAllProducts"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ProductIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ProductListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ProductResponse,
          ProductResponse> METHOD_CREATE_PRODUCT =
      io.grpc.MethodDescriptor.<ProductResponse, ProductResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.ProductService", "createProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ProductResponse.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ProductResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ProductResponse,
          ProductResponse> METHOD_UPDATE_PRODUCT =
      io.grpc.MethodDescriptor.<ProductResponse, ProductResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.ProductService", "updateProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ProductResponse.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ProductResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ProductIdRequest,
          ProductResponse> METHOD_DELETE_PRODUCT =
      io.grpc.MethodDescriptor.<ProductIdRequest, ProductResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.example.ProductService", "deleteProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ProductIdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ProductResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    return new ProductServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProductsIncludingAnimalRegId(AnimalIdRequest request,
                                                io.grpc.stub.StreamObserver<ProductListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCTS_INCLUDING_ANIMAL_REG_ID, responseObserver);
    }

    /**
     */
    public void getProductById(ProductIdRequest request,
                               io.grpc.stub.StreamObserver<ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCT_BY_ID, responseObserver);
    }

    /**
     */
    public void getAllProducts(ProductIdRequest request,
                               io.grpc.stub.StreamObserver<ProductListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_PRODUCTS, responseObserver);
    }

    /**
     */
    public void createProduct(ProductResponse request,
                              io.grpc.stub.StreamObserver<ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_PRODUCT, responseObserver);
    }

    /**
     */
    public void updateProduct(ProductResponse request,
                              io.grpc.stub.StreamObserver<ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PRODUCT, responseObserver);
    }

    /**
     */
    public void deleteProduct(ProductIdRequest request,
                              io.grpc.stub.StreamObserver<ProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_PRODUCT, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_PRODUCTS_INCLUDING_ANIMAL_REG_ID,
            asyncUnaryCall(
              new MethodHandlers<
                      AnimalIdRequest,
                      ProductListResponse>(
                  this, METHODID_GET_PRODUCTS_INCLUDING_ANIMAL_REG_ID)))
          .addMethod(
            METHOD_GET_PRODUCT_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                      ProductIdRequest,
                      ProductResponse>(
                  this, METHODID_GET_PRODUCT_BY_ID)))
          .addMethod(
            METHOD_GET_ALL_PRODUCTS,
            asyncUnaryCall(
              new MethodHandlers<
                      ProductIdRequest,
                      ProductListResponse>(
                  this, METHODID_GET_ALL_PRODUCTS)))
          .addMethod(
            METHOD_CREATE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                      ProductResponse,
                      ProductResponse>(
                  this, METHODID_CREATE_PRODUCT)))
          .addMethod(
            METHOD_UPDATE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                      ProductResponse,
                      ProductResponse>(
                  this, METHODID_UPDATE_PRODUCT)))
          .addMethod(
            METHOD_DELETE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                      ProductIdRequest,
                      ProductResponse>(
                  this, METHODID_DELETE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractStub<ProductServiceStub> {
    private ProductServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ProductServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProductsIncludingAnimalRegId(AnimalIdRequest request,
                                                io.grpc.stub.StreamObserver<ProductListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS_INCLUDING_ANIMAL_REG_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductById(ProductIdRequest request,
                               io.grpc.stub.StreamObserver<ProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllProducts(ProductIdRequest request,
                               io.grpc.stub.StreamObserver<ProductListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_PRODUCTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProduct(ProductResponse request,
                              io.grpc.stub.StreamObserver<ProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(ProductResponse request,
                              io.grpc.stub.StreamObserver<ProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(ProductIdRequest request,
                              io.grpc.stub.StreamObserver<ProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_PRODUCT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ProductServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ProductListResponse getProductsIncludingAnimalRegId(AnimalIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCTS_INCLUDING_ANIMAL_REG_ID, getCallOptions(), request);
    }

    /**
     */
    public ProductResponse getProductById(ProductIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCT_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public ProductListResponse getAllProducts(ProductIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_PRODUCTS, getCallOptions(), request);
    }

    /**
     */
    public ProductResponse createProduct(ProductResponse request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public ProductResponse updateProduct(ProductResponse request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public ProductResponse deleteProduct(ProductIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_PRODUCT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ProductServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductListResponse> getProductsIncludingAnimalRegId(
        AnimalIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS_INCLUDING_ANIMAL_REG_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductResponse> getProductById(
        ProductIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductListResponse> getAllProducts(
        ProductIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_PRODUCTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductResponse> createProduct(
        ProductResponse request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductResponse> updateProduct(
        ProductResponse request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductResponse> deleteProduct(
        ProductIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_PRODUCT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCTS_INCLUDING_ANIMAL_REG_ID = 0;
  private static final int METHODID_GET_PRODUCT_BY_ID = 1;
  private static final int METHODID_GET_ALL_PRODUCTS = 2;
  private static final int METHODID_CREATE_PRODUCT = 3;
  private static final int METHODID_UPDATE_PRODUCT = 4;
  private static final int METHODID_DELETE_PRODUCT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCTS_INCLUDING_ANIMAL_REG_ID:
          serviceImpl.getProductsIncludingAnimalRegId((AnimalIdRequest) request,
              (io.grpc.stub.StreamObserver<ProductListResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_BY_ID:
          serviceImpl.getProductById((ProductIdRequest) request,
              (io.grpc.stub.StreamObserver<ProductResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_PRODUCTS:
          serviceImpl.getAllProducts((ProductIdRequest) request,
              (io.grpc.stub.StreamObserver<ProductListResponse>) responseObserver);
          break;
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((ProductResponse) request,
              (io.grpc.stub.StreamObserver<ProductResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((ProductResponse) request,
              (io.grpc.stub.StreamObserver<ProductResponse>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((ProductIdRequest) request,
              (io.grpc.stub.StreamObserver<ProductResponse>) responseObserver);
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

  private static final class ProductServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Slaghterhouse.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceDescriptorSupplier())
              .addMethod(METHOD_GET_PRODUCTS_INCLUDING_ANIMAL_REG_ID)
              .addMethod(METHOD_GET_PRODUCT_BY_ID)
              .addMethod(METHOD_GET_ALL_PRODUCTS)
              .addMethod(METHOD_CREATE_PRODUCT)
              .addMethod(METHOD_UPDATE_PRODUCT)
              .addMethod(METHOD_DELETE_PRODUCT)
              .build();
        }
      }
    }
    return result;
  }
}
