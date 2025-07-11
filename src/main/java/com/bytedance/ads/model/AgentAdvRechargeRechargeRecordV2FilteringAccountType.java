/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
@JsonAdapter(AgentAdvRechargeRechargeRecordV2FilteringAccountType.Adapter.class)
public enum AgentAdvRechargeRechargeRecordV2FilteringAccountType {
  
  FIRST_AGENT_ACCOUNT("FIRST_AGENT_ACCOUNT"),
  
  ADVERTISER_ACCOUNT("ADVERTISER_ACCOUNT");

  private String value;

  AgentAdvRechargeRechargeRecordV2FilteringAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvRechargeRechargeRecordV2FilteringAccountType fromValue(String value) {
    for (AgentAdvRechargeRechargeRecordV2FilteringAccountType b : AgentAdvRechargeRechargeRecordV2FilteringAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentAdvRechargeRechargeRecordV2FilteringAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvRechargeRechargeRecordV2FilteringAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvRechargeRechargeRecordV2FilteringAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentAdvRechargeRechargeRecordV2FilteringAccountType.fromValue(value);
    }
  }
}

