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
@JsonAdapter(QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode.Adapter.class)
public enum QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode {
  
  ROOM("BY_ROOM"),
  
  VIDEO("BY_VIDEO");

  private String value;

  QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode fromValue(String value) {
    for (QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode b : QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode.fromValue(value);
    }
  }
}

