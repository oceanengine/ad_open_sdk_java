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
@JsonAdapter(ClueWechatPoolListV2DataItemsAuditStatus.Adapter.class)
public enum ClueWechatPoolListV2DataItemsAuditStatus {
  
  AUDITING("AUDITING"),
  
  AUDIT_REJECTED("AUDIT_REJECTED"),
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED");

  private String value;

  ClueWechatPoolListV2DataItemsAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueWechatPoolListV2DataItemsAuditStatus fromValue(String value) {
    for (ClueWechatPoolListV2DataItemsAuditStatus b : ClueWechatPoolListV2DataItemsAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ClueWechatPoolListV2DataItemsAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueWechatPoolListV2DataItemsAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueWechatPoolListV2DataItemsAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueWechatPoolListV2DataItemsAuditStatus.fromValue(value);
    }
  }
}

