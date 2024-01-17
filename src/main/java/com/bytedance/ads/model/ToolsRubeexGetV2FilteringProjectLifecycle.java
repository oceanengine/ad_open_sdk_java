/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(ToolsRubeexGetV2FilteringProjectLifecycle.Adapter.class)
public enum ToolsRubeexGetV2FilteringProjectLifecycle {
  
  LAUNCHED("LAUNCHED"),
  
  AUDIT_SUCCESS("AUDIT_SUCCESS"),
  
  EDITING("EDITING"),
  
  RELAT_PLAN("RELAT_PLAN"),
  
  SYNC_AD("SYNC_AD");

  private String value;

  ToolsRubeexGetV2FilteringProjectLifecycle(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsRubeexGetV2FilteringProjectLifecycle fromValue(String value) {
    for (ToolsRubeexGetV2FilteringProjectLifecycle b : ToolsRubeexGetV2FilteringProjectLifecycle.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsRubeexGetV2FilteringProjectLifecycle> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsRubeexGetV2FilteringProjectLifecycle enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsRubeexGetV2FilteringProjectLifecycle read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsRubeexGetV2FilteringProjectLifecycle.fromValue(value);
    }
  }
}

