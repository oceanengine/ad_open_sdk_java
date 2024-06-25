/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(AdvertiserFundTransactionGetV2DataListTransactionType.Adapter.class)
public enum AdvertiserFundTransactionGetV2DataListTransactionType {
  
  RECHARGE("RECHARGE"),
  
  TRANSFER("TRANSFER");

  private String value;

  AdvertiserFundTransactionGetV2DataListTransactionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserFundTransactionGetV2DataListTransactionType fromValue(String value) {
    for (AdvertiserFundTransactionGetV2DataListTransactionType b : AdvertiserFundTransactionGetV2DataListTransactionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdvertiserFundTransactionGetV2DataListTransactionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserFundTransactionGetV2DataListTransactionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserFundTransactionGetV2DataListTransactionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserFundTransactionGetV2DataListTransactionType.fromValue(value);
    }
  }
}

