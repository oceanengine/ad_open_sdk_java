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
@JsonAdapter(PromotionListV30FilteringStatusSecond.Adapter.class)
public enum PromotionListV30FilteringStatusSecond {
  
  AUDIT("AUDIT"),
  
  AUDIT_DENY("AUDIT_DENY"),
  
  AWEME_ACCOUNT_DISABLED("AWEME_ACCOUNT_DISABLED"),
  
  AWEME_ANCHOR_DISABLED("AWEME_ANCHOR_DISABLED"),
  
  BALANCE_OFFLINE_BUDGET("BALANCE_OFFLINE_BUDGET"),
  
  BUDGET_GROUP_OFFLINE_BUDGET("BUDGET_GROUP_OFFLINE_BUDGET"),
  
  DISABLED("DISABLED"),
  
  DISABLE_BY_QUOTA("DISABLE_BY_QUOTA"),
  
  LIVE_ROOM_OFF("LIVE_ROOM_OFF"),
  
  NO_SCHEDULE("NO_SCHEDULE"),
  
  OFFLINE_BALANCE("OFFLINE_BALANCE"),
  
  PRODUCT_OFFLINE("PRODUCT_OFFLINE"),
  
  PROJECT_DISABLED("PROJECT_DISABLED"),
  
  PROJECT_OFFLINE_BUDGET("PROJECT_OFFLINE_BUDGET"),
  
  PROMOTION_OFFLINE_BUDGET("PROMOTION_OFFLINE_BUDGET"),
  
  REAUDIT("REAUDIT"),
  
  TIME_NO_REACH("TIME_NO_REACH");

  private String value;

  PromotionListV30FilteringStatusSecond(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30FilteringStatusSecond fromValue(String value) {
    for (PromotionListV30FilteringStatusSecond b : PromotionListV30FilteringStatusSecond.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionListV30FilteringStatusSecond> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30FilteringStatusSecond enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30FilteringStatusSecond read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30FilteringStatusSecond.fromValue(value);
    }
  }
}

