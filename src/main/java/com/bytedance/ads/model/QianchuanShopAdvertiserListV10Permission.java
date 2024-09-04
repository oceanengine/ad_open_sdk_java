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
@JsonAdapter(QianchuanShopAdvertiserListV10Permission.Adapter.class)
public enum QianchuanShopAdvertiserListV10Permission {
  
  QC_AWEME("QC_AWEME");

  private String value;

  QianchuanShopAdvertiserListV10Permission(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanShopAdvertiserListV10Permission fromValue(String value) {
    for (QianchuanShopAdvertiserListV10Permission b : QianchuanShopAdvertiserListV10Permission.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanShopAdvertiserListV10Permission> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanShopAdvertiserListV10Permission enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanShopAdvertiserListV10Permission read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanShopAdvertiserListV10Permission.fromValue(value);
    }
  }
}

