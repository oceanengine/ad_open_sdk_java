/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(ToolsAwemeAuthListV2DataListAuthType.Adapter.class)
public enum ToolsAwemeAuthListV2DataListAuthType {
  
  AWEME_ACCOUNT("AWEME_ACCOUNT"),
  
  AWEME_HOMEPAGE("AWEME_HOMEPAGE"),
  
  LIVE_ACCOUNT("LIVE_ACCOUNT"),
  
  VIDEO_ITEM("VIDEO_ITEM");

  private String value;

  ToolsAwemeAuthListV2DataListAuthType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAwemeAuthListV2DataListAuthType fromValue(String value) {
    for (ToolsAwemeAuthListV2DataListAuthType b : ToolsAwemeAuthListV2DataListAuthType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAwemeAuthListV2DataListAuthType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAwemeAuthListV2DataListAuthType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAwemeAuthListV2DataListAuthType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAwemeAuthListV2DataListAuthType.fromValue(value);
    }
  }
}

