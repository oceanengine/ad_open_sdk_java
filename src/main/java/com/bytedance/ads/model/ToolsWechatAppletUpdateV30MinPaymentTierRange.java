/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(ToolsWechatAppletUpdateV30MinPaymentTierRange.Adapter.class)
public enum ToolsWechatAppletUpdateV30MinPaymentTierRange {
  
  SIX_TEN("SIX_TEN"),
  
  TEN_TWENTY("TEN_TWENTY"),
  
  TWENTY_FIFTY("TWENTY_FIFTY"),
  
  ZERO_FIVE("ZERO_FIVE");

  private String value;

  ToolsWechatAppletUpdateV30MinPaymentTierRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatAppletUpdateV30MinPaymentTierRange fromValue(String value) {
    for (ToolsWechatAppletUpdateV30MinPaymentTierRange b : ToolsWechatAppletUpdateV30MinPaymentTierRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsWechatAppletUpdateV30MinPaymentTierRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatAppletUpdateV30MinPaymentTierRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatAppletUpdateV30MinPaymentTierRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatAppletUpdateV30MinPaymentTierRange.fromValue(value);
    }
  }
}

