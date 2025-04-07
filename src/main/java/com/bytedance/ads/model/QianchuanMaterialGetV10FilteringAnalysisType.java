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
@JsonAdapter(QianchuanMaterialGetV10FilteringAnalysisType.Adapter.class)
public enum QianchuanMaterialGetV10FilteringAnalysisType {
  
  CARRY_MATERIAL("CARRY_MATERIAL"),
  
  FIRST_PUBLISH_MATERIAL("FIRST_PUBLISH_MATERIAL"),
  
  HIGH_QUALITY_MATERIAL("HIGH_QUALITY_MATERIAL"),
  
  LOW_EFFICIENCY_MATERIAL("LOW_EFFICIENCY_MATERIAL"),
  
  POOR_QUALITY_MATERIAL("POOR_QUALITY_MATERIAL"),
  
  SIMILAR_RISK_MATERIAL("SIMILAR_RISK_MATERIAL");

  private String value;

  QianchuanMaterialGetV10FilteringAnalysisType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanMaterialGetV10FilteringAnalysisType fromValue(String value) {
    for (QianchuanMaterialGetV10FilteringAnalysisType b : QianchuanMaterialGetV10FilteringAnalysisType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanMaterialGetV10FilteringAnalysisType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanMaterialGetV10FilteringAnalysisType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanMaterialGetV10FilteringAnalysisType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanMaterialGetV10FilteringAnalysisType.fromValue(value);
    }
  }
}

