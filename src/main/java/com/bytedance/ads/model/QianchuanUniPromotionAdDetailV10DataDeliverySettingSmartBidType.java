/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType.Adapter.class)
public enum QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType {
  
  CONSERVATIVE("SMART_BID_CONSERVATIVE"),
  
  CUSTOM("SMART_BID_CUSTOM");

  private String value;

  QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType fromValue(String value) {
    for (QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType b : QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType.fromValue(value);
    }
  }
}

