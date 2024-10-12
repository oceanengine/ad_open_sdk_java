/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(CampaignCreateV2SmartBidType.Adapter.class)
public enum CampaignCreateV2SmartBidType {
  
  SMART_BID_NO_BID("SMART_BID_NO_BID"),
  
  MAX_CONVERSION("MAX_CONVERSION"),
  
  CUSTOM("CUSTOM"),
  
  LITE_PACING("LITE_PACING"),
  
  BAOSHOU("BAOSHOU"),
  
  GD_PROMOTE("GD_PROMOTE"),
  
  AWEME_LITE_PACING("AWEME_LITE_PACING"),
  
  JIJIN("JIJIN"),
  
  MAXCV("MAXCV"),
  
  GUARANTEED_SHOW("GUARANTEED_SHOW");

  private String value;

  CampaignCreateV2SmartBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignCreateV2SmartBidType fromValue(String value) {
    for (CampaignCreateV2SmartBidType b : CampaignCreateV2SmartBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CampaignCreateV2SmartBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignCreateV2SmartBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignCreateV2SmartBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignCreateV2SmartBidType.fromValue(value);
    }
  }
}

