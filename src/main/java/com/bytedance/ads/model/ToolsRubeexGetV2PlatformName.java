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
@JsonAdapter(ToolsRubeexGetV2PlatformName.Adapter.class)
public enum ToolsRubeexGetV2PlatformName {
  
  POWERPLAYABLE("POWERPLAYABLE"),
  
  CLAB_EDITOR("CLAB_EDITOR"),
  
  PLAYABLE_TEMPLATE("PLAYABLE_TEMPLATE"),
  
  LIGHT_PLAYABLE("LIGHT_PLAYABLE"),
  
  RUBIX("RUBIX"),
  
  AD_PLATFORM("AD_PLATFORM");

  private String value;

  ToolsRubeexGetV2PlatformName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsRubeexGetV2PlatformName fromValue(String value) {
    for (ToolsRubeexGetV2PlatformName b : ToolsRubeexGetV2PlatformName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsRubeexGetV2PlatformName> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsRubeexGetV2PlatformName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsRubeexGetV2PlatformName read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsRubeexGetV2PlatformName.fromValue(value);
    }
  }
}

