/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
@JsonAdapter(DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge.Adapter.class)
public enum DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge {
  
  ALL("ALL"),
  
  Enum_18_23("18-23"),
  
  Enum_24_30("24-30"),
  
  Enum_31_40("31-40"),
  
  Enum_41_49("41-49"),
  
  Enum_50("50");

  private String value;

  DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge fromValue(String value) {
    for (DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge b : DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge> {
    @Override
    public void write(final JsonWriter jsonWriter, final DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge.fromValue(value);
    }
  }
}

