/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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
@JsonAdapter(CampaignGetV2FilteringSmartBidType.Adapter.class)
public enum CampaignGetV2FilteringSmartBidType {
  
  JIJIN("JIJIN"),
  
  BAOSHOU("BAOSHOU"),
  
  MAXCV("MAXCV"),
  
  AWEME_LITE_PACING("AWEME_LITE_PACING"),
  
  CUSTOM("CUSTOM"),
  
  GUARANTEED_SHOW("GUARANTEED_SHOW"),
  
  MAX_CONVERSION("MAX_CONVERSION"),
  
  GD_PROMOTE("GD_PROMOTE"),
  
  LITE_PACING("LITE_PACING"),
  
  SMART_BID_NO_BID("SMART_BID_NO_BID");

  private String value;

  CampaignGetV2FilteringSmartBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignGetV2FilteringSmartBidType fromValue(String value) {
    for (CampaignGetV2FilteringSmartBidType b : CampaignGetV2FilteringSmartBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CampaignGetV2FilteringSmartBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignGetV2FilteringSmartBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignGetV2FilteringSmartBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignGetV2FilteringSmartBidType.fromValue(value);
    }
  }
}

