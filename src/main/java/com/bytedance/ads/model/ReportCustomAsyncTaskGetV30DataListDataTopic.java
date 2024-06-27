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
@JsonAdapter(ReportCustomAsyncTaskGetV30DataListDataTopic.Adapter.class)
public enum ReportCustomAsyncTaskGetV30DataListDataTopic {
  
  BASIC_DATA("BASIC_DATA"),
  
  BIDWORD_DATA("BIDWORD_DATA"),
  
  MATERIAL_DATA("MATERIAL_DATA"),
  
  ONE_KEY_BOOST_DATA("ONE_KEY_BOOST_DATA"),
  
  PRODUCT_DATA("PRODUCT_DATA"),
  
  QUERY_DATA("QUERY_DATA");

  private String value;

  ReportCustomAsyncTaskGetV30DataListDataTopic(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCustomAsyncTaskGetV30DataListDataTopic fromValue(String value) {
    for (ReportCustomAsyncTaskGetV30DataListDataTopic b : ReportCustomAsyncTaskGetV30DataListDataTopic.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ReportCustomAsyncTaskGetV30DataListDataTopic> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCustomAsyncTaskGetV30DataListDataTopic enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCustomAsyncTaskGetV30DataListDataTopic read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCustomAsyncTaskGetV30DataListDataTopic.fromValue(value);
    }
  }
}

