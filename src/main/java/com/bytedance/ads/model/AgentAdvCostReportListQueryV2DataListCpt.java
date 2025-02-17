/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(AgentAdvCostReportListQueryV2DataListCpt.Adapter.class)
public enum AgentAdvCostReportListQueryV2DataListCpt {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  AgentAdvCostReportListQueryV2DataListCpt(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvCostReportListQueryV2DataListCpt fromValue(Long value) {
    for (AgentAdvCostReportListQueryV2DataListCpt b : AgentAdvCostReportListQueryV2DataListCpt.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AgentAdvCostReportListQueryV2DataListCpt> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvCostReportListQueryV2DataListCpt enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvCostReportListQueryV2DataListCpt read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return AgentAdvCostReportListQueryV2DataListCpt.fromValue(value);
    }
  }
}

