/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus.Adapter.class)
public enum AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus {
  
  CONFIRM_FAIL("STATUS_CONFIRM_FAIL"),
  
  CONFIRM_FAIL_END("STATUS_CONFIRM_FAIL_END"),
  
  CONFIRM_MODIFY_FAIL("STATUS_CONFIRM_MODIFY_FAIL"),
  
  DISABLE("STATUS_DISABLE"),
  
  ENABLE("STATUS_ENABLE"),
  
  LIMIT("STATUS_LIMIT"),
  
  PENDING_CONFIRM("STATUS_PENDING_CONFIRM"),
  
  PENDING_CONFIRM_MODIFY("STATUS_PENDING_CONFIRM_MODIFY"),
  
  PENDING_VERIFIED("STATUS_PENDING_VERIFIED"),
  
  SELF_SERVICE_UNAUDITED("STATUS_SELF_SERVICE_UNAUDITED"),
  
  WAIT_FOR_BPM_AUDIT("STATUS_WAIT_FOR_BPM_AUDIT"),
  
  WAIT_FOR_PUBLIC_AUTH("STATUS_WAIT_FOR_PUBLIC_AUTH");

  private String value;

  AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus fromValue(String value) {
    for (AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus b : AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus.fromValue(value);
    }
  }
}

