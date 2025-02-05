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
@JsonAdapter(AgentTransferTransactionRecordV2DataRecordsPlatform.Adapter.class)
public enum AgentTransferTransactionRecordV2DataRecordsPlatform {
  
  AD("AD"),
  
  EFFECT("EFFECT"),
  
  LOCAL("LOCAL"),
  
  QIANCHUAN("QIANCHUAN"),
  
  STAR("STAR"),
  
  TRUSTEESHIP_MARKETING("TRUSTEESHIP_MARKETING"),
  
  ZTT("ZTT");

  private String value;

  AgentTransferTransactionRecordV2DataRecordsPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentTransferTransactionRecordV2DataRecordsPlatform fromValue(String value) {
    for (AgentTransferTransactionRecordV2DataRecordsPlatform b : AgentTransferTransactionRecordV2DataRecordsPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AgentTransferTransactionRecordV2DataRecordsPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentTransferTransactionRecordV2DataRecordsPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentTransferTransactionRecordV2DataRecordsPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentTransferTransactionRecordV2DataRecordsPlatform.fromValue(value);
    }
  }
}

