/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(ToolsWechatGameCreateV30AgeLimit.Adapter.class)
public enum ToolsWechatGameCreateV30AgeLimit {
  
  EIGHTEEN_PLUS("EIGHTEEN_PLUS"),
  
  EIGHT_PLUS("EIGHT_PLUS"),
  
  FOUR_PLUS("FOUR_PLUS"),
  
  SIXTEEN_PLUS("SIXTEEN_PLUS"),
  
  TWELVE_PLUS("TWELVE_PLUS");

  private String value;

  ToolsWechatGameCreateV30AgeLimit(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatGameCreateV30AgeLimit fromValue(String value) {
    for (ToolsWechatGameCreateV30AgeLimit b : ToolsWechatGameCreateV30AgeLimit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsWechatGameCreateV30AgeLimit> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatGameCreateV30AgeLimit enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatGameCreateV30AgeLimit read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatGameCreateV30AgeLimit.fromValue(value);
    }
  }
}

