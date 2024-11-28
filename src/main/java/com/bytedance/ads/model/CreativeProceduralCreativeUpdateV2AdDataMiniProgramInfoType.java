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
@JsonAdapter(CreativeProceduralCreativeUpdateV2AdDataMiniProgramInfoType.Adapter.class)
public enum CreativeProceduralCreativeUpdateV2AdDataMiniProgramInfoType {
  
  SHELL_APP("SHELL_APP"),
  
  BYTE_APP("BYTE_APP"),
  
  TEMPLATE_APP("TEMPLATE_APP"),
  
  BYTE_GAME("BYTE_GAME");

  private String value;

  CreativeProceduralCreativeUpdateV2AdDataMiniProgramInfoType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeProceduralCreativeUpdateV2AdDataMiniProgramInfoType fromValue(String value) {
    for (CreativeProceduralCreativeUpdateV2AdDataMiniProgramInfoType b : CreativeProceduralCreativeUpdateV2AdDataMiniProgramInfoType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeProceduralCreativeUpdateV2AdDataMiniProgramInfoType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeProceduralCreativeUpdateV2AdDataMiniProgramInfoType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeProceduralCreativeUpdateV2AdDataMiniProgramInfoType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeProceduralCreativeUpdateV2AdDataMiniProgramInfoType.fromValue(value);
    }
  }
}

