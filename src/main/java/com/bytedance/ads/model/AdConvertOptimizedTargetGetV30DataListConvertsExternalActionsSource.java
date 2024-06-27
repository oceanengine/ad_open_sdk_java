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
@JsonAdapter(AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsSource.Adapter.class)
public enum AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsSource {
  
  CONFIG("SOURCE_CONFIG"),
  
  METEOR("SOURCE_METEOR"),
  
  TETRIS("SOURCE_TETRIS");

  private String value;

  AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsSource fromValue(String value) {
    for (AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsSource b : AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsSource.fromValue(value);
    }
  }
}

