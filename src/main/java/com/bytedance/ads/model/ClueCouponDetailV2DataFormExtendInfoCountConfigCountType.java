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
@JsonAdapter(ClueCouponDetailV2DataFormExtendInfoCountConfigCountType.Adapter.class)
public enum ClueCouponDetailV2DataFormExtendInfoCountConfigCountType {
  
  INCREMENT("COUNT_TYPE_INCREMENT"),
  
  DECREMENT("COUNT_TYPE_DECREMENT");

  private String value;

  ClueCouponDetailV2DataFormExtendInfoCountConfigCountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueCouponDetailV2DataFormExtendInfoCountConfigCountType fromValue(String value) {
    for (ClueCouponDetailV2DataFormExtendInfoCountConfigCountType b : ClueCouponDetailV2DataFormExtendInfoCountConfigCountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueCouponDetailV2DataFormExtendInfoCountConfigCountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueCouponDetailV2DataFormExtendInfoCountConfigCountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueCouponDetailV2DataFormExtendInfoCountConfigCountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueCouponDetailV2DataFormExtendInfoCountConfigCountType.fromValue(value);
    }
  }
}

