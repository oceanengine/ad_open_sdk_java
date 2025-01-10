/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.33
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
@JsonAdapter(LocalReportAccountGetV30FilteringCampaignType.Adapter.class)
public enum LocalReportAccountGetV30FilteringCampaignType {
  
  GENERAL("GENERAL"),
  
  SEARCHING("SEARCHING");

  private String value;

  LocalReportAccountGetV30FilteringCampaignType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalReportAccountGetV30FilteringCampaignType fromValue(String value) {
    for (LocalReportAccountGetV30FilteringCampaignType b : LocalReportAccountGetV30FilteringCampaignType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalReportAccountGetV30FilteringCampaignType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalReportAccountGetV30FilteringCampaignType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalReportAccountGetV30FilteringCampaignType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalReportAccountGetV30FilteringCampaignType.fromValue(value);
    }
  }
}
