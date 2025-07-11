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
@JsonAdapter(ReportCustomGetV30DataTopic.Adapter.class)
public enum ReportCustomGetV30DataTopic {
  
  BASIC_DATA("BASIC_DATA"),
  
  BIDWORD_DATA("BIDWORD_DATA"),
  
  DMP_DATA("DMP_DATA"),
  
  MATERIAL_DATA("MATERIAL_DATA"),
  
  ONE_KEY_BOOST_DATA("ONE_KEY_BOOST_DATA"),
  
  PRODUCT_DATA("PRODUCT_DATA"),
  
  QUERY_DATA("QUERY_DATA"),
  
  VIDEO_DUARATION_DATA("VIDEO_DUARATION_DATA");

  private String value;

  ReportCustomGetV30DataTopic(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCustomGetV30DataTopic fromValue(String value) {
    for (ReportCustomGetV30DataTopic b : ReportCustomGetV30DataTopic.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCustomGetV30DataTopic> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCustomGetV30DataTopic enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCustomGetV30DataTopic read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCustomGetV30DataTopic.fromValue(value);
    }
  }
}

