/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@JsonAdapter(QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType.Adapter.class)
public enum QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType {
  
  FROM_NOW("SCHEDULE_FROM_NOW"),
  
  START_END("SCHEDULE_START_END");

  private String value;

  QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType fromValue(String value) {
    for (QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType b : QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType.fromValue(value);
    }
  }
}

