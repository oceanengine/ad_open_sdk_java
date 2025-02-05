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
@JsonAdapter(ToolsMicroAppCreateV30MaxPaymentTierRange.Adapter.class)
public enum ToolsMicroAppCreateV30MaxPaymentTierRange {
  
  ABOVE_1000("ABOVE_1000"),
  
  BELOW_500("BELOW_500"),
  
  FROM_500_TO_1000("FROM_500_TO_1000");

  private String value;

  ToolsMicroAppCreateV30MaxPaymentTierRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsMicroAppCreateV30MaxPaymentTierRange fromValue(String value) {
    for (ToolsMicroAppCreateV30MaxPaymentTierRange b : ToolsMicroAppCreateV30MaxPaymentTierRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsMicroAppCreateV30MaxPaymentTierRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsMicroAppCreateV30MaxPaymentTierRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsMicroAppCreateV30MaxPaymentTierRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsMicroAppCreateV30MaxPaymentTierRange.fromValue(value);
    }
  }
}

