/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(StarReportCustomDataTopicReportV2Topics.Adapter.class)
public enum StarReportCustomDataTopicReportV2Topics {
  
  BASIC_DATA("BASIC_DATA"),
  
  COMMENT_DATA("COMMENT_DATA"),
  
  CONVERT_DATA("CONVERT_DATA"),
  
  DY_SHOP_DATA("DY_SHOP_DATA"),
  
  FLOW_DATA("FLOW_DATA"),
  
  INDEX_SCORE_DATA("INDEX_SCORE_DATA"),
  
  RECOMMEND_DATA("RECOMMEND_DATA"),
  
  SEARCH_DATA("SEARCH_DATA"),
  
  USER_DISTRIBUTION_DATA("USER_DISTRIBUTION_DATA");

  private String value;

  StarReportCustomDataTopicReportV2Topics(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarReportCustomDataTopicReportV2Topics fromValue(String value) {
    for (StarReportCustomDataTopicReportV2Topics b : StarReportCustomDataTopicReportV2Topics.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarReportCustomDataTopicReportV2Topics> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarReportCustomDataTopicReportV2Topics enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarReportCustomDataTopicReportV2Topics read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarReportCustomDataTopicReportV2Topics.fromValue(value);
    }
  }
}

