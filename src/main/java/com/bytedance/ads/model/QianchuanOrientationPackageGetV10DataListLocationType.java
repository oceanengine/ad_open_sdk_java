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
@JsonAdapter(QianchuanOrientationPackageGetV10DataListLocationType.Adapter.class)
public enum QianchuanOrientationPackageGetV10DataListLocationType {
  
  CURRENT("CURRENT"),
  
  HOME("HOME"),
  
  TRAVEL("TRAVEL"),
  
  ALL("ALL");

  private String value;

  QianchuanOrientationPackageGetV10DataListLocationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanOrientationPackageGetV10DataListLocationType fromValue(String value) {
    for (QianchuanOrientationPackageGetV10DataListLocationType b : QianchuanOrientationPackageGetV10DataListLocationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanOrientationPackageGetV10DataListLocationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanOrientationPackageGetV10DataListLocationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanOrientationPackageGetV10DataListLocationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanOrientationPackageGetV10DataListLocationType.fromValue(value);
    }
  }
}

