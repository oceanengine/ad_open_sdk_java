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
@JsonAdapter(AgentInfoV2DataAccountStatus.Adapter.class)
public enum AgentInfoV2DataAccountStatus {
  
  DISABLE("STATUS_DISABLE"),
  
  PENDING_CONFIRM_MODIFY("STATUS_PENDING_CONFIRM_MODIFY"),
  
  SELF_SERVICE_UNAUDITED("STATUS_SELF_SERVICE_UNAUDITED"),
  
  WAIT_FOR_PUBLIC_AUTH("STATUS_WAIT_FOR_PUBLIC_AUTH"),
  
  LIMIT("STATUS_LIMIT"),
  
  CONFIRM_FAIL("STATUS_CONFIRM_FAIL"),
  
  CONFIRM_FAIL_END("STATUS_CONFIRM_FAIL_END"),
  
  CONFIRM_MODIFY_FAIL("STATUS_CONFIRM_MODIFY_FAIL"),
  
  WAIT_FOR_BPM_AUDIT("STATUS_WAIT_FOR_BPM_AUDIT"),
  
  PENDING_VERIFIED("STATUS_PENDING_VERIFIED"),
  
  PENDING_CONFIRM("STATUS_PENDING_CONFIRM"),
  
  ENABLE("STATUS_ENABLE");

  private String value;

  AgentInfoV2DataAccountStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentInfoV2DataAccountStatus fromValue(String value) {
    for (AgentInfoV2DataAccountStatus b : AgentInfoV2DataAccountStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentInfoV2DataAccountStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentInfoV2DataAccountStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentInfoV2DataAccountStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentInfoV2DataAccountStatus.fromValue(value);
    }
  }
}

