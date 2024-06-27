/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(ToolsMicroGameListV30DataListAuditStatus.Adapter.class)
public enum ToolsMicroGameListV30DataListAuditStatus {
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED"),
  
  AUDITING("AUDITING"),
  
  AUDIT_REJECTED("AUDIT_REJECTED");

  private String value;

  ToolsMicroGameListV30DataListAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsMicroGameListV30DataListAuditStatus fromValue(String value) {
    for (ToolsMicroGameListV30DataListAuditStatus b : ToolsMicroGameListV30DataListAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsMicroGameListV30DataListAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsMicroGameListV30DataListAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsMicroGameListV30DataListAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsMicroGameListV30DataListAuditStatus.fromValue(value);
    }
  }
}

