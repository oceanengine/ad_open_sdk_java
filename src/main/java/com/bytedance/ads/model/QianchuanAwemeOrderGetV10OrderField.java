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
@JsonAdapter(QianchuanAwemeOrderGetV10OrderField.Adapter.class)
public enum QianchuanAwemeOrderGetV10OrderField {
  
  ORDER_CREATE_TIME("order_create_time"),
  
  PAY_ORDER_AMOUNT("pay_order_amount"),
  
  PREPAY_AND_PAY_ORDER_ROI("prepay_and_pay_order_roi"),
  
  STAT_COST("stat_cost");

  private String value;

  QianchuanAwemeOrderGetV10OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeOrderGetV10OrderField fromValue(String value) {
    for (QianchuanAwemeOrderGetV10OrderField b : QianchuanAwemeOrderGetV10OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeOrderGetV10OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeOrderGetV10OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeOrderGetV10OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeOrderGetV10OrderField.fromValue(value);
    }
  }
}

