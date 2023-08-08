/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.8
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
@JsonAdapter(ReportCustomConfigGetV30DataTopics.Adapter.class)
public enum ReportCustomConfigGetV30DataTopics {
  
  BASIC_DATA("BASIC_DATA"),
  
  BIDWORD_DATA("BIDWORD_DATA"),
  
  CREATIVE_DATA("CREATIVE_DATA"),
  
  DMP_DATA("DMP_DATA"),
  
  MATERIAL_DATA("MATERIAL_DATA"),
  
  ONE_KEY_BOOST_DATA("ONE_KEY_BOOST_DATA"),
  
  PRODUCT_DATA("PRODUCT_DATA"),
  
  QUERY_DATA("QUERY_DATA"),
  
  VIDEO_DUARATION_DATA("VIDEO_DUARATION_DATA");

  private String value;

  ReportCustomConfigGetV30DataTopics(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCustomConfigGetV30DataTopics fromValue(String value) {
    for (ReportCustomConfigGetV30DataTopics b : ReportCustomConfigGetV30DataTopics.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCustomConfigGetV30DataTopics> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCustomConfigGetV30DataTopics enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCustomConfigGetV30DataTopics read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCustomConfigGetV30DataTopics.fromValue(value);
    }
  }
}

