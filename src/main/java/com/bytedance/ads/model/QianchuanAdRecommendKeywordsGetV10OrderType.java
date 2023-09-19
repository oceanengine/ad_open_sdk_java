/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
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
@JsonAdapter(QianchuanAdRecommendKeywordsGetV10OrderType.Adapter.class)
public enum QianchuanAdRecommendKeywordsGetV10OrderType {
  
  ASC("ASC"),
  
  DESC("DESC");

  private String value;

  QianchuanAdRecommendKeywordsGetV10OrderType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdRecommendKeywordsGetV10OrderType fromValue(String value) {
    for (QianchuanAdRecommendKeywordsGetV10OrderType b : QianchuanAdRecommendKeywordsGetV10OrderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdRecommendKeywordsGetV10OrderType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdRecommendKeywordsGetV10OrderType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdRecommendKeywordsGetV10OrderType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdRecommendKeywordsGetV10OrderType.fromValue(value);
    }
  }
}

