/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(ToolsWechatAppletCreateV30RecommendedRechargeTier.Adapter.class)
public enum ToolsWechatAppletCreateV30RecommendedRechargeTier {
  
  ABOVE_200("ABOVE_200"),
  
  FROM_100_TO_200("FROM_100_TO_200"),
  
  FROM_FIFTY_TO_HUNDRED("FROM_FIFTY_TO_HUNDRED"),
  
  FROM_ONE_TO_FIFTY("FROM_ONE_TO_FIFTY");

  private String value;

  ToolsWechatAppletCreateV30RecommendedRechargeTier(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatAppletCreateV30RecommendedRechargeTier fromValue(String value) {
    for (ToolsWechatAppletCreateV30RecommendedRechargeTier b : ToolsWechatAppletCreateV30RecommendedRechargeTier.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsWechatAppletCreateV30RecommendedRechargeTier> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatAppletCreateV30RecommendedRechargeTier enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatAppletCreateV30RecommendedRechargeTier read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatAppletCreateV30RecommendedRechargeTier.fromValue(value);
    }
  }
}

