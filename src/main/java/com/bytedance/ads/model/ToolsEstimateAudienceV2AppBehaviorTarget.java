/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
@JsonAdapter(ToolsEstimateAudienceV2AppBehaviorTarget.Adapter.class)
public enum ToolsEstimateAudienceV2AppBehaviorTarget {
  
  CATEGORY("CATEGORY"),
  
  NONE("NONE"),
  
  APP("APP");

  private String value;

  ToolsEstimateAudienceV2AppBehaviorTarget(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEstimateAudienceV2AppBehaviorTarget fromValue(String value) {
    for (ToolsEstimateAudienceV2AppBehaviorTarget b : ToolsEstimateAudienceV2AppBehaviorTarget.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEstimateAudienceV2AppBehaviorTarget> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEstimateAudienceV2AppBehaviorTarget enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEstimateAudienceV2AppBehaviorTarget read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEstimateAudienceV2AppBehaviorTarget.fromValue(value);
    }
  }
}

