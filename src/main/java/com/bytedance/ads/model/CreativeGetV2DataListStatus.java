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
@JsonAdapter(CreativeGetV2DataListStatus.Adapter.class)
public enum CreativeGetV2DataListStatus {
  
  ADVERTISER_BUDGET_EXCEED("CREATIVE_STATUS_ADVERTISER_BUDGET_EXCEED"),
  
  ADVERTISER_PRE_OFFLINE_BUDGET("CREATIVE_STATUS_ADVERTISER_PRE_OFFLINE_BUDGET"),
  
  AD_AUDIT("CREATIVE_STATUS_AD_AUDIT"),
  
  AD_AUDIT_DENY("CREATIVE_STATUS_AD_AUDIT_DENY"),
  
  AD_DISABLE("CREATIVE_STATUS_AD_DISABLE"),
  
  AD_EXTERNAL_URL_DISABLE("CREATIVE_STATUS_AD_EXTERNAL_URL_DISABLE"),
  
  AD_PRE_OFFLINE_BUDGET("CREATIVE_STATUS_AD_PRE_OFFLINE_BUDGET"),
  
  AD_REAUDIT("CREATIVE_STATUS_AD_REAUDIT"),
  
  ALL("CREATIVE_STATUS_ALL"),
  
  AUDIT("CREATIVE_STATUS_AUDIT"),
  
  AUDIT_DENY("CREATIVE_STATUS_AUDIT_DENY"),
  
  AUTHORIZE_CANCEL("CREATIVE_STATUS_AUTHORIZE_CANCEL"),
  
  AWEME_ACCOUNT_DISABLED("CREATIVE_STATUS_AWEME_ACCOUNT_DISABLED"),
  
  AWEME_ANCHOR_DISABLED("CREATIVE_STATUS_AWEME_ANCHOR_DISABLED"),
  
  AWEME_ITEM_DISABLED("CREATIVE_STATUS_AWEME_ITEM_DISABLED"),
  
  BALANCE_EXCEED("CREATIVE_STATUS_BALANCE_EXCEED"),
  
  BUDGET_EXCEED("CREATIVE_STATUS_BUDGET_EXCEED"),
  
  CAMPAIGN_DISABLE("CREATIVE_STATUS_CAMPAIGN_DISABLE"),
  
  CAMPAIGN_EXCEED("CREATIVE_STATUS_CAMPAIGN_EXCEED"),
  
  CAN_NOT_EDIT("CREATIVE_STATUS_CAN_NOT_EDIT"),
  
  CAN_NOT_LAUNCH("CREATIVE_STATUS_CAN_NOT_LAUNCH"),
  
  CREATE("CREATIVE_STATUS_CREATE"),
  
  DATA_ERROR("CREATIVE_STATUS_DATA_ERROR"),
  
  DELETE("CREATIVE_STATUS_DELETE"),
  
  DELIVERY_OK("CREATIVE_STATUS_DELIVERY_OK"),
  
  DISABLE("CREATIVE_STATUS_DISABLE"),
  
  DONE("CREATIVE_STATUS_DONE"),
  
  FROZEN("CREATIVE_STATUS_FROZEN"),
  
  LIVE_ROOM_OFF("CREATIVE_STATUS_LIVE_ROOM_OFF"),
  
  NOT_START("CREATIVE_STATUS_NOT_START"),
  
  NO_DELIVERY("CREATIVE_STATUS_NO_DELIVERY"),
  
  NO_SCHEDULE("CREATIVE_STATUS_NO_SCHEDULE"),
  
  PRODUCT_OFFLINE("CREATIVE_STATUS_PRODUCT_OFFLINE"),
  
  REAUDIT("CREATIVE_STATUS_REAUDIT");

  private String value;

  CreativeGetV2DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeGetV2DataListStatus fromValue(String value) {
    for (CreativeGetV2DataListStatus b : CreativeGetV2DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeGetV2DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeGetV2DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeGetV2DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeGetV2DataListStatus.fromValue(value);
    }
  }
}

