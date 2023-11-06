/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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
@JsonAdapter(ToolsLandingGroupGetV2DataListGroupFlowType.Adapter.class)
public enum ToolsLandingGroupGetV2DataListGroupFlowType {
  
  AVERAGE("FLOW_DISTRIBUTION_TYPE_AVERAGE"),
  
  INTELLIGENCE("FLOW_DISTRIBUTION_TYPE_INTELLIGENCE");

  private String value;

  ToolsLandingGroupGetV2DataListGroupFlowType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsLandingGroupGetV2DataListGroupFlowType fromValue(String value) {
    for (ToolsLandingGroupGetV2DataListGroupFlowType b : ToolsLandingGroupGetV2DataListGroupFlowType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsLandingGroupGetV2DataListGroupFlowType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsLandingGroupGetV2DataListGroupFlowType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsLandingGroupGetV2DataListGroupFlowType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsLandingGroupGetV2DataListGroupFlowType.fromValue(value);
    }
  }
}

