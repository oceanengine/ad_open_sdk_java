/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
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
@JsonAdapter(ToolsOrangeSiteGetV30DataListStatus.Adapter.class)
public enum ToolsOrangeSiteGetV30DataListStatus {
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED"),
  
  AUDIT_BANNED("AUDIT_BANNED"),
  
  AUDIT_DOING("AUDIT_DOING"),
  
  AUDIT_REJECTED("AUDIT_REJECTED"),
  
  DELETED("DELETED"),
  
  DISABLE("DISABLE"),
  
  EDIT("EDIT"),
  
  ENABLE("ENABLE"),
  
  FORBIDDEN("FORBIDDEN");

  private String value;

  ToolsOrangeSiteGetV30DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsOrangeSiteGetV30DataListStatus fromValue(String value) {
    for (ToolsOrangeSiteGetV30DataListStatus b : ToolsOrangeSiteGetV30DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsOrangeSiteGetV30DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsOrangeSiteGetV30DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsOrangeSiteGetV30DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsOrangeSiteGetV30DataListStatus.fromValue(value);
    }
  }
}

