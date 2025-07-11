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
@JsonAdapter(ToolsWechatAppletListV30DataListMaxRechargeTier.Adapter.class)
public enum ToolsWechatAppletListV30DataListMaxRechargeTier {
  
  ABOVE_200("ABOVE_200"),
  
  FROM_100_TO_200("FROM_100_TO_200"),
  
  FROM_FIFTY_TO_HUNDRED("FROM_FIFTY_TO_HUNDRED"),
  
  FROM_ONE_TO_FIFTY("FROM_ONE_TO_FIFTY");

  private String value;

  ToolsWechatAppletListV30DataListMaxRechargeTier(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatAppletListV30DataListMaxRechargeTier fromValue(String value) {
    for (ToolsWechatAppletListV30DataListMaxRechargeTier b : ToolsWechatAppletListV30DataListMaxRechargeTier.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsWechatAppletListV30DataListMaxRechargeTier> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatAppletListV30DataListMaxRechargeTier enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatAppletListV30DataListMaxRechargeTier read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatAppletListV30DataListMaxRechargeTier.fromValue(value);
    }
  }
}

