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
@JsonAdapter(QianchuanQianchuanReportTodayLiveRoomConfigGetV10DataTopics.Adapter.class)
public enum QianchuanQianchuanReportTodayLiveRoomConfigGetV10DataTopics {
  
  FLOW_PERFORMANCE("ROOM_FLOW_PERFORMANCE"),
  
  PRODUCT_LIST("ROOM_PRODUCT_LIST");

  private String value;

  QianchuanQianchuanReportTodayLiveRoomConfigGetV10DataTopics(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanQianchuanReportTodayLiveRoomConfigGetV10DataTopics fromValue(String value) {
    for (QianchuanQianchuanReportTodayLiveRoomConfigGetV10DataTopics b : QianchuanQianchuanReportTodayLiveRoomConfigGetV10DataTopics.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanQianchuanReportTodayLiveRoomConfigGetV10DataTopics> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanQianchuanReportTodayLiveRoomConfigGetV10DataTopics enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanQianchuanReportTodayLiveRoomConfigGetV10DataTopics read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanQianchuanReportTodayLiveRoomConfigGetV10DataTopics.fromValue(value);
    }
  }
}

