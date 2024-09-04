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
@JsonAdapter(ReportLiveRoomProductGetV2OrderField.Adapter.class)
public enum ReportLiveRoomProductGetV2OrderField {
  
  CLICK_PRODUCT_COUNT("click_product_count"),
  
  CLICK_PRODUCT_UCOUNT("click_product_ucount"),
  
  LIVE_ORDERS_COUNT("live_orders_count"),
  
  ORDER_UCOUNT("order_ucount"),
  
  PAY_ORDER_GMV("pay_order_gmv"),
  
  PAY_ORDER_COUNT("pay_order_count"),
  
  PAY_ORDER_UCOUNT("pay_order_ucount"),
  
  ORDER_CONVERT_RATE("order_convert_rate");

  private String value;

  ReportLiveRoomProductGetV2OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportLiveRoomProductGetV2OrderField fromValue(String value) {
    for (ReportLiveRoomProductGetV2OrderField b : ReportLiveRoomProductGetV2OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ReportLiveRoomProductGetV2OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportLiveRoomProductGetV2OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportLiveRoomProductGetV2OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportLiveRoomProductGetV2OrderField.fromValue(value);
    }
  }
}

