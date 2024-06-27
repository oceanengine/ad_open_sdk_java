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
@JsonAdapter(StarReportDataTopicConfigV2DataStatMetricsType.Adapter.class)
public enum StarReportDataTopicConfigV2DataStatMetricsType {
  
  FLOAT64("FLOAT64"),
  
  INT64("INT64"),
  
  JSON("JSON"),
  
  STRING("STRING");

  private String value;

  StarReportDataTopicConfigV2DataStatMetricsType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarReportDataTopicConfigV2DataStatMetricsType fromValue(String value) {
    for (StarReportDataTopicConfigV2DataStatMetricsType b : StarReportDataTopicConfigV2DataStatMetricsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarReportDataTopicConfigV2DataStatMetricsType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarReportDataTopicConfigV2DataStatMetricsType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarReportDataTopicConfigV2DataStatMetricsType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarReportDataTopicConfigV2DataStatMetricsType.fromValue(value);
    }
  }
}

