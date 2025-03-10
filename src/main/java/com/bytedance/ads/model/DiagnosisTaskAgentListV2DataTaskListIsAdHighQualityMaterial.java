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
@JsonAdapter(DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial.Adapter.class)
public enum DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial {
  
  NO("NO"),
  
  UNKNOWN("UNKNOWN"),
  
  YES("YES");

  private String value;

  DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial fromValue(String value) {
    for (DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial b : DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial> {
    @Override
    public void write(final JsonWriter jsonWriter, final DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial.fromValue(value);
    }
  }
}

