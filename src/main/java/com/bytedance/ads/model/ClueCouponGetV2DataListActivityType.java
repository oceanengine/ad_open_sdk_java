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
@JsonAdapter(ClueCouponGetV2DataListActivityType.Adapter.class)
public enum ClueCouponGetV2DataListActivityType {
  
  NOT_NEED_PHONE("DIRECT_NOT_NEED_PHONE"),
  
  NEED_PHONE("DIRECT_NEED_PHONE");

  private String value;

  ClueCouponGetV2DataListActivityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueCouponGetV2DataListActivityType fromValue(String value) {
    for (ClueCouponGetV2DataListActivityType b : ClueCouponGetV2DataListActivityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueCouponGetV2DataListActivityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueCouponGetV2DataListActivityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueCouponGetV2DataListActivityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueCouponGetV2DataListActivityType.fromValue(value);
    }
  }
}

