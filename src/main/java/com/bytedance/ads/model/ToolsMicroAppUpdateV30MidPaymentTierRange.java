/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(ToolsMicroAppUpdateV30MidPaymentTierRange.Adapter.class)
public enum ToolsMicroAppUpdateV30MidPaymentTierRange {
  
  ABOVE_500("ABOVE_500"),
  
  BELOW_100("BELOW_100"),
  
  FROM_100_TO_500("FROM_100_TO_500");

  private String value;

  ToolsMicroAppUpdateV30MidPaymentTierRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsMicroAppUpdateV30MidPaymentTierRange fromValue(String value) {
    for (ToolsMicroAppUpdateV30MidPaymentTierRange b : ToolsMicroAppUpdateV30MidPaymentTierRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsMicroAppUpdateV30MidPaymentTierRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsMicroAppUpdateV30MidPaymentTierRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsMicroAppUpdateV30MidPaymentTierRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsMicroAppUpdateV30MidPaymentTierRange.fromValue(value);
    }
  }
}

