/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(ReportCreativeGetV2FilteringLandingTypes.Adapter.class)
public enum ReportCreativeGetV2FilteringLandingTypes {
  
  AWEME("AWEME"),
  
  APP("APP"),
  
  SHOP("SHOP"),
  
  QUICK_APP("QUICK_APP"),
  
  LINK("LINK"),
  
  DPA("DPA"),
  
  ARTICLE("ARTICLE"),
  
  GOODS("GOODS"),
  
  STORE("STORE"),
  
  LIVE("LIVE");

  private String value;

  ReportCreativeGetV2FilteringLandingTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2FilteringLandingTypes fromValue(String value) {
    for (ReportCreativeGetV2FilteringLandingTypes b : ReportCreativeGetV2FilteringLandingTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2FilteringLandingTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2FilteringLandingTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2FilteringLandingTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2FilteringLandingTypes.fromValue(value);
    }
  }
}

