/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(ToolsWechatAppletUpdateV30MinRechargeTier.Adapter.class)
public enum ToolsWechatAppletUpdateV30MinRechargeTier {
  
  Enum_100_TO_200("FROM_100_TO_200"),
  
  FIFTY_TO_HUNDRED("FROM_FIFTY_TO_HUNDRED"),
  
  ONE_TO_FIFTY("FROM_ONE_TO_FIFTY");

  private String value;

  ToolsWechatAppletUpdateV30MinRechargeTier(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatAppletUpdateV30MinRechargeTier fromValue(String value) {
    for (ToolsWechatAppletUpdateV30MinRechargeTier b : ToolsWechatAppletUpdateV30MinRechargeTier.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsWechatAppletUpdateV30MinRechargeTier> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatAppletUpdateV30MinRechargeTier enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatAppletUpdateV30MinRechargeTier read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatAppletUpdateV30MinRechargeTier.fromValue(value);
    }
  }
}

