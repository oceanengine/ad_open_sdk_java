/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(AgentRefundTransferSeqCreateV2TransferType.Adapter.class)
public enum AgentRefundTransferSeqCreateV2TransferType {
  
  CASH_DEFAULT("CASH_DEFAULT"),
  
  CREDIT_BIDDING("CREDIT_BIDDING"),
  
  CREDIT_BRAND("CREDIT_BRAND"),
  
  CREDIT_GENERAL("CREDIT_GENERAL"),
  
  GRANT_GENERAL("GRANT_GENERAL"),
  
  PREPAY_BIDDING("PREPAY_BIDDING"),
  
  PREPAY_BRAND("PREPAY_BRAND"),
  
  PREPAY_GENERAL("PREPAY_GENERAL");

  private String value;

  AgentRefundTransferSeqCreateV2TransferType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentRefundTransferSeqCreateV2TransferType fromValue(String value) {
    for (AgentRefundTransferSeqCreateV2TransferType b : AgentRefundTransferSeqCreateV2TransferType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentRefundTransferSeqCreateV2TransferType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentRefundTransferSeqCreateV2TransferType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentRefundTransferSeqCreateV2TransferType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentRefundTransferSeqCreateV2TransferType.fromValue(value);
    }
  }
}

