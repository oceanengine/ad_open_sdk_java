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
@JsonAdapter(QianchuanAdDetailGetV10DataDeliverySettingDeepBidType.Adapter.class)
public enum QianchuanAdDetailGetV10DataDeliverySettingDeepBidType {
  
  COMM_ROI("COMM_ROI"),
  
  MIN("MIN"),
  
  MIN_SECOND_STAGE("MIN_SECOND_STAGE"),
  
  PACING("PACING"),
  
  PAY_ROI("PAY_ROI");

  private String value;

  QianchuanAdDetailGetV10DataDeliverySettingDeepBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataDeliverySettingDeepBidType fromValue(String value) {
    for (QianchuanAdDetailGetV10DataDeliverySettingDeepBidType b : QianchuanAdDetailGetV10DataDeliverySettingDeepBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataDeliverySettingDeepBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataDeliverySettingDeepBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataDeliverySettingDeepBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdDetailGetV10DataDeliverySettingDeepBidType.fromValue(value);
    }
  }
}

