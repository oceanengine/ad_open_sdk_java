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
@JsonAdapter(QianchuanProductAvailableGetV10FilterTab.Adapter.class)
public enum QianchuanProductAvailableGetV10FilterTab {
  
  ALL("SEPARATE_NEW_PRODUCT_ALL"),
  
  TO_BREAK_TEN("SEPARATE_NEW_PRODUCT_TO_BREAK_TEN"),
  
  TO_BREAK_ZERO("SEPARATE_NEW_PRODUCT_TO_BREAK_ZERO");

  private String value;

  QianchuanProductAvailableGetV10FilterTab(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanProductAvailableGetV10FilterTab fromValue(String value) {
    for (QianchuanProductAvailableGetV10FilterTab b : QianchuanProductAvailableGetV10FilterTab.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanProductAvailableGetV10FilterTab> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanProductAvailableGetV10FilterTab enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanProductAvailableGetV10FilterTab read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanProductAvailableGetV10FilterTab.fromValue(value);
    }
  }
}

