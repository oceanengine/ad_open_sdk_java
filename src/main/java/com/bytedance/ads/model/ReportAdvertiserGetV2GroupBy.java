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
@JsonAdapter(ReportAdvertiserGetV2GroupBy.Adapter.class)
public enum ReportAdvertiserGetV2GroupBy {
  
  AC("STAT_GROUP_BY_AC"),
  
  CAMPAIGN_TYPE("STAT_GROUP_BY_CAMPAIGN_TYPE"),
  
  GENDER("STAT_GROUP_BY_GENDER"),
  
  INVENTORY("STAT_GROUP_BY_INVENTORY"),
  
  CREATIVE_MATERIAL_MODE("STAT_GROUP_BY_CREATIVE_MATERIAL_MODE"),
  
  AGE("STAT_GROUP_BY_AGE"),
  
  FIELD_ID("STAT_GROUP_BY_FIELD_ID"),
  
  PLATFORM("STAT_GROUP_BY_PLATFORM"),
  
  LANDING_TYPE("STAT_GROUP_BY_LANDING_TYPE"),
  
  CREATIVE_COMPONENT_ID("STAT_GROUP_BY_CREATIVE_COMPONENT_ID"),
  
  IMAGE_MODE("STAT_GROUP_BY_IMAGE_MODE"),
  
  FIELD_STAT_TIME("STAT_GROUP_BY_FIELD_STAT_TIME"),
  
  PRICING_CATEGORY("STAT_GROUP_BY_PRICING_CATEGORY"),
  
  CITY_NAME("STAT_GROUP_BY_CITY_NAME"),
  
  MATERIAL_ID("STAT_GROUP_BY_MATERIAL_ID"),
  
  EXTERNAL_ACTION("STAT_GROUP_BY_EXTERNAL_ACTION"),
  
  PROVINCE_NAME("STAT_GROUP_BY_PROVINCE_NAME"),
  
  PRICING("STAT_GROUP_BY_PRICING");

  private String value;

  ReportAdvertiserGetV2GroupBy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdvertiserGetV2GroupBy fromValue(String value) {
    for (ReportAdvertiserGetV2GroupBy b : ReportAdvertiserGetV2GroupBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdvertiserGetV2GroupBy> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdvertiserGetV2GroupBy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdvertiserGetV2GroupBy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdvertiserGetV2GroupBy.fromValue(value);
    }
  }
}

