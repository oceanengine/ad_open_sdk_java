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
@JsonAdapter(QianchuanMaterialAdGetV10PageSize.Adapter.class)
public enum QianchuanMaterialAdGetV10PageSize {
  
  NUMBER_10(10l),
  
  NUMBER_100(100l),
  
  NUMBER_20(20l),
  
  NUMBER_50(50l);

  private Long value;

  QianchuanMaterialAdGetV10PageSize(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanMaterialAdGetV10PageSize fromValue(Long value) {
    for (QianchuanMaterialAdGetV10PageSize b : QianchuanMaterialAdGetV10PageSize.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanMaterialAdGetV10PageSize> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanMaterialAdGetV10PageSize enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanMaterialAdGetV10PageSize read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanMaterialAdGetV10PageSize.fromValue(value);
    }
  }
}

