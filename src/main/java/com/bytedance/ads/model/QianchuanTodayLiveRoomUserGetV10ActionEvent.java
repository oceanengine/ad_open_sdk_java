/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(QianchuanTodayLiveRoomUserGetV10ActionEvent.Adapter.class)
public enum QianchuanTodayLiveRoomUserGetV10ActionEvent {
  
  ENTER("ENTER"),
  
  PAY("PAY");

  private String value;

  QianchuanTodayLiveRoomUserGetV10ActionEvent(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanTodayLiveRoomUserGetV10ActionEvent fromValue(String value) {
    for (QianchuanTodayLiveRoomUserGetV10ActionEvent b : QianchuanTodayLiveRoomUserGetV10ActionEvent.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanTodayLiveRoomUserGetV10ActionEvent> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanTodayLiveRoomUserGetV10ActionEvent enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanTodayLiveRoomUserGetV10ActionEvent read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanTodayLiveRoomUserGetV10ActionEvent.fromValue(value);
    }
  }
}

