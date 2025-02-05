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
@JsonAdapter(AgentAdvBrandListQueryV2DataDataAccountStatus.Adapter.class)
public enum AgentAdvBrandListQueryV2DataDataAccountStatus {
  
  DISABLE("STATUS_DISABLE"),
  
  PENDING_CONFIRM("STATUS_PENDING_CONFIRM"),
  
  PENDING_VERIFIED("STATUS_PENDING_VERIFIED"),
  
  CONFIRM_FAIL("STATUS_CONFIRM_FAIL"),
  
  ENABLE("STATUS_ENABLE"),
  
  CONFIRM_FAIL_END("STATUS_CONFIRM_FAIL_END"),
  
  PENDING_CONFIRM_MODIFY("STATUS_PENDING_CONFIRM_MODIFY"),
  
  CONFIRM_MODIFY_FAIL("STATUS_CONFIRM_MODIFY_FAIL"),
  
  PUNISH("STATUS_PUNISH"),
  
  WAIT_FOR_BPM_AUDIT("STATUS_WAIT_FOR_BPM_AUDIT"),
  
  SELF_SERVICE_UNAUDITED("STATUS_SELF_SERVICE_UNAUDITED"),
  
  ENABLE_AND_AVATAR_AUDITING("STATUS_ENABLE_AND_AVATAR_AUDITING"),
  
  WAIT_FOR_BPM_FILE_CONTACT("STATUS_WAIT_FOR_BPM_FILE_CONTACT"),
  
  WAIT_FOR_ACCOUNT_FEE("STATUS_WAIT_FOR_ACCOUNT_FEE"),
  
  WAIT_FOR_PUBLIC_AUTH("STATUS_WAIT_FOR_PUBLIC_AUTH");

  private String value;

  AgentAdvBrandListQueryV2DataDataAccountStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvBrandListQueryV2DataDataAccountStatus fromValue(String value) {
    for (AgentAdvBrandListQueryV2DataDataAccountStatus b : AgentAdvBrandListQueryV2DataDataAccountStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AgentAdvBrandListQueryV2DataDataAccountStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvBrandListQueryV2DataDataAccountStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvBrandListQueryV2DataDataAccountStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentAdvBrandListQueryV2DataDataAccountStatus.fromValue(value);
    }
  }
}

