/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(ReportBrandAgentDataV30PageType.Adapter.class)
public enum ReportBrandAgentDataV30PageType {
  
  FEED("FEED"),
  
  MALL("MALL"),
  
  OVERVIEW("OVERVIEW"),
  
  PLANTGRASS("PLANTGRASS"),
  
  SEARCH("SEARCH"),
  
  SPLASH("SPLASH");

  private String value;

  ReportBrandAgentDataV30PageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportBrandAgentDataV30PageType fromValue(String value) {
    for (ReportBrandAgentDataV30PageType b : ReportBrandAgentDataV30PageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportBrandAgentDataV30PageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportBrandAgentDataV30PageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportBrandAgentDataV30PageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportBrandAgentDataV30PageType.fromValue(value);
    }
  }
}

