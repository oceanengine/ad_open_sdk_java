/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
@JsonAdapter(ToolsRubeexGetV2FilteringProjectVersionLifecycle.Adapter.class)
public enum ToolsRubeexGetV2FilteringProjectVersionLifecycle {
  
  LAUNCHED("LAUNCHED"),
  
  EXPORTED("EXPORTED"),
  
  AUDIT_FAIL("AUDIT_FAIL"),
  
  AUDIT_SUCCESS("AUDIT_SUCCESS"),
  
  RELAT_PLAN("RELAT_PLAN"),
  
  SYNC_AD("SYNC_AD");

  private String value;

  ToolsRubeexGetV2FilteringProjectVersionLifecycle(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsRubeexGetV2FilteringProjectVersionLifecycle fromValue(String value) {
    for (ToolsRubeexGetV2FilteringProjectVersionLifecycle b : ToolsRubeexGetV2FilteringProjectVersionLifecycle.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsRubeexGetV2FilteringProjectVersionLifecycle> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsRubeexGetV2FilteringProjectVersionLifecycle enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsRubeexGetV2FilteringProjectVersionLifecycle read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsRubeexGetV2FilteringProjectVersionLifecycle.fromValue(value);
    }
  }
}

