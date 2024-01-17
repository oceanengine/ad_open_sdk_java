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
@JsonAdapter(ToolsAwemeAuthCancelV2AuthType.Adapter.class)
public enum ToolsAwemeAuthCancelV2AuthType {
  
  AWEME_ACCOUNT("AWEME_ACCOUNT"),
  
  LIVE_ACCOUNT("LIVE_ACCOUNT"),
  
  VIDEO_ITEM("VIDEO_ITEM");

  private String value;

  ToolsAwemeAuthCancelV2AuthType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAwemeAuthCancelV2AuthType fromValue(String value) {
    for (ToolsAwemeAuthCancelV2AuthType b : ToolsAwemeAuthCancelV2AuthType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAwemeAuthCancelV2AuthType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAwemeAuthCancelV2AuthType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAwemeAuthCancelV2AuthType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAwemeAuthCancelV2AuthType.fromValue(value);
    }
  }
}

