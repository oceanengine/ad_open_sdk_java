/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(ReportRubeexGetV2FilteringDataScope.Adapter.class)
public enum ReportRubeexGetV2FilteringDataScope {
  
  ALL("ALL"),
  
  ADV("ADV");

  private String value;

  ReportRubeexGetV2FilteringDataScope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportRubeexGetV2FilteringDataScope fromValue(String value) {
    for (ReportRubeexGetV2FilteringDataScope b : ReportRubeexGetV2FilteringDataScope.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportRubeexGetV2FilteringDataScope> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportRubeexGetV2FilteringDataScope enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportRubeexGetV2FilteringDataScope read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportRubeexGetV2FilteringDataScope.fromValue(value);
    }
  }
}

