/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.1
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
@JsonAdapter(QianchuanAdDetailGetV10DataAudienceAge.Adapter.class)
public enum QianchuanAdDetailGetV10DataAudienceAge {
  
  ABOVE_50("AGE_ABOVE_50"),
  
  BETWEEN_18_23("AGE_BETWEEN_18_23"),
  
  BETWEEN_24_30("AGE_BETWEEN_24_30"),
  
  BETWEEN_31_40("AGE_BETWEEN_31_40"),
  
  BETWEEN_41_49("AGE_BETWEEN_41_49");

  private String value;

  QianchuanAdDetailGetV10DataAudienceAge(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataAudienceAge fromValue(String value) {
    for (QianchuanAdDetailGetV10DataAudienceAge b : QianchuanAdDetailGetV10DataAudienceAge.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataAudienceAge> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataAudienceAge enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataAudienceAge read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdDetailGetV10DataAudienceAge.fromValue(value);
    }
  }
}
