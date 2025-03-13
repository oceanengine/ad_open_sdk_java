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
@JsonAdapter(QianchuanQianchuanVideoStarGetV10OrderField.Adapter.class)
public enum QianchuanQianchuanVideoStarGetV10OrderField {
  
  CREAT_TIME("creat_time"),
  
  STAT_COST("stat_cost"),
  
  CTR("ctr"),
  
  CONVERT_RATE("convert_rate"),
  
  TOTAL_PREPAY_AND_PAY_ORDER_ROI2("total_prepay_and_pay_order_roi2"),
  
  TOTAL_PAY_ORDER_GMV_FOR_ROI2("total_pay_order_gmv_for_roi2"),
  
  VIEW_CNT("view_cnt"),
  
  LIKE_CNT("like_cnt"),
  
  COMMENT_CNT("comment_cnt"),
  
  SHARE_CNT("share_cnt");

  private String value;

  QianchuanQianchuanVideoStarGetV10OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanQianchuanVideoStarGetV10OrderField fromValue(String value) {
    for (QianchuanQianchuanVideoStarGetV10OrderField b : QianchuanQianchuanVideoStarGetV10OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanQianchuanVideoStarGetV10OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanQianchuanVideoStarGetV10OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanQianchuanVideoStarGetV10OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanQianchuanVideoStarGetV10OrderField.fromValue(value);
    }
  }
}

