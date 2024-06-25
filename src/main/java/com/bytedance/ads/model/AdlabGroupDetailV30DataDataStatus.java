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
@JsonAdapter(AdlabGroupDetailV30DataDataStatus.Adapter.class)
public enum AdlabGroupDetailV30DataDataStatus {
  
  ADV_BUDGET_EXCEED("ADV_BUDGET_EXCEED"),
  
  AUDIT_FAILED("AUDIT_FAILED"),
  
  AUTO_STOP("AUTO_STOP"),
  
  BALANCE_EXCEED("BALANCE_EXCEED"),
  
  CAMPAIGN_DELETED("CAMPAIGN_DELETED"),
  
  CAMPAIGN_DISABLE("CAMPAIGN_DISABLE"),
  
  CREATING("CREATING"),
  
  DELETED("DELETED"),
  
  DELIVERY_OK("DELIVERY_OK"),
  
  DISABLE("DISABLE"),
  
  GROUP_GOODS_CLOSE("GROUP_GOODS_CLOSE"),
  
  INITIALIZING("INITIALIZING"),
  
  INIT_FAILED("INIT_FAILED"),
  
  INVALID_STATUS("INVALID_STATUS"),
  
  LACK_OF_POSTERIOR_DATA("LACK_OF_POSTERIOR_DATA"),
  
  LIVE_CAN_NOT_LAUNCH("LIVE_CAN_NOT_LAUNCH"),
  
  NO_SCHEDULE("NO_SCHEDULE"),
  
  OUT_OF_BUDGET("OUT_OF_BUDGET"),
  
  OUT_OF_CREATIVE("OUT_OF_CREATIVE"),
  
  OUT_OF_DAILY_BUDGET("OUT_OF_DAILY_BUDGET"),
  
  OUT_OF_DAILY_TIME("OUT_OF_DAILY_TIME"),
  
  OUT_OF_QUOTA("OUT_OF_QUOTA"),
  
  OUT_OF_TIME("OUT_OF_TIME"),
  
  READY("READY"),
  
  RECOVERABLE_ERROR("RECOVERABLE_ERROR"),
  
  SYSTEM_ERROR("SYSTEM_ERROR");

  private String value;

  AdlabGroupDetailV30DataDataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupDetailV30DataDataStatus fromValue(String value) {
    for (AdlabGroupDetailV30DataDataStatus b : AdlabGroupDetailV30DataDataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdlabGroupDetailV30DataDataStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupDetailV30DataDataStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupDetailV30DataDataStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupDetailV30DataDataStatus.fromValue(value);
    }
  }
}

