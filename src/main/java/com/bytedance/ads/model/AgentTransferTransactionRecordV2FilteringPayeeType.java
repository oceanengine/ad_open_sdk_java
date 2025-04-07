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
@JsonAdapter(AgentTransferTransactionRecordV2FilteringPayeeType.Adapter.class)
public enum AgentTransferTransactionRecordV2FilteringPayeeType {
  
  ADVERTISER("ROLE_ADVERTISER"),
  
  AGENT("ROLE_AGENT"),
  
  CHILD_AGENT("ROLE_CHILD_AGENT"),
  
  ECP_VIRTUAL_ADVERTISER("ROLE_ECP_VIRTUAL_ADVERTISER"),
  
  LOCAL_LIFE_VIRTUAL_ADVERTISER("ROLE_LOCAL_LIFE_VIRTUAL_ADVERTISER"),
  
  SHARE_WALLET("ROLE_SHARE_WALLET"),
  
  VIRTAUL_ADVERTISER("ROLE_VIRTAUL_ADVERTISER");

  private String value;

  AgentTransferTransactionRecordV2FilteringPayeeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentTransferTransactionRecordV2FilteringPayeeType fromValue(String value) {
    for (AgentTransferTransactionRecordV2FilteringPayeeType b : AgentTransferTransactionRecordV2FilteringPayeeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentTransferTransactionRecordV2FilteringPayeeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentTransferTransactionRecordV2FilteringPayeeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentTransferTransactionRecordV2FilteringPayeeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentTransferTransactionRecordV2FilteringPayeeType.fromValue(value);
    }
  }
}

