/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(QianchuanUniPromotionListV10OrderField.Adapter.class)
public enum QianchuanUniPromotionListV10OrderField {
  
  CREATE_TIME("create_time"),
  
  STAT_COST("stat_cost"),
  
  TOTAL_COST_PER_PAY_ORDER_FOR_ROI2("total_cost_per_pay_order_for_roi2"),
  
  TOTAL_PAY_ORDER_COUNT_FOR_ROI2("total_pay_order_count_for_roi2"),
  
  TOTAL_PAY_ORDER_COUPON_AMOUNT_FOR_ROI2("total_pay_order_coupon_amount_for_roi2"),
  
  TOTAL_PAY_ORDER_GMV_FOR_ROI2("total_pay_order_gmv_for_roi2"),
  
  TOTAL_PREPAY_AND_PAY_ORDER_ROI2("total_prepay_and_pay_order_roi2"),
  
  TOTAL_PREPAY_ORDER_COUNT_FOR_ROI2("total_prepay_order_count_for_roi2"),
  
  TOTAL_PREPAY_ORDER_GMV_FOR_ROI2("total_prepay_order_gmv_for_roi2"),
  
  TOTAL_UNFINISHED_ESTIMATE_ORDER_GMV_FOR_ROI2("total_unfinished_estimate_order_gmv_for_roi2");

  private String value;

  QianchuanUniPromotionListV10OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionListV10OrderField fromValue(String value) {
    for (QianchuanUniPromotionListV10OrderField b : QianchuanUniPromotionListV10OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionListV10OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionListV10OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionListV10OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionListV10OrderField.fromValue(value);
    }
  }
}

