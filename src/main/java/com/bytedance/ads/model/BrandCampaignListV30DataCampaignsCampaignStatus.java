/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(BrandCampaignListV30DataCampaignsCampaignStatus.Adapter.class)
public enum BrandCampaignListV30DataCampaignsCampaignStatus {
  
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

  BrandCampaignListV30DataCampaignsCampaignStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandCampaignListV30DataCampaignsCampaignStatus fromValue(String value) {
    for (BrandCampaignListV30DataCampaignsCampaignStatus b : BrandCampaignListV30DataCampaignsCampaignStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandCampaignListV30DataCampaignsCampaignStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandCampaignListV30DataCampaignsCampaignStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandCampaignListV30DataCampaignsCampaignStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandCampaignListV30DataCampaignsCampaignStatus.fromValue(value);
    }
  }
}

