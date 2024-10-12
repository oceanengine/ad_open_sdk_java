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
@JsonAdapter(QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType.Adapter.class)
public enum QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType {
  
  EXTENSIVE("EXTENSIVE"),
  
  PHRASE("PHRASE"),
  
  PRECISION("PRECISION");

  private String value;

  QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType fromValue(String value) {
    for (QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType b : QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType.fromValue(value);
    }
  }
}

