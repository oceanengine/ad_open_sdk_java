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
@JsonAdapter(DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial.Adapter.class)
public enum DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial {
  
  NO("NO"),
  
  UNKNOWN("UNKNOWN"),
  
  YES("YES");

  private String value;

  DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial fromValue(String value) {
    for (DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial b : DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial> {
    @Override
    public void write(final JsonWriter jsonWriter, final DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial.fromValue(value);
    }
  }
}

