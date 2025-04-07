/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType.Adapter.class)
public enum CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType {
  
  CREDIT_BIDDING("CREDIT_BIDDING"),
  
  CREDIT_BRAND("CREDIT_BRAND"),
  
  CREDIT_GENERAL("CREDIT_GENERAL"),
  
  PREPAY_BIDDING("PREPAY_BIDDING"),
  
  PREPAY_BRAND("PREPAY_BRAND"),
  
  PREPAY_GENERAL("PREPAY_GENERAL");

  private String value;

  CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType fromValue(String value) {
    for (CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType b : CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType.fromValue(value);
    }
  }
}

