/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
@JsonAdapter(ToolsPlayableListGetV2PlayableSource.Adapter.class)
public enum ToolsPlayableListGetV2PlayableSource {
  
  DIRECT_PLAYABLE("DIRECT_PLAYABLE"),
  
  EXCLUDE_DIRECT("EXCLUDE_DIRECT");

  private String value;

  ToolsPlayableListGetV2PlayableSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPlayableListGetV2PlayableSource fromValue(String value) {
    for (ToolsPlayableListGetV2PlayableSource b : ToolsPlayableListGetV2PlayableSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsPlayableListGetV2PlayableSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPlayableListGetV2PlayableSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPlayableListGetV2PlayableSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPlayableListGetV2PlayableSource.fromValue(value);
    }
  }
}

