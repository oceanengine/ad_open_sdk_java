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
@JsonAdapter(ToolsMicroGameUpdateV30RevenueModel.Adapter.class)
public enum ToolsMicroGameUpdateV30RevenueModel {
  
  IAA("IAA"),
  
  IAAP("IAAP"),
  
  IAP("IAP");

  private String value;

  ToolsMicroGameUpdateV30RevenueModel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsMicroGameUpdateV30RevenueModel fromValue(String value) {
    for (ToolsMicroGameUpdateV30RevenueModel b : ToolsMicroGameUpdateV30RevenueModel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsMicroGameUpdateV30RevenueModel> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsMicroGameUpdateV30RevenueModel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsMicroGameUpdateV30RevenueModel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsMicroGameUpdateV30RevenueModel.fromValue(value);
    }
  }
}

