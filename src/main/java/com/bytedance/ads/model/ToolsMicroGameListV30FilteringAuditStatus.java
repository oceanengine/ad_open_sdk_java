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
@JsonAdapter(ToolsMicroGameListV30FilteringAuditStatus.Adapter.class)
public enum ToolsMicroGameListV30FilteringAuditStatus {
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED"),
  
  AUDITING("AUDITING"),
  
  AUDIT_REJECTED("AUDIT_REJECTED"),
  
  ALL("ALL");

  private String value;

  ToolsMicroGameListV30FilteringAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsMicroGameListV30FilteringAuditStatus fromValue(String value) {
    for (ToolsMicroGameListV30FilteringAuditStatus b : ToolsMicroGameListV30FilteringAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsMicroGameListV30FilteringAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsMicroGameListV30FilteringAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsMicroGameListV30FilteringAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsMicroGameListV30FilteringAuditStatus.fromValue(value);
    }
  }
}

