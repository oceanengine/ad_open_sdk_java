/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(QianchuanAdDetailGetV10DataKeywordsStatus.Adapter.class)
public enum QianchuanAdDetailGetV10DataKeywordsStatus {
  
  AUDIT("AUDIT"),
  
  CONFIRM("CONFIRM"),
  
  DELETE("DELETE"),
  
  PAUSED("PAUSED"),
  
  REJECT("REJECT");

  private String value;

  QianchuanAdDetailGetV10DataKeywordsStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataKeywordsStatus fromValue(String value) {
    for (QianchuanAdDetailGetV10DataKeywordsStatus b : QianchuanAdDetailGetV10DataKeywordsStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataKeywordsStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataKeywordsStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataKeywordsStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdDetailGetV10DataKeywordsStatus.fromValue(value);
    }
  }
}

