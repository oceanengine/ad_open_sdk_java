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
@JsonAdapter(AdGetV2FilteringStatus.Adapter.class)
public enum AdGetV2FilteringStatus {
  
  NO_SCHEDULE("AD_STATUS_NO_SCHEDULE"),
  
  NOT_DELETE("AD_STATUS_NOT_DELETE"),
  
  CAMPAIGN_EXCEED("AD_STATUS_CAMPAIGN_EXCEED"),
  
  REAUDIT("AD_STATUS_REAUDIT"),
  
  CREATE("AD_STATUS_CREATE"),
  
  AUDIT_DENY("AD_STATUS_AUDIT_DENY"),
  
  BALANCE_EXCEED("AD_STATUS_BALANCE_EXCEED"),
  
  BUDGET_EXCEED("AD_STATUS_BUDGET_EXCEED"),
  
  CAMPAIGN_DISABLE("AD_STATUS_CAMPAIGN_DISABLE"),
  
  NOT_START("AD_STATUS_NOT_START"),
  
  DONE("AD_STATUS_DONE"),
  
  ALL("AD_STATUS_ALL"),
  
  DELIVERY_OK("AD_STATUS_DELIVERY_OK"),
  
  DELETE("AD_STATUS_DELETE"),
  
  DISABLE("AD_STATUS_DISABLE"),
  
  AUDIT("AD_STATUS_AUDIT");

  private String value;

  AdGetV2FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2FilteringStatus fromValue(String value) {
    for (AdGetV2FilteringStatus b : AdGetV2FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2FilteringStatus.fromValue(value);
    }
  }
}
