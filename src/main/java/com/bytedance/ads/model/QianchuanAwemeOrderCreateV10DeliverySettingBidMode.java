/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(QianchuanAwemeOrderCreateV10DeliverySettingBidMode.Adapter.class)
public enum QianchuanAwemeOrderCreateV10DeliverySettingBidMode {
  
  PRICING_ACTION("PRICING_ACTION");

  private String value;

  QianchuanAwemeOrderCreateV10DeliverySettingBidMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeOrderCreateV10DeliverySettingBidMode fromValue(String value) {
    for (QianchuanAwemeOrderCreateV10DeliverySettingBidMode b : QianchuanAwemeOrderCreateV10DeliverySettingBidMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeOrderCreateV10DeliverySettingBidMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeOrderCreateV10DeliverySettingBidMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeOrderCreateV10DeliverySettingBidMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeOrderCreateV10DeliverySettingBidMode.fromValue(value);
    }
  }
}

