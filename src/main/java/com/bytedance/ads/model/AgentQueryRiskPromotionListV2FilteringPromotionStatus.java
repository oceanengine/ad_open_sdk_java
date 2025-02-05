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
@JsonAdapter(AgentQueryRiskPromotionListV2FilteringPromotionStatus.Adapter.class)
public enum AgentQueryRiskPromotionListV2FilteringPromotionStatus {
  
  ADV_OFFLINE_BUDGET("ADV_OFFLINE_BUDGET"),
  
  ADV_PRE_OFFLINE_BUDGET("ADV_PRE_OFFLINE_BUDGET"),
  
  AUDIT("AUDIT"),
  
  AWEME_ACCOUNT_DISABLED("AWEME_ACCOUNT_DISABLED"),
  
  AWEME_ANCHOR_DISABLED("AWEME_ANCHOR_DISABLED"),
  
  CREATE("CREATE"),
  
  DELETE("DELETE"),
  
  DELIVERY_OK("DELIVERY_OK"),
  
  ERROR_DEFAULT("ERROR_DEFAULT"),
  
  FROZEN("FROZEN"),
  
  LIVE_ROOM_OFF("LIVE_ROOM_OFF"),
  
  NO_SCHEDULE("NO_SCHEDULE"),
  
  OFFLINE_AUDIT("OFFLINE_AUDIT"),
  
  PRE_ONLINE("PRE_ONLINE"),
  
  PRODUCT_OFFLINE("PRODUCT_OFFLINE"),
  
  PROJECT_DISABLE("PROJECT_DISABLE"),
  
  PROJECT_OFFLINE_BUDGET("PROJECT_OFFLINE_BUDGET"),
  
  PROJECT_PRE_OFFLINE_BUDGET("PROJECT_PRE_OFFLINE_BUDGET"),
  
  PROMOTION_DISABLE("PROMOTION_DISABLE"),
  
  PROMOTION_OFFLINE_BALANCE("PROMOTION_OFFLINE_BALANCE"),
  
  PROMOTION_OFFLINE_BUDGET("PROMOTION_OFFLINE_BUDGET"),
  
  PROMOTION_PRE_OFFLINE_BUDGET("PROMOTION_PRE_OFFLINE_BUDGET"),
  
  PROMOTION_QUOTA_LIMIT("PROMOTION_QUOTA_LIMIT"),
  
  RE_AUDIT("RE_AUDIT"),
  
  TIME_DONE("TIME_DONE"),
  
  TIME_NO_REACH("TIME_NO_REACH");

  private String value;

  AgentQueryRiskPromotionListV2FilteringPromotionStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentQueryRiskPromotionListV2FilteringPromotionStatus fromValue(String value) {
    for (AgentQueryRiskPromotionListV2FilteringPromotionStatus b : AgentQueryRiskPromotionListV2FilteringPromotionStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentQueryRiskPromotionListV2FilteringPromotionStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentQueryRiskPromotionListV2FilteringPromotionStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentQueryRiskPromotionListV2FilteringPromotionStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentQueryRiskPromotionListV2FilteringPromotionStatus.fromValue(value);
    }
  }
}

