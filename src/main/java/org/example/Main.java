package org.example;

import com.google.cloud.spanner.Spanner;
import com.google.cloud.spanner.SpannerOptions;

public class Main {
  public static void main(String[] args) throws Exception {
    SpannerOptions options = SpannerOptions.newBuilder().build();
    Spanner spanner = options.getService();
  }
}
