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
@JsonAdapter(QianchuanAdRecommendKeywordsGetV10OrderField.Adapter.class)
public enum QianchuanAdRecommendKeywordsGetV10OrderField {
  
  COMPETITION("COMPETITION"),
  
  DEFAULT("DEFAULT"),
  
  PV("PV"),
  
  RELEVANCE("RELEVANCE");

  private String value;

  QianchuanAdRecommendKeywordsGetV10OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdRecommendKeywordsGetV10OrderField fromValue(String value) {
    for (QianchuanAdRecommendKeywordsGetV10OrderField b : QianchuanAdRecommendKeywordsGetV10OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdRecommendKeywordsGetV10OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdRecommendKeywordsGetV10OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdRecommendKeywordsGetV10OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdRecommendKeywordsGetV10OrderField.fromValue(value);
    }
  }
}

