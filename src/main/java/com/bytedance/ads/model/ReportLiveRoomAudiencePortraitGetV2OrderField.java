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
@JsonAdapter(ReportLiveRoomAudiencePortraitGetV2OrderField.Adapter.class)
public enum ReportLiveRoomAudiencePortraitGetV2OrderField {
  
  LIVE_WATCH_COUNT("live_watch_count"),
  
  LIVE_FOLLOW_COUNT("live_follow_count"),
  
  LIVE_FANS_COUNT("live_fans_count"),
  
  LIVE_SHARE_COUNT("live_share_count"),
  
  LIVE_COMMENT_COUNT("live_comment_count"),
  
  LIVE_GIFT_COUNT("live_gift_count"),
  
  LIVE_GIFT_MONEY("live_gift_money"),
  
  CLICK_CART_COUNT("click_cart_count"),
  
  CLICK_PRODUCT_COUNT("click_product_count"),
  
  LIVE_ORDERS_COUNT("live_orders_count"),
  
  PAY_ORDER_COUNT("pay_order_count"),
  
  PAY_ORDER_GMV("pay_order_gmv"),
  
  PER_CUSTOMER_TRANSACTION("per_customer_transaction");

  private String value;

  ReportLiveRoomAudiencePortraitGetV2OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportLiveRoomAudiencePortraitGetV2OrderField fromValue(String value) {
    for (ReportLiveRoomAudiencePortraitGetV2OrderField b : ReportLiveRoomAudiencePortraitGetV2OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ReportLiveRoomAudiencePortraitGetV2OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportLiveRoomAudiencePortraitGetV2OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportLiveRoomAudiencePortraitGetV2OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportLiveRoomAudiencePortraitGetV2OrderField.fromValue(value);
    }
  }
}

