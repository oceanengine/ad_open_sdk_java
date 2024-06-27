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
@JsonAdapter(QianchuanImageGetV10FilteringSources.Adapter.class)
public enum QianchuanImageGetV10FilteringSources {
  
  CREATIVE_CENTER("CREATIVE_CENTER"),
  
  E_COMMERCE("E_COMMERCE"),
  
  JI_CHUANG("JI_CHUANG");

  private String value;

  QianchuanImageGetV10FilteringSources(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanImageGetV10FilteringSources fromValue(String value) {
    for (QianchuanImageGetV10FilteringSources b : QianchuanImageGetV10FilteringSources.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanImageGetV10FilteringSources> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanImageGetV10FilteringSources enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanImageGetV10FilteringSources read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanImageGetV10FilteringSources.fromValue(value);
    }
  }
}

