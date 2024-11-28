/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(QianchuanAdCreateV10DeliverySettingVideoScheduleType.Adapter.class)
public enum QianchuanAdCreateV10DeliverySettingVideoScheduleType {
  
  FROM_NOW("SCHEDULE_FROM_NOW"),
  
  START_END("SCHEDULE_START_END");

  private String value;

  QianchuanAdCreateV10DeliverySettingVideoScheduleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdCreateV10DeliverySettingVideoScheduleType fromValue(String value) {
    for (QianchuanAdCreateV10DeliverySettingVideoScheduleType b : QianchuanAdCreateV10DeliverySettingVideoScheduleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdCreateV10DeliverySettingVideoScheduleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdCreateV10DeliverySettingVideoScheduleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdCreateV10DeliverySettingVideoScheduleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdCreateV10DeliverySettingVideoScheduleType.fromValue(value);
    }
  }
}

