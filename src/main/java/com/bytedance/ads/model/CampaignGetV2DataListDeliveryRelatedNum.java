/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
@JsonAdapter(CampaignGetV2DataListDeliveryRelatedNum.Adapter.class)
public enum CampaignGetV2DataListDeliveryRelatedNum {
  
  SINGLE_DELIVERY("CAMPAIGN_DPA_SINGLE_DELIVERY"),
  
  DEFAULT_NOT("CAMPAIGN_DPA_DEFAULT_NOT"),
  
  MULTI_DELIVERY("CAMPAIGN_DPA_MULTI_DELIVERY");

  private String value;

  CampaignGetV2DataListDeliveryRelatedNum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignGetV2DataListDeliveryRelatedNum fromValue(String value) {
    for (CampaignGetV2DataListDeliveryRelatedNum b : CampaignGetV2DataListDeliveryRelatedNum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CampaignGetV2DataListDeliveryRelatedNum> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignGetV2DataListDeliveryRelatedNum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignGetV2DataListDeliveryRelatedNum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignGetV2DataListDeliveryRelatedNum.fromValue(value);
    }
  }
}
