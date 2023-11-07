/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
@JsonAdapter(ToolsLandingGroupGetV2DataListGroupStatus.Adapter.class)
public enum ToolsLandingGroupGetV2DataListGroupStatus {
  
  AVAILABLE("LANDING_GROUP_STATUS_AVAILABLE"),
  
  UNAVAILABLE("LANDING_GROUP_STATUS_UNAVAILABLE");

  private String value;

  ToolsLandingGroupGetV2DataListGroupStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsLandingGroupGetV2DataListGroupStatus fromValue(String value) {
    for (ToolsLandingGroupGetV2DataListGroupStatus b : ToolsLandingGroupGetV2DataListGroupStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsLandingGroupGetV2DataListGroupStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsLandingGroupGetV2DataListGroupStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsLandingGroupGetV2DataListGroupStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsLandingGroupGetV2DataListGroupStatus.fromValue(value);
    }
  }
}

