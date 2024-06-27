/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(ToolsAdvertiserStoreSearchV2Type.Adapter.class)
public enum ToolsAdvertiserStoreSearchV2Type {
  
  LANDING("STORE_LANDING"),
  
  DOUYIN("STORE_DOUYIN"),
  
  THIRT_PARTY("STORE_THIRT_PARTY"),
  
  NORMAL("STORE_NORMAL");

  private String value;

  ToolsAdvertiserStoreSearchV2Type(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdvertiserStoreSearchV2Type fromValue(String value) {
    for (ToolsAdvertiserStoreSearchV2Type b : ToolsAdvertiserStoreSearchV2Type.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAdvertiserStoreSearchV2Type> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdvertiserStoreSearchV2Type enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdvertiserStoreSearchV2Type read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdvertiserStoreSearchV2Type.fromValue(value);
    }
  }
}

