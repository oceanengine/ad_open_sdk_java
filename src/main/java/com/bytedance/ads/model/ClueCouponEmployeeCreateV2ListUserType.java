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
@JsonAdapter(ClueCouponEmployeeCreateV2ListUserType.Adapter.class)
public enum ClueCouponEmployeeCreateV2ListUserType {
  
  TOUTIAO("TOUTIAO"),
  
  DOUYIN("DOUYIN");

  private String value;

  ClueCouponEmployeeCreateV2ListUserType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueCouponEmployeeCreateV2ListUserType fromValue(String value) {
    for (ClueCouponEmployeeCreateV2ListUserType b : ClueCouponEmployeeCreateV2ListUserType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueCouponEmployeeCreateV2ListUserType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueCouponEmployeeCreateV2ListUserType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueCouponEmployeeCreateV2ListUserType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueCouponEmployeeCreateV2ListUserType.fromValue(value);
    }
  }
}

