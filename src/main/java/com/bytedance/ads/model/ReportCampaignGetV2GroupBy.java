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
@JsonAdapter(ReportCampaignGetV2GroupBy.Adapter.class)
public enum ReportCampaignGetV2GroupBy {
  
  MATERIAL_ID("STAT_GROUP_BY_MATERIAL_ID"),
  
  AGE("STAT_GROUP_BY_AGE"),
  
  CITY_NAME("STAT_GROUP_BY_CITY_NAME"),
  
  AC("STAT_GROUP_BY_AC"),
  
  PRICING("STAT_GROUP_BY_PRICING"),
  
  EXTERNAL_ACTION("STAT_GROUP_BY_EXTERNAL_ACTION"),
  
  PROVINCE_NAME("STAT_GROUP_BY_PROVINCE_NAME"),
  
  CREATIVE_MATERIAL_MODE("STAT_GROUP_BY_CREATIVE_MATERIAL_MODE"),
  
  LANDING_TYPE("STAT_GROUP_BY_LANDING_TYPE"),
  
  PLATFORM("STAT_GROUP_BY_PLATFORM"),
  
  FIELD_STAT_TIME("STAT_GROUP_BY_FIELD_STAT_TIME"),
  
  INVENTORY("STAT_GROUP_BY_INVENTORY"),
  
  IMAGE_MODE("STAT_GROUP_BY_IMAGE_MODE"),
  
  FIELD_ID("STAT_GROUP_BY_FIELD_ID"),
  
  CAMPAIGN_TYPE("STAT_GROUP_BY_CAMPAIGN_TYPE"),
  
  GENDER("STAT_GROUP_BY_GENDER"),
  
  CREATIVE_COMPONENT_ID("STAT_GROUP_BY_CREATIVE_COMPONENT_ID"),
  
  PRICING_CATEGORY("STAT_GROUP_BY_PRICING_CATEGORY");

  private String value;

  ReportCampaignGetV2GroupBy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCampaignGetV2GroupBy fromValue(String value) {
    for (ReportCampaignGetV2GroupBy b : ReportCampaignGetV2GroupBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCampaignGetV2GroupBy> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCampaignGetV2GroupBy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCampaignGetV2GroupBy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCampaignGetV2GroupBy.fromValue(value);
    }
  }
}

