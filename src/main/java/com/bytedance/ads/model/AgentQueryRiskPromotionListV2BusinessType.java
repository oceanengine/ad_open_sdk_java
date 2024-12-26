/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(AgentQueryRiskPromotionListV2BusinessType.Adapter.class)
public enum AgentQueryRiskPromotionListV2BusinessType {
  
  AD("AD");

  private String value;

  AgentQueryRiskPromotionListV2BusinessType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentQueryRiskPromotionListV2BusinessType fromValue(String value) {
    for (AgentQueryRiskPromotionListV2BusinessType b : AgentQueryRiskPromotionListV2BusinessType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentQueryRiskPromotionListV2BusinessType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentQueryRiskPromotionListV2BusinessType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentQueryRiskPromotionListV2BusinessType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentQueryRiskPromotionListV2BusinessType.fromValue(value);
    }
  }
}

