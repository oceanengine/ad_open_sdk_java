/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
@JsonAdapter(QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction.Adapter.class)
public enum QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction {
  
  CARD_ACTIVE("AD_CONVERT_TYPE_CARD_ACTIVE"),
  
  LIVE_CLICK_PRODUCT_ACTION("AD_CONVERT_TYPE_LIVE_CLICK_PRODUCT_ACTION"),
  
  LIVE_COMMENT_ACTION("AD_CONVERT_TYPE_LIVE_COMMENT_ACTION"),
  
  LIVE_ENTER_ACTION("AD_CONVERT_TYPE_LIVE_ENTER_ACTION"),
  
  LIVE_PAY_ROI("AD_CONVERT_TYPE_LIVE_PAY_ROI"),
  
  LIVE_SUCCESSORDER_ACTION("AD_CONVERT_TYPE_LIVE_SUCCESSORDER_ACTION"),
  
  LIVE_SUCCESSORDER_PAY("AD_CONVERT_TYPE_LIVE_SUCCESSORDER_PAY"),
  
  LIVE_SUCCESSORDER_PAY_7DAYS("AD_CONVERT_TYPE_LIVE_SUCCESSORDER_PAY_7DAYS"),
  
  LIVE_SUCCESSORDER_SETTLE("AD_CONVERT_TYPE_LIVE_SUCCESSORDER_SETTLE"),
  
  NEW_FOLLOW_ACTION("AD_CONVERT_TYPE_NEW_FOLLOW_ACTION"),
  
  QC_FOLLOW_ACTION("AD_CONVERT_TYPE_QC_FOLLOW_ACTION"),
  
  QC_MUST_BUY("AD_CONVERT_TYPE_QC_MUST_BUY"),
  
  SHOPPING("AD_CONVERT_TYPE_SHOPPING");

  private String value;

  QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction fromValue(String value) {
    for (QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction b : QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction.fromValue(value);
    }
  }
}

