/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(QueryRebateAccountingInfoV2FilteringUseType.Adapter.class)
public enum QueryRebateAccountingInfoV2FilteringUseType {
  
  CASH("CASH"),
  
  CHARGE("CHARGE"),
  
  HEDGING("HEDGING"),
  
  NONPAYMENT("NONPAYMENT"),
  
  REVERT("REVERT");

  private String value;

  QueryRebateAccountingInfoV2FilteringUseType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QueryRebateAccountingInfoV2FilteringUseType fromValue(String value) {
    for (QueryRebateAccountingInfoV2FilteringUseType b : QueryRebateAccountingInfoV2FilteringUseType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QueryRebateAccountingInfoV2FilteringUseType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QueryRebateAccountingInfoV2FilteringUseType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QueryRebateAccountingInfoV2FilteringUseType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QueryRebateAccountingInfoV2FilteringUseType.fromValue(value);
    }
  }
}

