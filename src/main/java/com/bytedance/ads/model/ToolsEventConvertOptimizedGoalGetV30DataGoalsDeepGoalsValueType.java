/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType.Adapter.class)
public enum ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType {
  
  DISABLED("Disabled"),
  
  DISCRIMINATEBYGROUP("DiscriminateByGroup"),
  
  DYNAMICVALUE("DynamicValue"),
  
  FIXED("Fixed");

  private String value;

  ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType fromValue(String value) {
    for (ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType b : ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType.fromValue(value);
    }
  }
}

