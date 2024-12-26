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
@JsonAdapter(ReportCustomAsyncTaskCreateV30DataTopic.Adapter.class)
public enum ReportCustomAsyncTaskCreateV30DataTopic {
  
  BASIC_DATA("BASIC_DATA"),
  
  BIDWORD_DATA("BIDWORD_DATA"),
  
  DPA_VIDEO_DATA("DPA_VIDEO_DATA"),
  
  MATERIAL_DATA("MATERIAL_DATA"),
  
  PRODUCT_DATA("PRODUCT_DATA"),
  
  QUERY_DATA("QUERY_DATA");

  private String value;

  ReportCustomAsyncTaskCreateV30DataTopic(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCustomAsyncTaskCreateV30DataTopic fromValue(String value) {
    for (ReportCustomAsyncTaskCreateV30DataTopic b : ReportCustomAsyncTaskCreateV30DataTopic.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCustomAsyncTaskCreateV30DataTopic> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCustomAsyncTaskCreateV30DataTopic enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCustomAsyncTaskCreateV30DataTopic read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCustomAsyncTaskCreateV30DataTopic.fromValue(value);
    }
  }
}

