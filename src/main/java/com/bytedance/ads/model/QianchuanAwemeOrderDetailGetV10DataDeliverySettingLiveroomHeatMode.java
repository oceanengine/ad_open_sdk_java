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
@JsonAdapter(QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode.Adapter.class)
public enum QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode {
  
  ROOM("BY_ROOM"),
  
  VIDEO("BY_VIDEO");

  private String value;

  QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode fromValue(String value) {
    for (QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode b : QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode.fromValue(value);
    }
  }
}

