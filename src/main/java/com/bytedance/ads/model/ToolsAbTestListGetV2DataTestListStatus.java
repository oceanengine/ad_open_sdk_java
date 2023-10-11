/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
@JsonAdapter(ToolsAbTestListGetV2DataTestListStatus.Adapter.class)
public enum ToolsAbTestListGetV2DataTestListStatus {
  
  CREATED("CREATED"),
  
  FAILED("FAILED"),
  
  FINISH("FINISH"),
  
  PROCESSING("PROCESSING");

  private String value;

  ToolsAbTestListGetV2DataTestListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAbTestListGetV2DataTestListStatus fromValue(String value) {
    for (ToolsAbTestListGetV2DataTestListStatus b : ToolsAbTestListGetV2DataTestListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAbTestListGetV2DataTestListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAbTestListGetV2DataTestListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAbTestListGetV2DataTestListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAbTestListGetV2DataTestListStatus.fromValue(value);
    }
  }
}

