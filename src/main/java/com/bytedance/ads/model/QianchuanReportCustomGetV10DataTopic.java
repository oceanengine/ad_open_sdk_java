/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(QianchuanReportCustomGetV10DataTopic.Adapter.class)
public enum QianchuanReportCustomGetV10DataTopic {
  
  ECP_BASIC_DATA("ECP_BASIC_DATA"),
  
  SITE_PROMOTION_POST_DATA_LIVE("SITE_PROMOTION_POST_DATA_LIVE"),
  
  SITE_PROMOTION_POST_DATA_OTHER("SITE_PROMOTION_POST_DATA_OTHER"),
  
  SITE_PROMOTION_POST_DATA_TITLE("SITE_PROMOTION_POST_DATA_TITLE"),
  
  SITE_PROMOTION_POST_DATA_VIDEO("SITE_PROMOTION_POST_DATA_VIDEO");

  private String value;

  QianchuanReportCustomGetV10DataTopic(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportCustomGetV10DataTopic fromValue(String value) {
    for (QianchuanReportCustomGetV10DataTopic b : QianchuanReportCustomGetV10DataTopic.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportCustomGetV10DataTopic> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportCustomGetV10DataTopic enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportCustomGetV10DataTopic read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportCustomGetV10DataTopic.fromValue(value);
    }
  }
}

