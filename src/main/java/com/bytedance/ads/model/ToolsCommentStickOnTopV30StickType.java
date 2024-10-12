/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(ToolsCommentStickOnTopV30StickType.Adapter.class)
public enum ToolsCommentStickOnTopV30StickType {
  
  CANCEL_STICK("CANCEL_STICK"),
  
  STICK_ON_TOP("STICK_ON_TOP");

  private String value;

  ToolsCommentStickOnTopV30StickType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsCommentStickOnTopV30StickType fromValue(String value) {
    for (ToolsCommentStickOnTopV30StickType b : ToolsCommentStickOnTopV30StickType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsCommentStickOnTopV30StickType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsCommentStickOnTopV30StickType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsCommentStickOnTopV30StickType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsCommentStickOnTopV30StickType.fromValue(value);
    }
  }
}

