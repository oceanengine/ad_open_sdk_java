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
@JsonAdapter(ReportAudienceProvinceV2IdType.Adapter.class)
public enum ReportAudienceProvinceV2IdType {
  
  ADVERTISER("AUDIENCE_STAT_ID_TYPE_ADVERTISER"),
  
  CAMPAIGN("AUDIENCE_STAT_ID_TYPE_CAMPAIGN"),
  
  AD("AUDIENCE_STAT_ID_TYPE_AD");

  private String value;

  ReportAudienceProvinceV2IdType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAudienceProvinceV2IdType fromValue(String value) {
    for (ReportAudienceProvinceV2IdType b : ReportAudienceProvinceV2IdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAudienceProvinceV2IdType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAudienceProvinceV2IdType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAudienceProvinceV2IdType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAudienceProvinceV2IdType.fromValue(value);
    }
  }
}

