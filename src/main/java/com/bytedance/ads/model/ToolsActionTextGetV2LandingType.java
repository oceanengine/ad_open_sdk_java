/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
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
@JsonAdapter(ToolsActionTextGetV2LandingType.Adapter.class)
public enum ToolsActionTextGetV2LandingType {
  
  DPA("DPA"),
  
  ARTICLE("ARTICLE"),
  
  QUICK_APP("QUICK_APP"),
  
  GOODS("GOODS"),
  
  SHOP("SHOP"),
  
  AWEME("AWEME"),
  
  APP("APP"),
  
  LIVE("LIVE"),
  
  STORE("STORE"),
  
  LINK("LINK"),
  
  BRAND_EXTERNAL("BRAND_EXTERNAL");

  private String value;

  ToolsActionTextGetV2LandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsActionTextGetV2LandingType fromValue(String value) {
    for (ToolsActionTextGetV2LandingType b : ToolsActionTextGetV2LandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsActionTextGetV2LandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsActionTextGetV2LandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsActionTextGetV2LandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsActionTextGetV2LandingType.fromValue(value);
    }
  }
}

