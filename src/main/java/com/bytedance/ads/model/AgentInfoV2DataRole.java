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
@JsonAdapter(AgentInfoV2DataRole.Adapter.class)
public enum AgentInfoV2DataRole {
  
  INTERNAL_ADV("ROLE_INTERNAL_ADV"),
  
  ADVERTISER_ABSTRACT("ROLE_ADVERTISER_ABSTRACT"),
  
  AWEME_PROMOTION_ADVERTISER("ROLE_AWEME_PROMOTION_ADVERTISER"),
  
  ECP_INTERNAL_ADVERTISER("ROLE_ECP_INTERNAL_ADVERTISER"),
  
  AGENT_SYSTEM_ACCOUNT("ROLE_AGENT_SYSTEM_ACCOUNT"),
  
  ADVERTISER_SYSTEM_ACCOUNT("ROLE_ADVERTISER_SYSTEM_ACCOUNT"),
  
  HOTSOON_PROMOTION_ADVERTISER("ROLE_HOTSOON_PROMOTION_ADVERTISER"),
  
  AGENT_ABSTRACT("ROLE_AGENT_ABSTRACT"),
  
  CHILD_ADVERTISER("ROLE_CHILD_ADVERTISER"),
  
  AGENT("ROLE_AGENT"),
  
  DOUDIAN_ADVERTISER("ROLE_DOUDIAN_ADVERTISER"),
  
  LOCAL_LIFE_VIRTUAL_ADVERTISER("ROLE_LOCAL_LIFE_VIRTUAL_ADVERTISER"),
  
  MAJORDOMO("ROLE_MAJORDOMO"),
  
  ECP_CHILD_ADVERTISER("ROLE_ECP_CHILD_ADVERTISER"),
  
  DSP_ADVERTISER("ROLE_DSP_ADVERTISER"),
  
  LITE_ADVERTISER("ROLE_LITE_ADVERTISER"),
  
  CHILD_AGENT("ROLE_CHILD_AGENT"),
  
  ADMIN("ROLE_ADMIN"),
  
  PGC_ADVERTISER("ROLE_PGC_ADVERTISER"),
  
  HOTSOON_ADVERTISER("ROLE_HOTSOON_ADVERTISER"),
  
  LOCAL_LIFE_INTERNAL_ADVERTISER("ROLE_LOCAL_LIFE_INTERNAL_ADVERTISER"),
  
  ADVERTISER("ROLE_ADVERTISER"),
  
  ECP_ADVERTISER("ROLE_ECP_ADVERTISER"),
  
  LOCAL_LIFE_ADVERTISER("ROLE_LOCAL_LIFE_ADVERTISER");

  private String value;

  AgentInfoV2DataRole(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentInfoV2DataRole fromValue(String value) {
    for (AgentInfoV2DataRole b : AgentInfoV2DataRole.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentInfoV2DataRole> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentInfoV2DataRole enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentInfoV2DataRole read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentInfoV2DataRole.fromValue(value);
    }
  }
}

