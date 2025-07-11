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
@JsonAdapter(ClueCouponCreateV2CouponResourceListCodeType.Adapter.class)
public enum ClueCouponCreateV2CouponResourceListCodeType {
  
  COMMON("COMMON"),
  
  MERCHANT("MERCHANT"),
  
  API("API"),
  
  PLATFORM("PLATFORM");

  private String value;

  ClueCouponCreateV2CouponResourceListCodeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueCouponCreateV2CouponResourceListCodeType fromValue(String value) {
    for (ClueCouponCreateV2CouponResourceListCodeType b : ClueCouponCreateV2CouponResourceListCodeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueCouponCreateV2CouponResourceListCodeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueCouponCreateV2CouponResourceListCodeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueCouponCreateV2CouponResourceListCodeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueCouponCreateV2CouponResourceListCodeType.fromValue(value);
    }
  }
}

