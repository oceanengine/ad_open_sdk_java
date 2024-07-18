/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(ReportAdGetV2GroupBy.Adapter.class)
public enum ReportAdGetV2GroupBy {
  
  AC("STAT_GROUP_BY_AC"),
  
  AGE("STAT_GROUP_BY_AGE"),
  
  INVENTORY("STAT_GROUP_BY_INVENTORY"),
  
  PROVINCE_NAME("STAT_GROUP_BY_PROVINCE_NAME"),
  
  FIELD_STAT_TIME("STAT_GROUP_BY_FIELD_STAT_TIME"),
  
  CREATIVE_MATERIAL_MODE("STAT_GROUP_BY_CREATIVE_MATERIAL_MODE"),
  
  MATERIAL_ID("STAT_GROUP_BY_MATERIAL_ID"),
  
  LANDING_TYPE("STAT_GROUP_BY_LANDING_TYPE"),
  
  CITY_NAME("STAT_GROUP_BY_CITY_NAME"),
  
  FIELD_ID("STAT_GROUP_BY_FIELD_ID"),
  
  GENDER("STAT_GROUP_BY_GENDER"),
  
  IMAGE_MODE("STAT_GROUP_BY_IMAGE_MODE"),
  
  CREATIVE_COMPONENT_ID("STAT_GROUP_BY_CREATIVE_COMPONENT_ID"),
  
  PRICING_CATEGORY("STAT_GROUP_BY_PRICING_CATEGORY"),
  
  PLATFORM("STAT_GROUP_BY_PLATFORM"),
  
  CAMPAIGN_TYPE("STAT_GROUP_BY_CAMPAIGN_TYPE"),
  
  EXTERNAL_ACTION("STAT_GROUP_BY_EXTERNAL_ACTION"),
  
  PRICING("STAT_GROUP_BY_PRICING");

  private String value;

  ReportAdGetV2GroupBy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdGetV2GroupBy fromValue(String value) {
    for (ReportAdGetV2GroupBy b : ReportAdGetV2GroupBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdGetV2GroupBy> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdGetV2GroupBy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdGetV2GroupBy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdGetV2GroupBy.fromValue(value);
    }
  }
}

