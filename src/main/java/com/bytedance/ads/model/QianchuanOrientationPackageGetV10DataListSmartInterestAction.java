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
@JsonAdapter(QianchuanOrientationPackageGetV10DataListSmartInterestAction.Adapter.class)
public enum QianchuanOrientationPackageGetV10DataListSmartInterestAction {
  
  RECOMMEND("RECOMMEND"),
  
  CUSTOM("CUSTOM");

  private String value;

  QianchuanOrientationPackageGetV10DataListSmartInterestAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanOrientationPackageGetV10DataListSmartInterestAction fromValue(String value) {
    for (QianchuanOrientationPackageGetV10DataListSmartInterestAction b : QianchuanOrientationPackageGetV10DataListSmartInterestAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanOrientationPackageGetV10DataListSmartInterestAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanOrientationPackageGetV10DataListSmartInterestAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanOrientationPackageGetV10DataListSmartInterestAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanOrientationPackageGetV10DataListSmartInterestAction.fromValue(value);
    }
  }
}

