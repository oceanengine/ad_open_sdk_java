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
@JsonAdapter(ToolsIsSupportUniversalGetV2LandingType.Adapter.class)
public enum ToolsIsSupportUniversalGetV2LandingType {
  
  APP("APP"),
  
  ARTICLE("ARTICLE"),
  
  AWEME("AWEME"),
  
  DPA("DPA"),
  
  GOODS("GOODS"),
  
  LINK("LINK"),
  
  QUICK_APP("QUICK_APP"),
  
  SHOP("SHOP");

  private String value;

  ToolsIsSupportUniversalGetV2LandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsIsSupportUniversalGetV2LandingType fromValue(String value) {
    for (ToolsIsSupportUniversalGetV2LandingType b : ToolsIsSupportUniversalGetV2LandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsIsSupportUniversalGetV2LandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsIsSupportUniversalGetV2LandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsIsSupportUniversalGetV2LandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsIsSupportUniversalGetV2LandingType.fromValue(value);
    }
  }
}

