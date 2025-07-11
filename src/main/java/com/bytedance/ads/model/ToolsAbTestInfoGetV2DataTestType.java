/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
@JsonAdapter(ToolsAbTestInfoGetV2DataTestType.Adapter.class)
public enum ToolsAbTestInfoGetV2DataTestType {
  
  AD("AD"),
  
  CAMPAIGN("CAMPAIGN");

  private String value;

  ToolsAbTestInfoGetV2DataTestType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAbTestInfoGetV2DataTestType fromValue(String value) {
    for (ToolsAbTestInfoGetV2DataTestType b : ToolsAbTestInfoGetV2DataTestType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAbTestInfoGetV2DataTestType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAbTestInfoGetV2DataTestType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAbTestInfoGetV2DataTestType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAbTestInfoGetV2DataTestType.fromValue(value);
    }
  }
}

