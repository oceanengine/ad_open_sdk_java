/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(ToolsEventConvertOptimizedGoalGetV30MarketingPurpose.Adapter.class)
public enum ToolsEventConvertOptimizedGoalGetV30MarketingPurpose {
  
  ACKNOWLEDGE("ACKNOWLEDGE"),
  
  CONVERSION("CONVERSION"),
  
  INTENTION("INTENTION");

  private String value;

  ToolsEventConvertOptimizedGoalGetV30MarketingPurpose(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEventConvertOptimizedGoalGetV30MarketingPurpose fromValue(String value) {
    for (ToolsEventConvertOptimizedGoalGetV30MarketingPurpose b : ToolsEventConvertOptimizedGoalGetV30MarketingPurpose.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEventConvertOptimizedGoalGetV30MarketingPurpose> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEventConvertOptimizedGoalGetV30MarketingPurpose enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEventConvertOptimizedGoalGetV30MarketingPurpose read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEventConvertOptimizedGoalGetV30MarketingPurpose.fromValue(value);
    }
  }
}

