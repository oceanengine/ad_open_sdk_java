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
@JsonAdapter(QianchuanAdMaterialGetV10FilteringAnalysisType.Adapter.class)
public enum QianchuanAdMaterialGetV10FilteringAnalysisType {
  
  CARRY_MATERIAL("CARRY_MATERIAL"),
  
  LOW_EFFICIENCY_MATERIAL("LOW_EFFICIENCY_MATERIAL"),
  
  FIRST_PUBLISH_MATERIAL("FIRST_PUBLISH_MATERIAL"),
  
  SIMILAR_RISK_MATERIAL("SIMILAR_RISK_MATERIAL"),
  
  HIGH_QUALITY_MATERIAL("HIGH_QUALITY_MATERIAL"),
  
  POOR_QUALITY_MATERIAL("POOR_QUALITY_MATERIAL");

  private String value;

  QianchuanAdMaterialGetV10FilteringAnalysisType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdMaterialGetV10FilteringAnalysisType fromValue(String value) {
    for (QianchuanAdMaterialGetV10FilteringAnalysisType b : QianchuanAdMaterialGetV10FilteringAnalysisType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdMaterialGetV10FilteringAnalysisType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdMaterialGetV10FilteringAnalysisType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdMaterialGetV10FilteringAnalysisType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdMaterialGetV10FilteringAnalysisType.fromValue(value);
    }
  }
}

