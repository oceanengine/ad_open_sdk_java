/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(QianchuanProductAvailableGetV10DataProductListTags.Adapter.class)
public enum QianchuanProductAvailableGetV10DataProductListTags {
  
  Enum_1("1"),
  
  Enum_0("0");

  private String value;

  QianchuanProductAvailableGetV10DataProductListTags(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanProductAvailableGetV10DataProductListTags fromValue(String value) {
    for (QianchuanProductAvailableGetV10DataProductListTags b : QianchuanProductAvailableGetV10DataProductListTags.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanProductAvailableGetV10DataProductListTags> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanProductAvailableGetV10DataProductListTags enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanProductAvailableGetV10DataProductListTags read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanProductAvailableGetV10DataProductListTags.fromValue(value);
    }
  }
}

