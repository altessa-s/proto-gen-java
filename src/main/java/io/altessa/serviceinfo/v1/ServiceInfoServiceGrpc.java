package io.altessa.serviceinfo.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provides runtime information about the service instance. Implementations
 * MUST treat `GetServiceInfo` as idempotent and side-effect-free; it is safe to call
 * from health probes and load balancers, and safe to expose via gRPC
 * reflection.
 * Registration order matters in some setups: register
 * `ServiceInfoService` before gRPC reflection so reflection-based
 * tooling (grpcurl, Postman, evans) can discover the method without an
 * extra `.proto` import.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: io/altessa/serviceinfo/v1/serviceinfo_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceInfoServiceGrpc {

  private ServiceInfoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.altessa.serviceinfo.v1.ServiceInfoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.altessa.serviceinfo.v1.GetServiceInfoRequest,
      io.altessa.serviceinfo.v1.GetServiceInfoResponse> getGetServiceInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceInfo",
      requestType = io.altessa.serviceinfo.v1.GetServiceInfoRequest.class,
      responseType = io.altessa.serviceinfo.v1.GetServiceInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.altessa.serviceinfo.v1.GetServiceInfoRequest,
      io.altessa.serviceinfo.v1.GetServiceInfoResponse> getGetServiceInfoMethod() {
    io.grpc.MethodDescriptor<io.altessa.serviceinfo.v1.GetServiceInfoRequest, io.altessa.serviceinfo.v1.GetServiceInfoResponse> getGetServiceInfoMethod;
    if ((getGetServiceInfoMethod = ServiceInfoServiceGrpc.getGetServiceInfoMethod) == null) {
      synchronized (ServiceInfoServiceGrpc.class) {
        if ((getGetServiceInfoMethod = ServiceInfoServiceGrpc.getGetServiceInfoMethod) == null) {
          ServiceInfoServiceGrpc.getGetServiceInfoMethod = getGetServiceInfoMethod =
              io.grpc.MethodDescriptor.<io.altessa.serviceinfo.v1.GetServiceInfoRequest, io.altessa.serviceinfo.v1.GetServiceInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.altessa.serviceinfo.v1.GetServiceInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.altessa.serviceinfo.v1.GetServiceInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceInfoServiceMethodDescriptorSupplier("GetServiceInfo"))
              .build();
        }
      }
    }
    return getGetServiceInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceInfoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceInfoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceInfoServiceStub>() {
        @java.lang.Override
        public ServiceInfoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceInfoServiceStub(channel, callOptions);
        }
      };
    return ServiceInfoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceInfoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceInfoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceInfoServiceBlockingStub>() {
        @java.lang.Override
        public ServiceInfoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceInfoServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceInfoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceInfoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceInfoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceInfoServiceFutureStub>() {
        @java.lang.Override
        public ServiceInfoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceInfoServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceInfoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provides runtime information about the service instance. Implementations
   * MUST treat `GetServiceInfo` as idempotent and side-effect-free; it is safe to call
   * from health probes and load balancers, and safe to expose via gRPC
   * reflection.
   * Registration order matters in some setups: register
   * `ServiceInfoService` before gRPC reflection so reflection-based
   * tooling (grpcurl, Postman, evans) can discover the method without an
   * extra `.proto` import.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the current `ServiceInfo` snapshot for the instance handling
     * the call. Cheap — implementations SHOULD compute the response from
     * cached values and only re-evaluate time-shaped fields (`uptime`,
     * leadership state) on demand.
     * </pre>
     */
    default void getServiceInfo(io.altessa.serviceinfo.v1.GetServiceInfoRequest request,
        io.grpc.stub.StreamObserver<io.altessa.serviceinfo.v1.GetServiceInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServiceInfoService.
   * <pre>
   * Provides runtime information about the service instance. Implementations
   * MUST treat `GetServiceInfo` as idempotent and side-effect-free; it is safe to call
   * from health probes and load balancers, and safe to expose via gRPC
   * reflection.
   * Registration order matters in some setups: register
   * `ServiceInfoService` before gRPC reflection so reflection-based
   * tooling (grpcurl, Postman, evans) can discover the method without an
   * extra `.proto` import.
   * </pre>
   */
  public static abstract class ServiceInfoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServiceInfoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServiceInfoService.
   * <pre>
   * Provides runtime information about the service instance. Implementations
   * MUST treat `GetServiceInfo` as idempotent and side-effect-free; it is safe to call
   * from health probes and load balancers, and safe to expose via gRPC
   * reflection.
   * Registration order matters in some setups: register
   * `ServiceInfoService` before gRPC reflection so reflection-based
   * tooling (grpcurl, Postman, evans) can discover the method without an
   * extra `.proto` import.
   * </pre>
   */
  public static final class ServiceInfoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServiceInfoServiceStub> {
    private ServiceInfoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceInfoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceInfoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the current `ServiceInfo` snapshot for the instance handling
     * the call. Cheap — implementations SHOULD compute the response from
     * cached values and only re-evaluate time-shaped fields (`uptime`,
     * leadership state) on demand.
     * </pre>
     */
    public void getServiceInfo(io.altessa.serviceinfo.v1.GetServiceInfoRequest request,
        io.grpc.stub.StreamObserver<io.altessa.serviceinfo.v1.GetServiceInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServiceInfoService.
   * <pre>
   * Provides runtime information about the service instance. Implementations
   * MUST treat `GetServiceInfo` as idempotent and side-effect-free; it is safe to call
   * from health probes and load balancers, and safe to expose via gRPC
   * reflection.
   * Registration order matters in some setups: register
   * `ServiceInfoService` before gRPC reflection so reflection-based
   * tooling (grpcurl, Postman, evans) can discover the method without an
   * extra `.proto` import.
   * </pre>
   */
  public static final class ServiceInfoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServiceInfoServiceBlockingStub> {
    private ServiceInfoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceInfoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceInfoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the current `ServiceInfo` snapshot for the instance handling
     * the call. Cheap — implementations SHOULD compute the response from
     * cached values and only re-evaluate time-shaped fields (`uptime`,
     * leadership state) on demand.
     * </pre>
     */
    public io.altessa.serviceinfo.v1.GetServiceInfoResponse getServiceInfo(io.altessa.serviceinfo.v1.GetServiceInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServiceInfoService.
   * <pre>
   * Provides runtime information about the service instance. Implementations
   * MUST treat `GetServiceInfo` as idempotent and side-effect-free; it is safe to call
   * from health probes and load balancers, and safe to expose via gRPC
   * reflection.
   * Registration order matters in some setups: register
   * `ServiceInfoService` before gRPC reflection so reflection-based
   * tooling (grpcurl, Postman, evans) can discover the method without an
   * extra `.proto` import.
   * </pre>
   */
  public static final class ServiceInfoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServiceInfoServiceFutureStub> {
    private ServiceInfoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceInfoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceInfoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the current `ServiceInfo` snapshot for the instance handling
     * the call. Cheap — implementations SHOULD compute the response from
     * cached values and only re-evaluate time-shaped fields (`uptime`,
     * leadership state) on demand.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.altessa.serviceinfo.v1.GetServiceInfoResponse> getServiceInfo(
        io.altessa.serviceinfo.v1.GetServiceInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SERVICE_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SERVICE_INFO:
          serviceImpl.getServiceInfo((io.altessa.serviceinfo.v1.GetServiceInfoRequest) request,
              (io.grpc.stub.StreamObserver<io.altessa.serviceinfo.v1.GetServiceInfoResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetServiceInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.altessa.serviceinfo.v1.GetServiceInfoRequest,
              io.altessa.serviceinfo.v1.GetServiceInfoResponse>(
                service, METHODID_GET_SERVICE_INFO)))
        .build();
  }

  private static abstract class ServiceInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceInfoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.altessa.serviceinfo.v1.ServiceInfoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceInfoService");
    }
  }

  private static final class ServiceInfoServiceFileDescriptorSupplier
      extends ServiceInfoServiceBaseDescriptorSupplier {
    ServiceInfoServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceInfoServiceMethodDescriptorSupplier
      extends ServiceInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServiceInfoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServiceInfoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceInfoServiceFileDescriptorSupplier())
              .addMethod(getGetServiceInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
