/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(CampaignGetV2FilteringStatus.Adapter.class)
public enum CampaignGetV2FilteringStatus {
  
  NOT_DELETE("CAMPAIGN_STATUS_NOT_DELETE"),
  
  ENABLE("CAMPAIGN_STATUS_ENABLE"),
  
  ALL("CAMPAIGN_STATUS_ALL"),
  
  DELETE("CAMPAIGN_STATUS_DELETE"),
  
  DISABLE("CAMPAIGN_STATUS_DISABLE");

  private String value;

  CampaignGetV2FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignGetV2FilteringStatus fromValue(String value) {
    for (CampaignGetV2FilteringStatus b : CampaignGetV2FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CampaignGetV2FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignGetV2FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignGetV2FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignGetV2FilteringStatus.fromValue(value);
    }
  }
}

