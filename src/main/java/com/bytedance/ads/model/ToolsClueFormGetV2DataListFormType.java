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
@JsonAdapter(ToolsClueFormGetV2DataListFormType.Adapter.class)
public enum ToolsClueFormGetV2DataListFormType {
  
  ADVANCED_CREATIVE_FORM("ADVANCED_CREATIVE_FORM"),
  
  NATIVE_FORM("NATIVE_FORM"),
  
  NORMAL_FORM("NORMAL_FORM");

  private String value;

  ToolsClueFormGetV2DataListFormType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueFormGetV2DataListFormType fromValue(String value) {
    for (ToolsClueFormGetV2DataListFormType b : ToolsClueFormGetV2DataListFormType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsClueFormGetV2DataListFormType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueFormGetV2DataListFormType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueFormGetV2DataListFormType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsClueFormGetV2DataListFormType.fromValue(value);
    }
  }
}

