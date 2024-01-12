/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
@JsonAdapter(ReportAdvertiserGetV2DataListLandingType.Adapter.class)
public enum ReportAdvertiserGetV2DataListLandingType {
  
  QUICK_APP("QUICK_APP"),
  
  ARTICLE("ARTICLE"),
  
  SHOP("SHOP"),
  
  GOODS("GOODS"),
  
  LINK("LINK"),
  
  AWEME("AWEME"),
  
  LIVE("LIVE"),
  
  STORE("STORE"),
  
  APP("APP"),
  
  DPA("DPA");

  private String value;

  ReportAdvertiserGetV2DataListLandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdvertiserGetV2DataListLandingType fromValue(String value) {
    for (ReportAdvertiserGetV2DataListLandingType b : ReportAdvertiserGetV2DataListLandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdvertiserGetV2DataListLandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdvertiserGetV2DataListLandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdvertiserGetV2DataListLandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdvertiserGetV2DataListLandingType.fromValue(value);
    }
  }
}

