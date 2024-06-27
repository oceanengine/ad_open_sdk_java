/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(AgentTransferTransactionRecordV2FilteringPlatform.Adapter.class)
public enum AgentTransferTransactionRecordV2FilteringPlatform {
  
  AD("AD"),
  
  EFFECT("EFFECT"),
  
  STAR("STAR"),
  
  TRUSTEESHIP_MARKETING("TRUSTEESHIP_MARKETING"),
  
  ZTT("ZTT");

  private String value;

  AgentTransferTransactionRecordV2FilteringPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentTransferTransactionRecordV2FilteringPlatform fromValue(String value) {
    for (AgentTransferTransactionRecordV2FilteringPlatform b : AgentTransferTransactionRecordV2FilteringPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentTransferTransactionRecordV2FilteringPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentTransferTransactionRecordV2FilteringPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentTransferTransactionRecordV2FilteringPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentTransferTransactionRecordV2FilteringPlatform.fromValue(value);
    }
  }
}

