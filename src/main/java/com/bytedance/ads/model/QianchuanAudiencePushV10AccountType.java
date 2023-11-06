/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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
@JsonAdapter(QianchuanAudiencePushV10AccountType.Adapter.class)
public enum QianchuanAudiencePushV10AccountType {
  
  LOCAL("LOCAL"),
  
  NO_LOCAL("NO_LOCAL");

  private String value;

  QianchuanAudiencePushV10AccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAudiencePushV10AccountType fromValue(String value) {
    for (QianchuanAudiencePushV10AccountType b : QianchuanAudiencePushV10AccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAudiencePushV10AccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAudiencePushV10AccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAudiencePushV10AccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAudiencePushV10AccountType.fromValue(value);
    }
  }
}

