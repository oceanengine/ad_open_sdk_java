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
@JsonAdapter(QianchuanAdStatusUpdateV10OptStatus.Adapter.class)
public enum QianchuanAdStatusUpdateV10OptStatus {
  
  REVIVE("REVIVE"),
  
  DELETE("DELETE"),
  
  ENABLE("ENABLE"),
  
  DISABLE("DISABLE");

  private String value;

  QianchuanAdStatusUpdateV10OptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdStatusUpdateV10OptStatus fromValue(String value) {
    for (QianchuanAdStatusUpdateV10OptStatus b : QianchuanAdStatusUpdateV10OptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdStatusUpdateV10OptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdStatusUpdateV10OptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdStatusUpdateV10OptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdStatusUpdateV10OptStatus.fromValue(value);
    }
  }
}

