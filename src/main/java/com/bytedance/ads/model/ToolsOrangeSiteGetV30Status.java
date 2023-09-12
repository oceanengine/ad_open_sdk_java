/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
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
@JsonAdapter(ToolsOrangeSiteGetV30Status.Adapter.class)
public enum ToolsOrangeSiteGetV30Status {
  
  ALL("SITE_ALL"),
  
  OFFLINE("SITE_OFFLINE"),
  
  ONLINE("SITE_ONLINE"),
  
  REJECTED("SITE_REJECTED"),
  
  TRASH("SITE_TRASH");

  private String value;

  ToolsOrangeSiteGetV30Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsOrangeSiteGetV30Status fromValue(String value) {
    for (ToolsOrangeSiteGetV30Status b : ToolsOrangeSiteGetV30Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsOrangeSiteGetV30Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsOrangeSiteGetV30Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsOrangeSiteGetV30Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsOrangeSiteGetV30Status.fromValue(value);
    }
  }
}

