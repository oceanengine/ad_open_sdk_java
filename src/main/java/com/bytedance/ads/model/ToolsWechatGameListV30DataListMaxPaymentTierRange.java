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
@JsonAdapter(ToolsWechatGameListV30DataListMaxPaymentTierRange.Adapter.class)
public enum ToolsWechatGameListV30DataListMaxPaymentTierRange {
  
  ABOVE_1000("ABOVE_1000"),
  
  BELOW_500("BELOW_500"),
  
  FROM_500_TO_1000("FROM_500_TO_1000");

  private String value;

  ToolsWechatGameListV30DataListMaxPaymentTierRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatGameListV30DataListMaxPaymentTierRange fromValue(String value) {
    for (ToolsWechatGameListV30DataListMaxPaymentTierRange b : ToolsWechatGameListV30DataListMaxPaymentTierRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsWechatGameListV30DataListMaxPaymentTierRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatGameListV30DataListMaxPaymentTierRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatGameListV30DataListMaxPaymentTierRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatGameListV30DataListMaxPaymentTierRange.fromValue(value);
    }
  }
}

