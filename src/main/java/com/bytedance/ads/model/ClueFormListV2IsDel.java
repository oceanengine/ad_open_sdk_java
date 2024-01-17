/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(ClueFormListV2IsDel.Adapter.class)
public enum ClueFormListV2IsDel {
  
  Enum_0("0"),
  
  Enum_1("1");

  private String value;

  ClueFormListV2IsDel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueFormListV2IsDel fromValue(String value) {
    for (ClueFormListV2IsDel b : ClueFormListV2IsDel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueFormListV2IsDel> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueFormListV2IsDel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueFormListV2IsDel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueFormListV2IsDel.fromValue(value);
    }
  }
}

