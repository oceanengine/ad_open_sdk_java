/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@JsonAdapter(ClueCouponDetailV2DataFormElementsAllowEmpty.Adapter.class)
public enum ClueCouponDetailV2DataFormElementsAllowEmpty {
  
  Enum_0("0"),
  
  Enum_1("1");

  private String value;

  ClueCouponDetailV2DataFormElementsAllowEmpty(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueCouponDetailV2DataFormElementsAllowEmpty fromValue(String value) {
    for (ClueCouponDetailV2DataFormElementsAllowEmpty b : ClueCouponDetailV2DataFormElementsAllowEmpty.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueCouponDetailV2DataFormElementsAllowEmpty> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueCouponDetailV2DataFormElementsAllowEmpty enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueCouponDetailV2DataFormElementsAllowEmpty read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueCouponDetailV2DataFormElementsAllowEmpty.fromValue(value);
    }
  }
}

