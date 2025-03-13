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
@JsonAdapter(QianchuanTodayLiveRoomUserGetV10Dimension.Adapter.class)
public enum QianchuanTodayLiveRoomUserGetV10Dimension {
  
  AGE("AGE"),
  
  CITY("CITY"),
  
  GENDER("GENDER");

  private String value;

  QianchuanTodayLiveRoomUserGetV10Dimension(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanTodayLiveRoomUserGetV10Dimension fromValue(String value) {
    for (QianchuanTodayLiveRoomUserGetV10Dimension b : QianchuanTodayLiveRoomUserGetV10Dimension.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanTodayLiveRoomUserGetV10Dimension> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanTodayLiveRoomUserGetV10Dimension enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanTodayLiveRoomUserGetV10Dimension read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanTodayLiveRoomUserGetV10Dimension.fromValue(value);
    }
  }
}

