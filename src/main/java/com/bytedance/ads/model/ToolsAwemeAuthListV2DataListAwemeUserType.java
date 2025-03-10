/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(ToolsAwemeAuthListV2DataListAwemeUserType.Adapter.class)
public enum ToolsAwemeAuthListV2DataListAwemeUserType {
  
  ENTERPRISE("ENTERPRISE"),
  
  SINGLE("SINGLE");

  private String value;

  ToolsAwemeAuthListV2DataListAwemeUserType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAwemeAuthListV2DataListAwemeUserType fromValue(String value) {
    for (ToolsAwemeAuthListV2DataListAwemeUserType b : ToolsAwemeAuthListV2DataListAwemeUserType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAwemeAuthListV2DataListAwemeUserType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAwemeAuthListV2DataListAwemeUserType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAwemeAuthListV2DataListAwemeUserType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAwemeAuthListV2DataListAwemeUserType.fromValue(value);
    }
  }
}

