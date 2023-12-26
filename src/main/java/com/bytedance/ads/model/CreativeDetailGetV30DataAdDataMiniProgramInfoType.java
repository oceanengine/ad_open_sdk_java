/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
@JsonAdapter(CreativeDetailGetV30DataAdDataMiniProgramInfoType.Adapter.class)
public enum CreativeDetailGetV30DataAdDataMiniProgramInfoType {
  
  BYTE_APP("BYTE_APP"),
  
  BYTE_GAME("BYTE_GAME"),
  
  SHELL_APP("SHELL_APP"),
  
  TEMPLATE_APP("TEMPLATE_APP");

  private String value;

  CreativeDetailGetV30DataAdDataMiniProgramInfoType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeDetailGetV30DataAdDataMiniProgramInfoType fromValue(String value) {
    for (CreativeDetailGetV30DataAdDataMiniProgramInfoType b : CreativeDetailGetV30DataAdDataMiniProgramInfoType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeDetailGetV30DataAdDataMiniProgramInfoType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeDetailGetV30DataAdDataMiniProgramInfoType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeDetailGetV30DataAdDataMiniProgramInfoType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeDetailGetV30DataAdDataMiniProgramInfoType.fromValue(value);
    }
  }
}
