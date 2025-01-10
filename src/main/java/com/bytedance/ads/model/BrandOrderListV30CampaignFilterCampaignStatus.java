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
@JsonAdapter(BrandOrderListV30CampaignFilterCampaignStatus.Adapter.class)
public enum BrandOrderListV30CampaignFilterCampaignStatus {
  
  DISABLE("DISABLE"),
  
  DONE("DONE"),
  
  ENABLE("ENABLE"),
  
  IS_DEL("IS_DEL"),
  
  RESUBMITTING("RESUBMITTING"),
  
  RESUBMIT_FAILED("RESUBMIT_FAILED"),
  
  SUBMITTING("SUBMITTING"),
  
  SUBMIT_FAILED("SUBMIT_FAILED"),
  
  WAIT_RESUBMITTING("WAIT_RESUBMITTING");

  private String value;

  BrandOrderListV30CampaignFilterCampaignStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandOrderListV30CampaignFilterCampaignStatus fromValue(String value) {
    for (BrandOrderListV30CampaignFilterCampaignStatus b : BrandOrderListV30CampaignFilterCampaignStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandOrderListV30CampaignFilterCampaignStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandOrderListV30CampaignFilterCampaignStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandOrderListV30CampaignFilterCampaignStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandOrderListV30CampaignFilterCampaignStatus.fromValue(value);
    }
  }
}
