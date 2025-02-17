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
@JsonAdapter(ToolsAwemeAuthListV2DataListShareType.Adapter.class)
public enum ToolsAwemeAuthListV2DataListShareType {
  
  BY_ONESELF("SHARE_BY_ONESELF"),
  
  BY_SAME_ENTITY("SHARE_BY_SAME_ENTITY"),
  
  FROM_BP("SHARE_FROM_BP");

  private String value;

  ToolsAwemeAuthListV2DataListShareType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAwemeAuthListV2DataListShareType fromValue(String value) {
    for (ToolsAwemeAuthListV2DataListShareType b : ToolsAwemeAuthListV2DataListShareType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAwemeAuthListV2DataListShareType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAwemeAuthListV2DataListShareType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAwemeAuthListV2DataListShareType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAwemeAuthListV2DataListShareType.fromValue(value);
    }
  }
}

