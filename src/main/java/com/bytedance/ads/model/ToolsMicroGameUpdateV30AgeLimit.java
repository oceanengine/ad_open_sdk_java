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
@JsonAdapter(ToolsMicroGameUpdateV30AgeLimit.Adapter.class)
public enum ToolsMicroGameUpdateV30AgeLimit {
  
  EIGHTEEN_PLUS("EIGHTEEN_PLUS"),
  
  EIGHT_PLUS("EIGHT_PLUS"),
  
  FOUR_PLUS("FOUR_PLUS"),
  
  SIXTEEN_PLUS("SIXTEEN_PLUS"),
  
  TWELVE_PLUS("TWELVE_PLUS");

  private String value;

  ToolsMicroGameUpdateV30AgeLimit(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsMicroGameUpdateV30AgeLimit fromValue(String value) {
    for (ToolsMicroGameUpdateV30AgeLimit b : ToolsMicroGameUpdateV30AgeLimit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsMicroGameUpdateV30AgeLimit> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsMicroGameUpdateV30AgeLimit enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsMicroGameUpdateV30AgeLimit read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsMicroGameUpdateV30AgeLimit.fromValue(value);
    }
  }
}

