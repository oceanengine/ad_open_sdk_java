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
@JsonAdapter(SecurityScoreTotalGetV30BusinessLine.Adapter.class)
public enum SecurityScoreTotalGetV30BusinessLine {
  
  AD("AD"),
  
  QIANCHUAN("QIANCHUAN");

  private String value;

  SecurityScoreTotalGetV30BusinessLine(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SecurityScoreTotalGetV30BusinessLine fromValue(String value) {
    for (SecurityScoreTotalGetV30BusinessLine b : SecurityScoreTotalGetV30BusinessLine.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SecurityScoreTotalGetV30BusinessLine> {
    @Override
    public void write(final JsonWriter jsonWriter, final SecurityScoreTotalGetV30BusinessLine enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SecurityScoreTotalGetV30BusinessLine read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SecurityScoreTotalGetV30BusinessLine.fromValue(value);
    }
  }
}

