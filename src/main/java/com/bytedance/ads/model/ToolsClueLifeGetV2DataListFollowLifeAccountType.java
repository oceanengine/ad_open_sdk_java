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
@JsonAdapter(ToolsClueLifeGetV2DataListFollowLifeAccountType.Adapter.class)
public enum ToolsClueLifeGetV2DataListFollowLifeAccountType {
  
  HEAD("HEAD"),
  
  REGION("REGION"),
  
  SINGLE("SINGLE");

  private String value;

  ToolsClueLifeGetV2DataListFollowLifeAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueLifeGetV2DataListFollowLifeAccountType fromValue(String value) {
    for (ToolsClueLifeGetV2DataListFollowLifeAccountType b : ToolsClueLifeGetV2DataListFollowLifeAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsClueLifeGetV2DataListFollowLifeAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueLifeGetV2DataListFollowLifeAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueLifeGetV2DataListFollowLifeAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsClueLifeGetV2DataListFollowLifeAccountType.fromValue(value);
    }
  }
}

