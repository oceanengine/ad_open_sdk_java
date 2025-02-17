/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(QianchuanReportAdvertiserGetV10FilteringOrderPlatform.Adapter.class)
public enum QianchuanReportAdvertiserGetV10FilteringOrderPlatform {
  
  ALL("ALL"),
  
  ECP_AWEME("ECP_AWEME"),
  
  QIANCHUAN("QIANCHUAN");

  private String value;

  QianchuanReportAdvertiserGetV10FilteringOrderPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportAdvertiserGetV10FilteringOrderPlatform fromValue(String value) {
    for (QianchuanReportAdvertiserGetV10FilteringOrderPlatform b : QianchuanReportAdvertiserGetV10FilteringOrderPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportAdvertiserGetV10FilteringOrderPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportAdvertiserGetV10FilteringOrderPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportAdvertiserGetV10FilteringOrderPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportAdvertiserGetV10FilteringOrderPlatform.fromValue(value);
    }
  }
}

