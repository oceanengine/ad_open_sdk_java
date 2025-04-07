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
@JsonAdapter(ToolsMicroGameConvertWindowUpdateV30ConvertWindow.Adapter.class)
public enum ToolsMicroGameConvertWindowUpdateV30ConvertWindow {
  
  FOURTEEN("FOURTEEN"),
  
  NINETY("NINETY"),
  
  ONE("ONE"),
  
  ONE_HUNDRED_EIGHTY("ONE_HUNDRED_EIGHTY"),
  
  PERMANENT("PERMANENT"),
  
  SEVEN("SEVEN"),
  
  SIXTY("SIXTY"),
  
  THIRTY("THIRTY"),
  
  THREE("THREE");

  private String value;

  ToolsMicroGameConvertWindowUpdateV30ConvertWindow(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsMicroGameConvertWindowUpdateV30ConvertWindow fromValue(String value) {
    for (ToolsMicroGameConvertWindowUpdateV30ConvertWindow b : ToolsMicroGameConvertWindowUpdateV30ConvertWindow.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsMicroGameConvertWindowUpdateV30ConvertWindow> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsMicroGameConvertWindowUpdateV30ConvertWindow enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsMicroGameConvertWindowUpdateV30ConvertWindow read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsMicroGameConvertWindowUpdateV30ConvertWindow.fromValue(value);
    }
  }
}

