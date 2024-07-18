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
@JsonAdapter(AgentAdvertiserCopyV2ReportType.Adapter.class)
public enum AgentAdvertiserCopyV2ReportType {
  
  EMPTY("EMPTY"),
  
  INCREASE_QUANTITY("INCREASE_QUANTITY"),
  
  SELF_OPERATION("SELF_OPERATION"),
  
  INCREASE_QUANTITY_QUANTITY("INCREASE_QUANTITY_QUANTITY");

  private String value;

  AgentAdvertiserCopyV2ReportType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvertiserCopyV2ReportType fromValue(String value) {
    for (AgentAdvertiserCopyV2ReportType b : AgentAdvertiserCopyV2ReportType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentAdvertiserCopyV2ReportType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvertiserCopyV2ReportType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvertiserCopyV2ReportType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentAdvertiserCopyV2ReportType.fromValue(value);
    }
  }
}

