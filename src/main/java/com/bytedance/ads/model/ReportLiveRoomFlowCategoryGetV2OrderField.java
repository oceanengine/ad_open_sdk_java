/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
@JsonAdapter(ReportLiveRoomFlowCategoryGetV2OrderField.Adapter.class)
public enum ReportLiveRoomFlowCategoryGetV2OrderField {
  
  LIVE_WATCH_COUNT("live_watch_count"),
  
  LIVE_WATCH_UCOUNT("live_watch_ucount"),
  
  LIVE_WATCH_DURATION("live_watch_duration"),
  
  PAY_ORDER_GMV("pay_order_gmv"),
  
  LIVE_COUNT("live_count"),
  
  LIVE_AVG_WATCH_COUNT("live_avg_watch_count"),
  
  LIVE_AVG_WATCH_DURATION("live_avg_watch_duration"),
  
  LIVE_PAY_AVG_ORDER_GMV("live_pay_avg_order_gmv"),
  
  LIVE_DURATION_60S_COUNT("live_duration_60s_count"),
  
  LIVE_DURATION_60S_UCOUNT("live_duration_60s_ucount"),
  
  LIVE_ONLINE_UCOUNT("live_online_ucount"),
  
  CLICK_PRODUCT_COUNT("click_product_count"),
  
  CLICK_PRODUCT_UCOUNT("click_product_ucount"),
  
  LIVE_ORDERS_COUNT("live_orders_count"),
  
  ORDER_UCOUNT("order_ucount"),
  
  PAY_ORDER_COUNT("pay_order_count"),
  
  PAY_ORDER_UCOUNT("pay_order_ucount"),
  
  ORDER_CONVERT_RATE("order_convert_rate"),
  
  PER_CUSTOMER_TRANSACTION("per_customer_transaction"),
  
  LIVE_FOLLOW_COUNT("live_follow_count"),
  
  LIVE_FANS_COUNT("live_fans_count"),
  
  LIVE_COMMENT_COUNT("live_comment_count"),
  
  LIVE_SHARE_COUNT("live_share_count"),
  
  LIVE_GIFT_COUNT("live_gift_count"),
  
  LIVE_GIFT_MONEY("live_gift_money"),
  
  CLICK_CART_COUNT("click_cart_count"),
  
  LIVE_DURATION_60S_COUNT_TO_LIVE_WATCH_COUNT_RATE("live_duration_60s_count_to_live_watch_count_rate"),
  
  CLICK_PRODUCT_COUNT_TO_LIVE_DURATION_60S_COUNT_RATE("click_product_count_to_live_duration_60s_count_rate"),
  
  LIVE_ORDERS_COUNT_TO_CLICK_PRODUCT_COUNT_RATE("live_orders_count_to_click_product_count_rate"),
  
  PAY_ORDER_COUNT_TO_LIVE_ORDERS_COUNT_RATE("pay_order_count_to_live_orders_count_rate"),
  
  LIVE_DURATION_60S_UCOUNT_TO_LIVE_WATCH_UCOUNT_RATE("live_duration_60s_ucount_to_live_watch_ucount_rate"),
  
  CLICK_PRODUCT_UCOUNT_TO_LIVE_DURATION_60S_UCOUNT_RATE("click_product_ucount_to_live_duration_60s_ucount_rate"),
  
  ORDER_UCOUNT_TO_CLICK_PRODUCT_UCOUNT_RATE("order_ucount_to_click_product_ucount_rate"),
  
  PAY_ORDER_UCOUNT_TO_ORDER_UCOUNT_RATE("pay_order_ucount_to_order_ucount_rate"),
  
  LIVE_CARD_ICON_COMPONENT_CLICK_COUNT("live_card_icon_component_click_count"),
  
  LIVE_CARD_ICON_COMPONENT_SHOW_COUNT("live_card_icon_component_show_count"),
  
  LIVE_COMPONENT_CTR("live_component_ctr"),
  
  LIVE_APP_DOWNLOAD_START_COUNT("live_app_download_start_count"),
  
  LIVE_APP_DOWNLOAD_FINISH_COUNT("live_app_download_finish_count"),
  
  LIVE_APP_INSTALL_FINISH_COUNT("live_app_install_finish_count"),
  
  LIVE_APP_ACTIVE_COUNT("live_app_active_count"),
  
  LIVE_APP_ACTIVE_REGISTER_COUNT("live_app_active_register_count"),
  
  LIVE_APP_GAME_PAY_COUNT("live_app_game_pay_count"),
  
  LIVE_APP_ACTIVE_PAY_COUNT("live_app_active_pay_count"),
  
  LIVE_APP_ATTRIBUTION_NEXT_DAY_OPEN_COUNT("live_app_attribution_next_day_open_count"),
  
  LIVE_APP_ATTRIBUTION_NEXT_DAY_OPEN_RATE("live_app_attribution_next_day_open_rate"),
  
  LIVE_GROUPBUY_ORDER_COUNT("live_groupbuy_order_count"),
  
  STAT_LIVE_GROUPBUY_ORDER_GMV("stat_live_groupbuy_order_gmv"),
  
  LIVE_FORM_SUBMIT_COUNT("live_form_submit_count");

  private String value;

  ReportLiveRoomFlowCategoryGetV2OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportLiveRoomFlowCategoryGetV2OrderField fromValue(String value) {
    for (ReportLiveRoomFlowCategoryGetV2OrderField b : ReportLiveRoomFlowCategoryGetV2OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ReportLiveRoomFlowCategoryGetV2OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportLiveRoomFlowCategoryGetV2OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportLiveRoomFlowCategoryGetV2OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportLiveRoomFlowCategoryGetV2OrderField.fromValue(value);
    }
  }
}

