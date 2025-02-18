/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
@JsonAdapter(ReportCreativeGetV2FilteringCampaignTypes.Adapter.class)
public enum ReportCreativeGetV2FilteringCampaignTypes {
  
  SEARCH("SEARCH"),
  
  CONTENT("CONTENT"),
  
  FEED("FEED");

  private String value;

  ReportCreativeGetV2FilteringCampaignTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2FilteringCampaignTypes fromValue(String value) {
    for (ReportCreativeGetV2FilteringCampaignTypes b : ReportCreativeGetV2FilteringCampaignTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2FilteringCampaignTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2FilteringCampaignTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2FilteringCampaignTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2FilteringCampaignTypes.fromValue(value);
    }
  }
}

