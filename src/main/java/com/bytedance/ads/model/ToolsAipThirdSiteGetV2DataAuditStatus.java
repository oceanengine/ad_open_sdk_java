/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(ToolsAipThirdSiteGetV2DataAuditStatus.Adapter.class)
public enum ToolsAipThirdSiteGetV2DataAuditStatus {
  
  AUDIT_UNKNOW("AUDIT_UNKNOW"),
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED"),
  
  AUDIT_REJECTED("AUDIT_REJECTED"),
  
  AUDIT_BANNED("AUDIT_BANNED"),
  
  AUDITING("AUDITING"),
  
  AWAIT_AUDIT("AWAIT_AUDIT");

  private String value;

  ToolsAipThirdSiteGetV2DataAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAipThirdSiteGetV2DataAuditStatus fromValue(String value) {
    for (ToolsAipThirdSiteGetV2DataAuditStatus b : ToolsAipThirdSiteGetV2DataAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAipThirdSiteGetV2DataAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAipThirdSiteGetV2DataAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAipThirdSiteGetV2DataAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAipThirdSiteGetV2DataAuditStatus.fromValue(value);
    }
  }
}

