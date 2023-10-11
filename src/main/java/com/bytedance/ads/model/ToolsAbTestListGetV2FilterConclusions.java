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
@JsonAdapter(ToolsAbTestListGetV2FilterConclusions.Adapter.class)
public enum ToolsAbTestListGetV2FilterConclusions {
  
  FAILED("FAILED"),
  
  INSUFFICIENT("INSUFFICIENT"),
  
  NOT_START("NOT_START"),
  
  OBVIOUS("OBVIOUS"),
  
  TMP_OBVIOUS("TMP_OBVIOUS");

  private String value;

  ToolsAbTestListGetV2FilterConclusions(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAbTestListGetV2FilterConclusions fromValue(String value) {
    for (ToolsAbTestListGetV2FilterConclusions b : ToolsAbTestListGetV2FilterConclusions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAbTestListGetV2FilterConclusions> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAbTestListGetV2FilterConclusions enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAbTestListGetV2FilterConclusions read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAbTestListGetV2FilterConclusions.fromValue(value);
    }
  }
}

