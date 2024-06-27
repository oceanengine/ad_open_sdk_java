/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(ToolsCommentMetricsGetV30FilteringHideStatus.Adapter.class)
public enum ToolsCommentMetricsGetV30FilteringHideStatus {
  
  ALL("ALL"),
  
  HIDE("HIDE"),
  
  NOT_HIDE("NOT_HIDE");

  private String value;

  ToolsCommentMetricsGetV30FilteringHideStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsCommentMetricsGetV30FilteringHideStatus fromValue(String value) {
    for (ToolsCommentMetricsGetV30FilteringHideStatus b : ToolsCommentMetricsGetV30FilteringHideStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsCommentMetricsGetV30FilteringHideStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsCommentMetricsGetV30FilteringHideStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsCommentMetricsGetV30FilteringHideStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsCommentMetricsGetV30FilteringHideStatus.fromValue(value);
    }
  }
}

