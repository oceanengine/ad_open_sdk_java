/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
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
@JsonAdapter(ToolsAbTestListGetV2FilterStatus.Adapter.class)
public enum ToolsAbTestListGetV2FilterStatus {
  
  CREATED("CREATED"),
  
  FAILED("FAILED"),
  
  FINISH("FINISH"),
  
  PROCESSING("PROCESSING");

  private String value;

  ToolsAbTestListGetV2FilterStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAbTestListGetV2FilterStatus fromValue(String value) {
    for (ToolsAbTestListGetV2FilterStatus b : ToolsAbTestListGetV2FilterStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAbTestListGetV2FilterStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAbTestListGetV2FilterStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAbTestListGetV2FilterStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAbTestListGetV2FilterStatus.fromValue(value);
    }
  }
}

