/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus.Adapter.class)
public enum ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus {
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED"),
  
  AUDIT_DOING("AUDIT_DOING"),
  
  AUDIT_REJECTED("AUDIT_REJECTED"),
  
  AUDIT_SEND_REJECTED("AUDIT_SEND_REJECTED"),
  
  REMOVED("REMOVED");

  private String value;

  ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus fromValue(String value) {
    for (ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus b : ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus.fromValue(value);
    }
  }
}

