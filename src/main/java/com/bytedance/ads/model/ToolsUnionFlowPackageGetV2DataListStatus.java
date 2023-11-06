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
@JsonAdapter(ToolsUnionFlowPackageGetV2DataListStatus.Adapter.class)
public enum ToolsUnionFlowPackageGetV2DataListStatus {
  
  ENABLE("FLOW_PACKAGE_ENABLE"),
  
  DISABLE("FLOW_PACKAGE_DISABLE");

  private String value;

  ToolsUnionFlowPackageGetV2DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsUnionFlowPackageGetV2DataListStatus fromValue(String value) {
    for (ToolsUnionFlowPackageGetV2DataListStatus b : ToolsUnionFlowPackageGetV2DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsUnionFlowPackageGetV2DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsUnionFlowPackageGetV2DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsUnionFlowPackageGetV2DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsUnionFlowPackageGetV2DataListStatus.fromValue(value);
    }
  }
}

