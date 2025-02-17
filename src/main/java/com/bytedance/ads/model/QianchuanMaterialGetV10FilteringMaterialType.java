/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(QianchuanMaterialGetV10FilteringMaterialType.Adapter.class)
public enum QianchuanMaterialGetV10FilteringMaterialType {
  
  IMAGE("IMAGE"),
  
  LIVE_ROOM("LIVE_ROOM"),
  
  TITLE("TITLE"),
  
  VIDEO("VIDEO");

  private String value;

  QianchuanMaterialGetV10FilteringMaterialType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanMaterialGetV10FilteringMaterialType fromValue(String value) {
    for (QianchuanMaterialGetV10FilteringMaterialType b : QianchuanMaterialGetV10FilteringMaterialType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanMaterialGetV10FilteringMaterialType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanMaterialGetV10FilteringMaterialType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanMaterialGetV10FilteringMaterialType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanMaterialGetV10FilteringMaterialType.fromValue(value);
    }
  }
}

