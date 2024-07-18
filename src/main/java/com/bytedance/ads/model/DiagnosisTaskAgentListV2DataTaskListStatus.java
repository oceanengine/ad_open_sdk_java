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
@JsonAdapter(DiagnosisTaskAgentListV2DataTaskListStatus.Adapter.class)
public enum DiagnosisTaskAgentListV2DataTaskListStatus {
  
  FAILED("FAILED"),
  
  PENDING("PENDING"),
  
  SUCCESS("SUCCESS");

  private String value;

  DiagnosisTaskAgentListV2DataTaskListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiagnosisTaskAgentListV2DataTaskListStatus fromValue(String value) {
    for (DiagnosisTaskAgentListV2DataTaskListStatus b : DiagnosisTaskAgentListV2DataTaskListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DiagnosisTaskAgentListV2DataTaskListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DiagnosisTaskAgentListV2DataTaskListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DiagnosisTaskAgentListV2DataTaskListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DiagnosisTaskAgentListV2DataTaskListStatus.fromValue(value);
    }
  }
}

