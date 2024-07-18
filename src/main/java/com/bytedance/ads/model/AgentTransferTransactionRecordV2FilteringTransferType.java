/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(AgentTransferTransactionRecordV2FilteringTransferType.Adapter.class)
public enum AgentTransferTransactionRecordV2FilteringTransferType {
  
  ADD_MONEY("ADD_MONEY"),
  
  MUTUAL_TRANSFER("MUTUAL_TRANSFER"),
  
  REFUND_MONEY("REFUND_MONEY");

  private String value;

  AgentTransferTransactionRecordV2FilteringTransferType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentTransferTransactionRecordV2FilteringTransferType fromValue(String value) {
    for (AgentTransferTransactionRecordV2FilteringTransferType b : AgentTransferTransactionRecordV2FilteringTransferType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentTransferTransactionRecordV2FilteringTransferType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentTransferTransactionRecordV2FilteringTransferType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentTransferTransactionRecordV2FilteringTransferType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentTransferTransactionRecordV2FilteringTransferType.fromValue(value);
    }
  }
}

