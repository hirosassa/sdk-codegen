package com.google.looker.server.rtl.ping;

import com.google.looker.server.rtl.ping.PingServiceGrpc.PingServiceImplBase;
import io.grpc.stub.StreamObserver;

public class PingServiceImpl extends PingServiceImplBase {

  @Override
  public void ping(PingRequest request, StreamObserver<PingResponse> responseObserver) {
    responseObserver.onNext(PingResponse.newBuilder().setActive(true).build());
    responseObserver.onCompleted();
  }
}
