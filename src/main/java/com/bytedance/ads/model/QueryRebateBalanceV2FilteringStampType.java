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
@JsonAdapter(QueryRebateBalanceV2FilteringStampType.Adapter.class)
public enum QueryRebateBalanceV2FilteringStampType {
  
  ONLINE("ONLINE"),
  
  DEFAULT("DEFAULT");

  private String value;

  QueryRebateBalanceV2FilteringStampType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QueryRebateBalanceV2FilteringStampType fromValue(String value) {
    for (QueryRebateBalanceV2FilteringStampType b : QueryRebateBalanceV2FilteringStampType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QueryRebateBalanceV2FilteringStampType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QueryRebateBalanceV2FilteringStampType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QueryRebateBalanceV2FilteringStampType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QueryRebateBalanceV2FilteringStampType.fromValue(value);
    }
  }
}

