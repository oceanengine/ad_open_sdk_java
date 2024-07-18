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
@JsonAdapter(QianchuanAwemeOrderCreateV10DeliverySettingExternalAction.Adapter.class)
public enum QianchuanAwemeOrderCreateV10DeliverySettingExternalAction {
  
  LIVE_CLICK_PRODUCT_ACTION("AD_CONVERT_TYPE_LIVE_CLICK_PRODUCT_ACTION"),
  
  LIVE_HEAT("AD_CONVERT_TYPE_LIVE_HEAT"),
  
  LIVE_ROI("AD_CONVERT_TYPE_LIVE_ROI"),
  
  LIVE_SUCCESSORDER_ACTION("AD_CONVERT_TYPE_LIVE_SUCCESSORDER_ACTION"),
  
  LIVE_SUCCESSORDER_PAY("AD_CONVERT_TYPE_LIVE_SUCCESSORDER_PAY"),
  
  NEW_FOLLOW_ACTION("AD_CONVERT_TYPE_NEW_FOLLOW_ACTION"),
  
  QC_FOLLOW_ACTION("AD_CONVERT_TYPE_QC_FOLLOW_ACTION"),
  
  QC_MUST_BUY("AD_CONVERT_TYPE_QC_MUST_BUY"),
  
  SHOPPING("AD_CONVERT_TYPE_SHOPPING");

  private String value;

  QianchuanAwemeOrderCreateV10DeliverySettingExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeOrderCreateV10DeliverySettingExternalAction fromValue(String value) {
    for (QianchuanAwemeOrderCreateV10DeliverySettingExternalAction b : QianchuanAwemeOrderCreateV10DeliverySettingExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeOrderCreateV10DeliverySettingExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeOrderCreateV10DeliverySettingExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeOrderCreateV10DeliverySettingExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeOrderCreateV10DeliverySettingExternalAction.fromValue(value);
    }
  }
}

