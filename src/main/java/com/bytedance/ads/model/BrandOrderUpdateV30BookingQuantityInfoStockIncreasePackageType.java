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
@JsonAdapter(BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType.Adapter.class)
public enum BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType {
  
  NONE("NONE"),
  
  PLUS("PLUS"),
  
  PRO("PRO");

  private String value;

  BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType fromValue(String value) {
    for (BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType b : BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType.fromValue(value);
    }
  }
}

