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
@JsonAdapter(SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType.Adapter.class)
public enum SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType {
  
  CREDIT("CREDIT"),
  
  NO_LIMIT("NO_LIMIT"),
  
  PREPAY("PREPAY");

  private String value;

  SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType fromValue(String value) {
    for (SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType b : SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType.fromValue(value);
    }
  }
}

