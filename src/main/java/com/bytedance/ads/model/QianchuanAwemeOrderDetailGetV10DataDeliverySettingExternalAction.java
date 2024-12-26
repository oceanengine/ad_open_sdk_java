/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction.Adapter.class)
public enum QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction {
  
  LIVE_CLICK_PRODUCT_ACTION("AD_CONVERT_TYPE_LIVE_CLICK_PRODUCT_ACTION"),
  
  LIVE_COMMENT_ACTION("AD_CONVERT_TYPE_LIVE_COMMENT_ACTION"),
  
  LIVE_EFFECTIVE_EFFECTIVE_VIEW("AD_CONVERT_TYPE_LIVE_EFFECTIVE_EFFECTIVE_VIEW"),
  
  LIVE_ENTER_ACTION("AD_CONVERT_TYPE_LIVE_ENTER_ACTION"),
  
  LIVE_HEAT("AD_CONVERT_TYPE_LIVE_HEAT"),
  
  LIVE_ROI("AD_CONVERT_TYPE_LIVE_ROI"),
  
  LIVE_SUCCESSORDER_ACTION("AD_CONVERT_TYPE_LIVE_SUCCESSORDER_ACTION"),
  
  LIVE_SUCCESSORDER_PAY("AD_CONVERT_TYPE_LIVE_SUCCESSORDER_PAY"),
  
  NEW_FOLLOW_ACTION("AD_CONVERT_TYPE_NEW_FOLLOW_ACTION"),
  
  QC_FOLLOW_ACTION("AD_CONVERT_TYPE_QC_FOLLOW_ACTION"),
  
  QC_MUST_BUY("AD_CONVERT_TYPE_QC_MUST_BUY"),
  
  SHOPPING("AD_CONVERT_TYPE_SHOPPING");

  private String value;

  QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction fromValue(String value) {
    for (QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction b : QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction.fromValue(value);
    }
  }
}

