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
@JsonAdapter(QianchuanMaterialAdGetV10MaterialType.Adapter.class)
public enum QianchuanMaterialAdGetV10MaterialType {
  
  IMAGE("IMAGE"),
  
  LIVE_ROOM("LIVE_ROOM"),
  
  TITLE("TITLE"),
  
  VIDEO("VIDEO");

  private String value;

  QianchuanMaterialAdGetV10MaterialType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanMaterialAdGetV10MaterialType fromValue(String value) {
    for (QianchuanMaterialAdGetV10MaterialType b : QianchuanMaterialAdGetV10MaterialType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanMaterialAdGetV10MaterialType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanMaterialAdGetV10MaterialType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanMaterialAdGetV10MaterialType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanMaterialAdGetV10MaterialType.fromValue(value);
    }
  }
}

