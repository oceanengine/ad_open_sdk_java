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
@JsonAdapter(AgentAdvCostReportListQueryV2FilteringSpuLabelName.Adapter.class)
public enum AgentAdvCostReportListQueryV2FilteringSpuLabelName {
  
  BRAND_CONVERSION("BRAND_CONVERSION"),
  
  BRAND_EXPOSURE("BRAND_EXPOSURE"),
  
  BRAND_GRASS("BRAND_GRASS"),
  
  CONCENTRATING_RESOURCE("CONCENTRATING_RESOURCE"),
  
  STAR_RESOURCE("STAR_RESOURCE");

  private String value;

  AgentAdvCostReportListQueryV2FilteringSpuLabelName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvCostReportListQueryV2FilteringSpuLabelName fromValue(String value) {
    for (AgentAdvCostReportListQueryV2FilteringSpuLabelName b : AgentAdvCostReportListQueryV2FilteringSpuLabelName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentAdvCostReportListQueryV2FilteringSpuLabelName> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvCostReportListQueryV2FilteringSpuLabelName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvCostReportListQueryV2FilteringSpuLabelName read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentAdvCostReportListQueryV2FilteringSpuLabelName.fromValue(value);
    }
  }
}

