/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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
@JsonAdapter(QianchuanFinanceDetailGetV10Type.Adapter.class)
public enum QianchuanFinanceDetailGetV10Type {
  
  ALL("ALL"),
  
  DEFAULT("DEFAULT"),
  
  BRAND("BRAND");

  private String value;

  QianchuanFinanceDetailGetV10Type(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanFinanceDetailGetV10Type fromValue(String value) {
    for (QianchuanFinanceDetailGetV10Type b : QianchuanFinanceDetailGetV10Type.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanFinanceDetailGetV10Type> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanFinanceDetailGetV10Type enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanFinanceDetailGetV10Type read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanFinanceDetailGetV10Type.fromValue(value);
    }
  }
}

