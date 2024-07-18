/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(QianchuanUniAwemeAdCreateV10DeliverySettingSmartBidType.Adapter.class)
public enum QianchuanUniAwemeAdCreateV10DeliverySettingSmartBidType {
  
  SMART_BID_CUSTOM("SMART_BID_CUSTOM");

  private String value;

  QianchuanUniAwemeAdCreateV10DeliverySettingSmartBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniAwemeAdCreateV10DeliverySettingSmartBidType fromValue(String value) {
    for (QianchuanUniAwemeAdCreateV10DeliverySettingSmartBidType b : QianchuanUniAwemeAdCreateV10DeliverySettingSmartBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniAwemeAdCreateV10DeliverySettingSmartBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniAwemeAdCreateV10DeliverySettingSmartBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniAwemeAdCreateV10DeliverySettingSmartBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniAwemeAdCreateV10DeliverySettingSmartBidType.fromValue(value);
    }
  }
}
