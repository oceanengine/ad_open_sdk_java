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
@JsonAdapter(AdvertiserFundGrantTransactionGetV2DataListTransactionType.Adapter.class)
public enum AdvertiserFundGrantTransactionGetV2DataListTransactionType {
  
  RECHARGE("RECHARGE"),
  
  TRANSFER("TRANSFER");

  private String value;

  AdvertiserFundGrantTransactionGetV2DataListTransactionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserFundGrantTransactionGetV2DataListTransactionType fromValue(String value) {
    for (AdvertiserFundGrantTransactionGetV2DataListTransactionType b : AdvertiserFundGrantTransactionGetV2DataListTransactionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdvertiserFundGrantTransactionGetV2DataListTransactionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserFundGrantTransactionGetV2DataListTransactionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserFundGrantTransactionGetV2DataListTransactionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserFundGrantTransactionGetV2DataListTransactionType.fromValue(value);
    }
  }
}

