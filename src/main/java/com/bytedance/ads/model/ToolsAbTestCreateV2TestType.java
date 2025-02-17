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
@JsonAdapter(ToolsAbTestCreateV2TestType.Adapter.class)
public enum ToolsAbTestCreateV2TestType {
  
  CAMPAIGN("CAMPAIGN"),
  
  AD("AD");

  private String value;

  ToolsAbTestCreateV2TestType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAbTestCreateV2TestType fromValue(String value) {
    for (ToolsAbTestCreateV2TestType b : ToolsAbTestCreateV2TestType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAbTestCreateV2TestType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAbTestCreateV2TestType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAbTestCreateV2TestType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAbTestCreateV2TestType.fromValue(value);
    }
  }
}

