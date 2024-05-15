package org.example;

import com.google.cloud.spanner.Spanner;
import com.google.cloud.spanner.SpannerOptions;
import io.grpc.NameResolverProvider;
import io.grpc.NameResolverRegistry;

public class Main {
  public static void main(String[] args) throws Exception {
    NameResolverProvider c2pProvider =
      (NameResolverProvider) Class.forName("io.grpc.googleapis.GoogleCloudToProdNameResolverProvider")
        .getDeclaredConstructor().newInstance();

    NameResolverRegistry.getDefaultRegistry().register(c2pProvider);

    SpannerOptions options = SpannerOptions.newBuilder().build();
    Spanner spanner = options.getService();
  }
}
