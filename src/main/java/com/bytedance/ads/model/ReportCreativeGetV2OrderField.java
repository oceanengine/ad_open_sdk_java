/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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
@JsonAdapter(ReportCreativeGetV2OrderField.Adapter.class)
public enum ReportCreativeGetV2OrderField {
  
  ADVANCED_CREATIVE_FORM_CLICK("advanced_creative_form_click"),
  
  CLICK_CALL_DY("click_call_dy"),
  
  ATTRIBUTION_RETENTION_6D_COST("attribution_retention_6d_cost"),
  
  STAT_UNION_LTV_7("stat_union_ltv_7"),
  
  COMMUTE_FIRST_PAY_COUNT("commute_first_pay_count"),
  
  COUPON("coupon"),
  
  LOAN_COMPLETION_RATE("loan_completion_rate"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_2DAYS("attribution_game_in_app_ltv_2days"),
  
  APPROVAL_COUNT("approval_count"),
  
  HOME_VISITED("home_visited"),
  
  PRE_LOAN_CREDIT("pre_loan_credit"),
  
  ATTRIBUTION_RETENTION_4D_RATE("attribution_retention_4d_rate"),
  
  ATTRIBUTION_RETENTION_4D_CNT("attribution_retention_4d_cnt"),
  
  INTERACT_PER_COST("interact_per_cost"),
  
  SUBMIT_CERTIFICATION_COUNT("submit_certification_count"),
  
  LIVE_WATCH_ONE_MINUTE_COUNT("live_watch_one_minute_count"),
  
  ATTRIBUTION_RETENTION_2D_CNT("attribution_retention_2d_cnt"),
  
  NEXT_DAY_OPEN_COST("next_day_open_cost"),
  
  CUSTOMER_EFFECTIVE("customer_effective"),
  
  LUBAN_LIVE_ENTER_CNT("luban_live_enter_cnt"),
  
  CONVERT_COST("convert_cost"),
  
  CLICK_WEBSITE("click_website"),
  
  DEEP_CONVERT("deep_convert"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_4DAYS("attribution_game_in_app_ltv_4days"),
  
  ATTRIBUTION_RETENTION_5D_CNT("attribution_retention_5d_cnt"),
  
  GAME_PAY_COST("game_pay_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_ROI("attribution_active_pay_intra_one_day_roi"),
  
  FIRST_ORDER_COUNT("first_order_count"),
  
  WECHAT_LOGIN_COUNT("wechat_login_count"),
  
  IN_APP_UV("in_app_uv"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COST("attribution_wechat_login_30d_cost"),
  
  ACTIVE_REGISTER_RATE("active_register_rate"),
  
  ADVANCED_CREATIVE_PHONE_CLICK("advanced_creative_phone_click"),
  
  WECHAT_FIRST_PAY_RATE("wechat_first_pay_rate"),
  
  PLAY_DURATION_3S_RATE("play_duration_3s_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_1DAY("attribution_game_in_app_roi_1day"),
  
  PLAY_DURATION_3S("play_duration_3s"),
  
  DOWNLOAD_START_COST("download_start_cost"),
  
  MESSAGE_ACTION("message_action"),
  
  WECHAT_FIRST_PAY_COUNT("wechat_first_pay_count"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_6DAYS("attribution_game_in_app_ltv_6days"),
  
  LUBAN_LIVE_CLICK_PRODUCT_CNT("luban_live_click_product_cnt"),
  
  DOWNLOAD_START("download_start"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_PER_COUNT("attribution_active_pay_7d_per_count"),
  
  ATTRIBUTION_RETENTION_5D_RATE("attribution_retention_5d_rate"),
  
  IES_MUSIC_CLICK("ies_music_click"),
  
  PAY_COUNT("pay_count"),
  
  REPORT("report"),
  
  LUBAN_ORDER_STAT_AMOUNT("luban_order_stat_amount"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COST("attribution_active_pay_intra_one_day_cost"),
  
  PHONE_CONNECT("phone_connect"),
  
  SHARE("share"),
  
  PLAY_DURATION_2S_RATE("play_duration_2s_rate"),
  
  FORM("form"),
  
  ATTRIBUTION_MICRO_GAME_0D_LTV("attribution_micro_game_0d_ltv"),
  
  PLAY_DURATION("play_duration"),
  
  WECHAT_PAY_AMOUNT("wechat_pay_amount"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COUNT("attribution_wechat_login_30d_count"),
  
  IN_APP_ORDER("in_app_order"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COUNT("attribution_active_pay_intra_one_day_count"),
  
  GAME_ADDICTION_COST("game_addiction_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_4DAYS("attribution_game_in_app_roi_4days"),
  
  ATTRIBUTION_WECHAT_PAY_30D_AMOUNT("attribution_wechat_pay_30d_amount"),
  
  ACTIVE_REGISTER_COST("active_register_cost"),
  
  LUBAN_ORDER_ROI("luban_order_roi"),
  
  CONVERT_SHOW_RATE("convert_show_rate"),
  
  ATTRIBUTION_RETENTION_4D_COST("attribution_retention_4d_cost"),
  
  PLAY_DURATION_10S("play_duration_10s"),
  
  LOAN_CREDIT_COST("loan_credit_cost"),
  
  PLAY_75_FEED_BREAK("play_75_feed_break"),
  
  DOWNLOAD_FINISH_RATE("download_finish_rate"),
  
  LUBAN_LIVE_GIFT_AMOUNT("luban_live_gift_amount"),
  
  PLAY_75_FEED_BREAK_RATE("play_75_feed_break_rate"),
  
  NEXT_DAY_OPEN("next_day_open"),
  
  CLICK("click"),
  
  ATTRIBUTION_MICRO_GAME_7D_ROI("attribution_micro_game_7d_roi"),
  
  UNION_ROI_3("union_roi_3"),
  
  DOWNLOAD_START_RATE("download_start_rate"),
  
  ATTRIBUTION_GAME_PAY_7D_COUNT("attribution_game_pay_7d_count"),
  
  ATTRIBUTION_MICRO_GAME_3D_ROI("attribution_micro_game_3d_roi"),
  
  LOAN_CREDIT_RATE("loan_credit_rate"),
  
  GAME_PAY_COUNT("game_pay_count"),
  
  ATTRIBUTION_RETENTION_7D_RATE("attribution_retention_7d_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_7DAYS("attribution_game_in_app_roi_7days"),
  
  PLAY_OVER_RATE("play_over_rate"),
  
  REGISTER("register"),
  
  POI_ADDRESS_CLICK("poi_address_click"),
  
  ATTRIBUTION_RETENTION_2D_RATE("attribution_retention_2d_rate"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COST("attribution_wechat_first_pay_30d_cost"),
  
  ACTIVE_PAY_AMOUNT("active_pay_amount"),
  
  DOWNLOAD("download"),
  
  LUBAN_LIVE_COMMENT_CNT("luban_live_comment_cnt"),
  
  PRE_CONVERT_COST("pre_convert_cost"),
  
  BUTTON("button"),
  
  PLAY_DURATION_SUM("play_duration_sum"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_2DAYS("attribution_game_in_app_roi_2days"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_7DAYS("attribution_game_in_app_ltv_7days"),
  
  LOCATION_CLICK("location_click"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_5DAYS("attribution_game_in_app_ltv_5days"),
  
  ATTRIBUTION_RETENTION_7D_COST("attribution_retention_7d_cost"),
  
  DOWNLOAD_FINISH("download_finish"),
  
  VALID_PLAY("valid_play"),
  
  COMMENT("comment"),
  
  PLAY_DURATION_10S_RATE("play_duration_10s_rate"),
  
  PRE_LOAN_CREDIT_COST("pre_loan_credit_cost"),
  
  ATTRIBUTION_MICRO_GAME_3D_LTV("attribution_micro_game_3d_ltv"),
  
  ATTRIBUTION_RETENTION_3D_COST("attribution_retention_3d_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_AMOUNT("attribution_active_pay_intra_one_day_amount"),
  
  ATTRIBUTION_DEEP_CONVERT("attribution_deep_convert"),
  
  REDIRECT_TO_SHOP("redirect_to_shop"),
  
  WIFI_PLAY("wifi_play"),
  
  CONVERT("convert"),
  
  DISLIKE("dislike"),
  
  TOTAL_PLAY("total_play"),
  
  VALID_PLAY_COST("valid_play_cost"),
  
  LOAN_COMPLETION_COST("loan_completion_cost"),
  
  LIVE_COMPONENT_CLICK_COST("live_component_click_cost"),
  
  ATTRIBUTION_RETENTION_7D_SUM_CNT("attribution_retention_7d_sum_cnt"),
  
  INSTALL_FINISH_RATE("install_finish_rate"),
  
  COST("cost"),
  
  FOLLOW("follow"),
  
  CLICK_INSTALL("click_install"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COST("attribution_active_pay_7d_cost"),
  
  PLAY_25_FEED_BREAK("play_25_feed_break"),
  
  ACTIVE("active"),
  
  CPC("cpc"),
  
  CONSULT("consult"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COUNT("attribution_wechat_first_pay_30d_count"),
  
  LUBAN_LIVE_GIFT_CNT("luban_live_gift_cnt"),
  
  NEXT_DAY_OPEN_RATE("next_day_open_rate"),
  
  ATTRIBUTION_CONVERT("attribution_convert"),
  
  ADVANCED_CREATIVE_FORM_SUBMIT("advanced_creative_form_submit"),
  
  DEEP_CONVERT_RATE("deep_convert_rate"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COUNT("attribution_active_pay_7d_count"),
  
  PAY_AMOUNT_ROI("pay_amount_roi"),
  
  QQ("qq"),
  
  AVERAGE_PLAY_PROGRESS("average_play_progress"),
  
  ATTRIBUTION_RETENTION_5D_COST("attribution_retention_5d_cost"),
  
  LUBAN_LIVE_SLIDECART_CLICK_CNT("luban_live_slidecart_click_cnt"),
  
  WECHAT("wechat"),
  
  PHONE_EFFECTIVE("phone_effective"),
  
  ATTRIBUTION_WECHAT_PAY_30D_ROI("attribution_wechat_pay_30d_roi"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_RATE("attribution_next_day_open_rate"),
  
  ADVANCED_CREATIVE_COUNSEL_CLICK("advanced_creative_counsel_click"),
  
  CLICK_SHOPWINDOW("click_shopwindow"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_8DAYS("attribution_game_in_app_roi_8days"),
  
  MAP_SEARCH("map_search"),
  
  ACTIVE_COST("active_cost"),
  
  ATTRIBUTION_GAME_PAY_7D_COST("attribution_game_pay_7d_cost"),
  
  ATTRIBUTION_RETENTION_3D_RATE("attribution_retention_3d_rate"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_8DAYS("attribution_game_in_app_ltv_8days"),
  
  AVG_CLICK_COST("avg_click_cost"),
  
  ATTRIBUTION_RETENTION_7D_CNT("attribution_retention_7d_cnt"),
  
  VOTE("vote"),
  
  FIRST_RENTAL_ORDER_COUNT("first_rental_order_count"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_COST("attribution_next_day_open_cost"),
  
  PHONE("phone"),
  
  LOTTERY("lottery"),
  
  PLAY_100_FEED_BREAK("play_100_feed_break"),
  
  SHOW("show"),
  
  DEEP_CONVERT_COST("deep_convert_cost"),
  
  CONSULT_EFFECTIVE("consult_effective"),
  
  PLAY_DURATION_2S("play_duration_2s"),
  
  UNION_ROI_0("union_roi_0"),
  
  ACTIVE_PAY_RATE("active_pay_rate"),
  
  ATTRIBUTION_RETENTION_3D_CNT("attribution_retention_3d_cnt"),
  
  PRE_CONVERT_COUNT("pre_convert_count"),
  
  SHOPPING("shopping"),
  
  PLAY_100_FEED_BREAK_RATE("play_100_feed_break_rate"),
  
  ATTRIBUTION_MICRO_GAME_7D_LTV("attribution_micro_game_7d_ltv"),
  
  WIFI_PLAY_RATE("wifi_play_rate"),
  
  GAME_ADDICTION("game_addiction"),
  
  LIKE("like"),
  
  AVG_RANK("avg_rank"),
  
  ATTRIBUTION_RETENTION_7D_TOTAL_COST("attribution_retention_7d_total_cost"),
  
  VALID_PLAY_RATE("valid_play_rate"),
  
  PLAY_25_FEED_BREAK_RATE("play_25_feed_break_rate"),
  
  INSTALL_FINISH_COST("install_finish_cost"),
  
  INSTALL_FINISH("install_finish"),
  
  PHONE_CONFIRM("phone_confirm"),
  
  LUBAN_ORDER_CNT("luban_order_cnt"),
  
  POI_COLLECT("poi_collect"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_RATE("attribution_active_pay_7d_rate"),
  
  LUBAN_LIVE_SHARE_CNT("luban_live_share_cnt"),
  
  PLAY_OVER("play_over"),
  
  LOAN_CREDIT("loan_credit"),
  
  AVERAGE_PLAY_TIME_PER_PLAY("average_play_time_per_play"),
  
  PLAY_DURATION_5S_RATE("play_duration_5s_rate"),
  
  LUBAN_LIVE_PAY_ORDER_STAT_COST("luban_live_pay_order_stat_cost"),
  
  CTR("ctr"),
  
  IN_APP_DETAIL_UV("in_app_detail_uv"),
  
  WECHAT_FIRST_PAY_COST("wechat_first_pay_cost"),
  
  STAT_UNION_LTV_3("stat_union_ltv_3"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_3DAYS("attribution_game_in_app_ltv_3days"),
  
  ACTIVE_PAY_COST("active_pay_cost"),
  
  ATTRIBUTION_DAY_ACTIVE_PAY_COUNT("attribution_day_active_pay_count"),
  
  LIVE_COMPONENT_CLICK_RATE("live_component_click_rate"),
  
  IES_CHALLENGE_CLICK("ies_challenge_click"),
  
  ATTRIBUTION_RETENTION_2D_COST("attribution_retention_2d_cost"),
  
  CLICK_LANDING_PAGE("click_landing_page"),
  
  GAME_ADDICTION_RATE("game_addiction_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_6DAYS("attribution_game_in_app_roi_6days"),
  
  MESSAGE("message"),
  
  LUBAN_LIVE_PAY_ORDER_COUNT("luban_live_pay_order_count"),
  
  PLAY_50_FEED_BREAK_RATE("play_50_feed_break_rate"),
  
  DOWNLOAD_FINISH_COST("download_finish_cost"),
  
  ADVANCED_CREATIVE_COUPON_ADDITION("advanced_creative_coupon_addition"),
  
  CONVERT_RATE("convert_rate"),
  
  UNION_ROI_7("union_roi_7"),
  
  AVERAGE_VIDEO_PLAY("average_video_play"),
  
  LIVE_COMPONENT_CLICK_COUNT("live_component_click_count"),
  
  ATTRIBUTION_RETENTION_6D_RATE("attribution_retention_6d_rate"),
  
  LUBAN_LIVE_FOLLOW_CNT("luban_live_follow_cnt"),
  
  AVG_SHOW_COST("avg_show_cost"),
  
  PLAY_50_FEED_BREAK("play_50_feed_break"),
  
  CLICK_DOWNLOAD("click_download"),
  
  PRE_CONVERT_RATE("pre_convert_rate"),
  
  STAT_UNION_LTV_0("stat_union_ltv_0"),
  
  IN_APP_PAY("in_app_pay"),
  
  ACTIVE_RATE("active_rate"),
  
  WECHAT_LOGIN_COST("wechat_login_cost"),
  
  CPM("cpm"),
  
  ATTRIBUTION_CONVERT_COST("attribution_convert_cost"),
  
  ATTRIBUTION_RETENTION_6D_CNT("attribution_retention_6d_cnt"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_5DAYS("attribution_game_in_app_roi_5days"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_RATE("attribution_wechat_first_pay_30d_rate"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_CNT("attribution_next_day_open_cnt"),
  
  IN_APP_CART("in_app_cart"),
  
  LOAN_COMPLETION("loan_completion"),
  
  ATTRIBUTION_DEEP_CONVERT_COST("attribution_deep_convert_cost"),
  
  REDIRECT("redirect"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_3DAYS("attribution_game_in_app_roi_3days"),
  
  ATTRIBUTION_DAY_ACITVE_PAY_COUNT("attribution_day_acitve_pay_count"),
  
  VIEW("view"),
  
  CARD_SHOW("card_show"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_1DAY("attribution_game_in_app_ltv_1day"),
  
  STAT_PAY_AMOUNT("stat_pay_amount"),
  
  COUPON_SINGLE_PAGE("coupon_single_page"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_RATE("attribution_active_pay_intra_one_day_rate"),
  
  CPA("cpa"),
  
  ATTRIBUTION_MICRO_GAME_0D_ROI("attribution_micro_game_0d_roi"),
  
  LIVE_FANS_CLUB_JOIN_CNT("live_fans_club_join_cnt");

  private String value;

  ReportCreativeGetV2OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2OrderField fromValue(String value) {
    for (ReportCreativeGetV2OrderField b : ReportCreativeGetV2OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2OrderField.fromValue(value);
    }
  }
}

