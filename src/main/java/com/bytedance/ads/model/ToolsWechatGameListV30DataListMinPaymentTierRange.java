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
@JsonAdapter(ToolsWechatGameListV30DataListMinPaymentTierRange.Adapter.class)
public enum ToolsWechatGameListV30DataListMinPaymentTierRange {
  
  SIX_TEN("SIX_TEN"),
  
  TEN_TWENTY("TEN_TWENTY"),
  
  TWENTY_FIFTY("TWENTY_FIFTY"),
  
  ZERO_FIVE("ZERO_FIVE");

  private String value;

  ToolsWechatGameListV30DataListMinPaymentTierRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatGameListV30DataListMinPaymentTierRange fromValue(String value) {
    for (ToolsWechatGameListV30DataListMinPaymentTierRange b : ToolsWechatGameListV30DataListMinPaymentTierRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsWechatGameListV30DataListMinPaymentTierRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatGameListV30DataListMinPaymentTierRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatGameListV30DataListMinPaymentTierRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatGameListV30DataListMinPaymentTierRange.fromValue(value);
    }
  }
}

