/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@JsonAdapter(QianchuanReportUniPromotionDimensionDataRoomGetV10OrderType.Adapter.class)
public enum QianchuanReportUniPromotionDimensionDataRoomGetV10OrderType {
  
  ASC("ASC"),
  
  DESC("DESC");

  private String value;

  QianchuanReportUniPromotionDimensionDataRoomGetV10OrderType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportUniPromotionDimensionDataRoomGetV10OrderType fromValue(String value) {
    for (QianchuanReportUniPromotionDimensionDataRoomGetV10OrderType b : QianchuanReportUniPromotionDimensionDataRoomGetV10OrderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportUniPromotionDimensionDataRoomGetV10OrderType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportUniPromotionDimensionDataRoomGetV10OrderType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportUniPromotionDimensionDataRoomGetV10OrderType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportUniPromotionDimensionDataRoomGetV10OrderType.fromValue(value);
    }
  }
}

