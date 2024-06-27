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
@JsonAdapter(DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform.Adapter.class)
public enum DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform {
  
  AD("AD"),
  
  QIANCHUAN("QIANCHUAN");

  private String value;

  DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform fromValue(String value) {
    for (DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform b : DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform.fromValue(value);
    }
  }
}

