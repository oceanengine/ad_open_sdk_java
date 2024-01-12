/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
@JsonAdapter(ReportAdGetV2FilteringStatus.Adapter.class)
public enum ReportAdGetV2FilteringStatus {
  
  AUDIT("AD_STATUS_AUDIT"),
  
  AUDIT_DENY("AD_STATUS_AUDIT_DENY"),
  
  DISABLE("AD_STATUS_DISABLE"),
  
  BUDGET_EXCEED("AD_STATUS_BUDGET_EXCEED"),
  
  ALL("AD_STATUS_ALL"),
  
  NOT_START("AD_STATUS_NOT_START"),
  
  BALANCE_EXCEED("AD_STATUS_BALANCE_EXCEED"),
  
  DELETE("AD_STATUS_DELETE"),
  
  NO_SCHEDULE("AD_STATUS_NO_SCHEDULE"),
  
  CAMPAIGN_DISABLE("AD_STATUS_CAMPAIGN_DISABLE"),
  
  CAMPAIGN_EXCEED("AD_STATUS_CAMPAIGN_EXCEED"),
  
  REAUDIT("AD_STATUS_REAUDIT"),
  
  DELIVERY_OK("AD_STATUS_DELIVERY_OK"),
  
  NOT_DELETE("AD_STATUS_NOT_DELETE"),
  
  DONE("AD_STATUS_DONE"),
  
  CREATE("AD_STATUS_CREATE");

  private String value;

  ReportAdGetV2FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdGetV2FilteringStatus fromValue(String value) {
    for (ReportAdGetV2FilteringStatus b : ReportAdGetV2FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdGetV2FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdGetV2FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdGetV2FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdGetV2FilteringStatus.fromValue(value);
    }
  }
}

