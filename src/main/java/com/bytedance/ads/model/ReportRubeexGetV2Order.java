/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(ReportRubeexGetV2Order.Adapter.class)
public enum ReportRubeexGetV2Order {
  
  DESC("DESC"),
  
  ASC("ASC");

  private String value;

  ReportRubeexGetV2Order(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportRubeexGetV2Order fromValue(String value) {
    for (ReportRubeexGetV2Order b : ReportRubeexGetV2Order.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportRubeexGetV2Order> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportRubeexGetV2Order enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportRubeexGetV2Order read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportRubeexGetV2Order.fromValue(value);
    }
  }
}

