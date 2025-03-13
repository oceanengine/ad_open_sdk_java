/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(QianchuanReportUniPromotionDataGetV10PageSize.Adapter.class)
public enum QianchuanReportUniPromotionDataGetV10PageSize {
  
  NUMBER_10(10l),
  
  NUMBER_100(100l),
  
  NUMBER_20(20l),
  
  NUMBER_200(200l),
  
  NUMBER_50(50l);

  private Long value;

  QianchuanReportUniPromotionDataGetV10PageSize(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportUniPromotionDataGetV10PageSize fromValue(Long value) {
    for (QianchuanReportUniPromotionDataGetV10PageSize b : QianchuanReportUniPromotionDataGetV10PageSize.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportUniPromotionDataGetV10PageSize> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportUniPromotionDataGetV10PageSize enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportUniPromotionDataGetV10PageSize read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanReportUniPromotionDataGetV10PageSize.fromValue(value);
    }
  }
}

