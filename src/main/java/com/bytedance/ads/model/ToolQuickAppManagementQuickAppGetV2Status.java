/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@JsonAdapter(ToolQuickAppManagementQuickAppGetV2Status.Adapter.class)
public enum ToolQuickAppManagementQuickAppGetV2Status {
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED"),
  
  AUDIT_DOING("AUDIT_DOING"),
  
  AUDIT_REJECTED("AUDIT_REJECTED"),
  
  AUDIT_SEND_REJECTED("AUDIT_SEND_REJECTED"),
  
  REMOVED("REMOVED");

  private String value;

  ToolQuickAppManagementQuickAppGetV2Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolQuickAppManagementQuickAppGetV2Status fromValue(String value) {
    for (ToolQuickAppManagementQuickAppGetV2Status b : ToolQuickAppManagementQuickAppGetV2Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolQuickAppManagementQuickAppGetV2Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolQuickAppManagementQuickAppGetV2Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolQuickAppManagementQuickAppGetV2Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolQuickAppManagementQuickAppGetV2Status.fromValue(value);
    }
  }
}

