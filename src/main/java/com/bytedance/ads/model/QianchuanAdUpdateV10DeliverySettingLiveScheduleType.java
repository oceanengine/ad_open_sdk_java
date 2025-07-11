/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
@JsonAdapter(QianchuanAdUpdateV10DeliverySettingLiveScheduleType.Adapter.class)
public enum QianchuanAdUpdateV10DeliverySettingLiveScheduleType {
  
  FROM_NOW("SCHEDULE_FROM_NOW"),
  
  START_END("SCHEDULE_START_END"),
  
  TIME_FIXEDRANGE("SCHEDULE_TIME_FIXEDRANGE");

  private String value;

  QianchuanAdUpdateV10DeliverySettingLiveScheduleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdUpdateV10DeliverySettingLiveScheduleType fromValue(String value) {
    for (QianchuanAdUpdateV10DeliverySettingLiveScheduleType b : QianchuanAdUpdateV10DeliverySettingLiveScheduleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdUpdateV10DeliverySettingLiveScheduleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdUpdateV10DeliverySettingLiveScheduleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdUpdateV10DeliverySettingLiveScheduleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdUpdateV10DeliverySettingLiveScheduleType.fromValue(value);
    }
  }
}

