/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(QianchuanVideoGetV10FilteringImageMode.Adapter.class)
public enum QianchuanVideoGetV10FilteringImageMode {
  
  LARGE("VIDEO_LARGE"),
  
  VERTICAL("VIDEO_VERTICAL");

  private String value;

  QianchuanVideoGetV10FilteringImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanVideoGetV10FilteringImageMode fromValue(String value) {
    for (QianchuanVideoGetV10FilteringImageMode b : QianchuanVideoGetV10FilteringImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanVideoGetV10FilteringImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanVideoGetV10FilteringImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanVideoGetV10FilteringImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanVideoGetV10FilteringImageMode.fromValue(value);
    }
  }
}

