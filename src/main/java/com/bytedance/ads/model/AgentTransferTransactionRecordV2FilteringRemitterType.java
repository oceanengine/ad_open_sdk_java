/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(AgentTransferTransactionRecordV2FilteringRemitterType.Adapter.class)
public enum AgentTransferTransactionRecordV2FilteringRemitterType {
  
  ADVERTISER("ROLE_ADVERTISER"),
  
  AGENT("ROLE_AGENT"),
  
  CHILD_AGENT("ROLE_CHILD_AGENT"),
  
  ECP_VIRTUAL_ADVERTISER("ROLE_ECP_VIRTUAL_ADVERTISER"),
  
  LOCAL_LIFE_VIRTUAL_ADVERTISER("ROLE_LOCAL_LIFE_VIRTUAL_ADVERTISER"),
  
  SHARE_WALLET("ROLE_SHARE_WALLET"),
  
  VIRTAUL_ADVERTISER("ROLE_VIRTAUL_ADVERTISER");

  private String value;

  AgentTransferTransactionRecordV2FilteringRemitterType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentTransferTransactionRecordV2FilteringRemitterType fromValue(String value) {
    for (AgentTransferTransactionRecordV2FilteringRemitterType b : AgentTransferTransactionRecordV2FilteringRemitterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentTransferTransactionRecordV2FilteringRemitterType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentTransferTransactionRecordV2FilteringRemitterType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentTransferTransactionRecordV2FilteringRemitterType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentTransferTransactionRecordV2FilteringRemitterType.fromValue(value);
    }
  }
}

