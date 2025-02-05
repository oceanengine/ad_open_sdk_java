/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(QianchuanReportAdGetV10FilteringSmartBidType.Adapter.class)
public enum QianchuanReportAdGetV10FilteringSmartBidType {
  
  CONSERVATIVE("SMART_BID_CONSERVATIVE"),
  
  CUSTOM("SMART_BID_CUSTOM");

  private String value;

  QianchuanReportAdGetV10FilteringSmartBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportAdGetV10FilteringSmartBidType fromValue(String value) {
    for (QianchuanReportAdGetV10FilteringSmartBidType b : QianchuanReportAdGetV10FilteringSmartBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportAdGetV10FilteringSmartBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportAdGetV10FilteringSmartBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportAdGetV10FilteringSmartBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportAdGetV10FilteringSmartBidType.fromValue(value);
    }
  }
}

