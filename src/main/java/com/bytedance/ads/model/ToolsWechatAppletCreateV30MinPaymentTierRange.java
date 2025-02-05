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
@JsonAdapter(ToolsWechatAppletCreateV30MinPaymentTierRange.Adapter.class)
public enum ToolsWechatAppletCreateV30MinPaymentTierRange {
  
  SIX_TEN("SIX_TEN"),
  
  TEN_TWENTY("TEN_TWENTY"),
  
  TWENTY_FIFTY("TWENTY_FIFTY"),
  
  ZERO_FIVE("ZERO_FIVE");

  private String value;

  ToolsWechatAppletCreateV30MinPaymentTierRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatAppletCreateV30MinPaymentTierRange fromValue(String value) {
    for (ToolsWechatAppletCreateV30MinPaymentTierRange b : ToolsWechatAppletCreateV30MinPaymentTierRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsWechatAppletCreateV30MinPaymentTierRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatAppletCreateV30MinPaymentTierRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatAppletCreateV30MinPaymentTierRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatAppletCreateV30MinPaymentTierRange.fromValue(value);
    }
  }
}

