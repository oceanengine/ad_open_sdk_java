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
@JsonAdapter(QianchuanAdGetV10FilteringAutoManageFilter.Adapter.class)
public enum QianchuanAdGetV10FilteringAutoManageFilter {
  
  ALL("ALL"),
  
  AUTO_MANAGE("AUTO_MANAGE"),
  
  NORMAL("NORMAL");

  private String value;

  QianchuanAdGetV10FilteringAutoManageFilter(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdGetV10FilteringAutoManageFilter fromValue(String value) {
    for (QianchuanAdGetV10FilteringAutoManageFilter b : QianchuanAdGetV10FilteringAutoManageFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdGetV10FilteringAutoManageFilter> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdGetV10FilteringAutoManageFilter enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdGetV10FilteringAutoManageFilter read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdGetV10FilteringAutoManageFilter.fromValue(value);
    }
  }
}

