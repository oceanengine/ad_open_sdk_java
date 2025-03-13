/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(NativeAnchorGetDetailV30DataListGameAnchorGameType.Adapter.class)
public enum NativeAnchorGetDetailV30DataListGameAnchorGameType {
  
  GENERAL("GENERAL"),
  
  MICRO_GAME("MICRO_GAME");

  private String value;

  NativeAnchorGetDetailV30DataListGameAnchorGameType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorGetDetailV30DataListGameAnchorGameType fromValue(String value) {
    for (NativeAnchorGetDetailV30DataListGameAnchorGameType b : NativeAnchorGetDetailV30DataListGameAnchorGameType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NativeAnchorGetDetailV30DataListGameAnchorGameType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorGetDetailV30DataListGameAnchorGameType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorGetDetailV30DataListGameAnchorGameType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorGetDetailV30DataListGameAnchorGameType.fromValue(value);
    }
  }
}

