/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(ToolsNoBidSuggestBidV2FilteringFlowControlMode.Adapter.class)
public enum ToolsNoBidSuggestBidV2FilteringFlowControlMode {
  
  TWO_PHASES("FLOW_CONTROL_MODE_TWO_PHASES"),
  
  FAST("FLOW_CONTROL_MODE_FAST"),
  
  SMOOTH("FLOW_CONTROL_MODE_SMOOTH"),
  
  HOURLY("FLOW_CONTROL_MODE_HOURLY"),
  
  BALANCE("FLOW_CONTROL_MODE_BALANCE");

  private String value;

  ToolsNoBidSuggestBidV2FilteringFlowControlMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsNoBidSuggestBidV2FilteringFlowControlMode fromValue(String value) {
    for (ToolsNoBidSuggestBidV2FilteringFlowControlMode b : ToolsNoBidSuggestBidV2FilteringFlowControlMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsNoBidSuggestBidV2FilteringFlowControlMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsNoBidSuggestBidV2FilteringFlowControlMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsNoBidSuggestBidV2FilteringFlowControlMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsNoBidSuggestBidV2FilteringFlowControlMode.fromValue(value);
    }
  }
}

