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
@JsonAdapter(BrandToolQueryStockBalanceV30FrequencyInfoFrequencyStatus.Adapter.class)
public enum BrandToolQueryStockBalanceV30FrequencyInfoFrequencyStatus {
  
  DISABLE("DISABLE"),
  
  ENABLE("ENABLE");

  private String value;

  BrandToolQueryStockBalanceV30FrequencyInfoFrequencyStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandToolQueryStockBalanceV30FrequencyInfoFrequencyStatus fromValue(String value) {
    for (BrandToolQueryStockBalanceV30FrequencyInfoFrequencyStatus b : BrandToolQueryStockBalanceV30FrequencyInfoFrequencyStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandToolQueryStockBalanceV30FrequencyInfoFrequencyStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandToolQueryStockBalanceV30FrequencyInfoFrequencyStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandToolQueryStockBalanceV30FrequencyInfoFrequencyStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandToolQueryStockBalanceV30FrequencyInfoFrequencyStatus.fromValue(value);
    }
  }
}

