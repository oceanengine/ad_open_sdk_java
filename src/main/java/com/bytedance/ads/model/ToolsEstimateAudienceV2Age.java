/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(ToolsEstimateAudienceV2Age.Adapter.class)
public enum ToolsEstimateAudienceV2Age {
  
  BETWEEN_24_30("AGE_BETWEEN_24_30"),
  
  BELOW_18("AGE_BELOW_18"),
  
  ABOVE_50("AGE_ABOVE_50"),
  
  BETWEEN_18_23("AGE_BETWEEN_18_23"),
  
  BETWEEN_41_49("AGE_BETWEEN_41_49"),
  
  BETWEEN_31_40("AGE_BETWEEN_31_40");

  private String value;

  ToolsEstimateAudienceV2Age(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEstimateAudienceV2Age fromValue(String value) {
    for (ToolsEstimateAudienceV2Age b : ToolsEstimateAudienceV2Age.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEstimateAudienceV2Age> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEstimateAudienceV2Age enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEstimateAudienceV2Age read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEstimateAudienceV2Age.fromValue(value);
    }
  }
}

