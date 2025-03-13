/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(ToolsWechatAppletListV30FilteringAuditStatus.Adapter.class)
public enum ToolsWechatAppletListV30FilteringAuditStatus {
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED"),
  
  AUDITING("AUDITING"),
  
  AUDIT_REJECTED("AUDIT_REJECTED"),
  
  ALL("ALL");

  private String value;

  ToolsWechatAppletListV30FilteringAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatAppletListV30FilteringAuditStatus fromValue(String value) {
    for (ToolsWechatAppletListV30FilteringAuditStatus b : ToolsWechatAppletListV30FilteringAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsWechatAppletListV30FilteringAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatAppletListV30FilteringAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatAppletListV30FilteringAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatAppletListV30FilteringAuditStatus.fromValue(value);
    }
  }
}

