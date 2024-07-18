/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(QianchuanAdUpdateV10KeywordsMatchType.Adapter.class)
public enum QianchuanAdUpdateV10KeywordsMatchType {
  
  EXTENSIVE("EXTENSIVE"),
  
  PHRASE("PHRASE"),
  
  PRECISION("PRECISION");

  private String value;

  QianchuanAdUpdateV10KeywordsMatchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdUpdateV10KeywordsMatchType fromValue(String value) {
    for (QianchuanAdUpdateV10KeywordsMatchType b : QianchuanAdUpdateV10KeywordsMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdUpdateV10KeywordsMatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdUpdateV10KeywordsMatchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdUpdateV10KeywordsMatchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdUpdateV10KeywordsMatchType.fromValue(value);
    }
  }
}

