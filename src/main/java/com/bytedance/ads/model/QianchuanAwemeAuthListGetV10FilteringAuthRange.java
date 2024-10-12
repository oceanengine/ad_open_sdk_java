/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(QianchuanAwemeAuthListGetV10FilteringAuthRange.Adapter.class)
public enum QianchuanAwemeAuthListGetV10FilteringAuthRange {
  
  ALL("ALL"),
  
  BY_AWEME("BY_AWEME"),
  
  BY_VIDEO("BY_VIDEO");

  private String value;

  QianchuanAwemeAuthListGetV10FilteringAuthRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeAuthListGetV10FilteringAuthRange fromValue(String value) {
    for (QianchuanAwemeAuthListGetV10FilteringAuthRange b : QianchuanAwemeAuthListGetV10FilteringAuthRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeAuthListGetV10FilteringAuthRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeAuthListGetV10FilteringAuthRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeAuthListGetV10FilteringAuthRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeAuthListGetV10FilteringAuthRange.fromValue(value);
    }
  }
}

