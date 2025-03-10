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
@JsonAdapter(ReportCampaignGetV2DataListRealRecallMatchType.Adapter.class)
public enum ReportCampaignGetV2DataListRealRecallMatchType {
  
  PHRASE("PHRASE"),
  
  PRECISION("PRECISION"),
  
  EXTENSIVE("EXTENSIVE");

  private String value;

  ReportCampaignGetV2DataListRealRecallMatchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCampaignGetV2DataListRealRecallMatchType fromValue(String value) {
    for (ReportCampaignGetV2DataListRealRecallMatchType b : ReportCampaignGetV2DataListRealRecallMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCampaignGetV2DataListRealRecallMatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCampaignGetV2DataListRealRecallMatchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCampaignGetV2DataListRealRecallMatchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCampaignGetV2DataListRealRecallMatchType.fromValue(value);
    }
  }
}

