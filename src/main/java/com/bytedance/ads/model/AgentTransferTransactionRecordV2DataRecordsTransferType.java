/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(AgentTransferTransactionRecordV2DataRecordsTransferType.Adapter.class)
public enum AgentTransferTransactionRecordV2DataRecordsTransferType {
  
  ADD_MONEY("ADD_MONEY"),
  
  MUTUAL_TRANSFER("MUTUAL_TRANSFER"),
  
  REFUND_MONEY("REFUND_MONEY");

  private String value;

  AgentTransferTransactionRecordV2DataRecordsTransferType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentTransferTransactionRecordV2DataRecordsTransferType fromValue(String value) {
    for (AgentTransferTransactionRecordV2DataRecordsTransferType b : AgentTransferTransactionRecordV2DataRecordsTransferType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AgentTransferTransactionRecordV2DataRecordsTransferType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentTransferTransactionRecordV2DataRecordsTransferType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentTransferTransactionRecordV2DataRecordsTransferType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentTransferTransactionRecordV2DataRecordsTransferType.fromValue(value);
    }
  }
}

