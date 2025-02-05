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
@JsonAdapter(ReportAgentGetV2V2FilteringAccountStatus.Adapter.class)
public enum ReportAgentGetV2V2FilteringAccountStatus {
  
  CONFIRM_FAIL("STATUS_CONFIRM_FAIL"),
  
  WAIT_FOR_PUBLIC_AUTH("STATUS_WAIT_FOR_PUBLIC_AUTH"),
  
  CONFIRM_FAIL_END("STATUS_CONFIRM_FAIL_END"),
  
  PUNISH("STATUS_PUNISH"),
  
  WAIT_FOR_ACCOUNT_FEE("STATUS_WAIT_FOR_ACCOUNT_FEE"),
  
  CONFIRM_MODIFY_FAIL("STATUS_CONFIRM_MODIFY_FAIL"),
  
  ENABLE("STATUS_ENABLE"),
  
  PENDING_VERIFIED("STATUS_PENDING_VERIFIED"),
  
  WAIT_FOR_BPM_AUDIT("STATUS_WAIT_FOR_BPM_AUDIT"),
  
  DISABLE("STATUS_DISABLE"),
  
  ENABLE_AND_AVATAR_AUDITING("STATUS_ENABLE_AND_AVATAR_AUDITING"),
  
  WAIT_FOR_BPM_FILE_CONTACT("STATUS_WAIT_FOR_BPM_FILE_CONTACT"),
  
  SELF_SERVICE_UNAUDITED("STATUS_SELF_SERVICE_UNAUDITED"),
  
  PENDING_CONFIRM_MODIFY("STATUS_PENDING_CONFIRM_MODIFY"),
  
  PENDING_CONFIRM("STATUS_PENDING_CONFIRM");

  private String value;

  ReportAgentGetV2V2FilteringAccountStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAgentGetV2V2FilteringAccountStatus fromValue(String value) {
    for (ReportAgentGetV2V2FilteringAccountStatus b : ReportAgentGetV2V2FilteringAccountStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAgentGetV2V2FilteringAccountStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAgentGetV2V2FilteringAccountStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAgentGetV2V2FilteringAccountStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAgentGetV2V2FilteringAccountStatus.fromValue(value);
    }
  }
}

