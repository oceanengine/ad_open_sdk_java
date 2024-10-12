/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(ReportCampaignGetV2OrderField.Adapter.class)
public enum ReportCampaignGetV2OrderField {
  
  ADVANCED_CREATIVE_PHONE_CLICK("advanced_creative_phone_click"),
  
  CARD_SHOW("card_show"),
  
  DOWNLOAD_START_RATE("download_start_rate"),
  
  INSTALL_FINISH("install_finish"),
  
  LOAN_CREDIT("loan_credit"),
  
  ACTIVE_COST("active_cost"),
  
  ATTRIBUTION_WECHAT_PAY_30D_ROI("attribution_wechat_pay_30d_roi"),
  
  NEXT_DAY_OPEN_COST("next_day_open_cost"),
  
  CPC("cpc"),
  
  LOCATION_CLICK("location_click"),
  
  SHARE("share"),
  
  PHONE_CONNECT("phone_connect"),
  
  ATTRIBUTION_MICRO_GAME_7D_LTV("attribution_micro_game_7d_ltv"),
  
  PLAY_50_FEED_BREAK_RATE("play_50_feed_break_rate"),
  
  MAP_SEARCH("map_search"),
  
  POI_COLLECT("poi_collect"),
  
  PAY_COUNT("pay_count"),
  
  LOAN_CREDIT_COST("loan_credit_cost"),
  
  PLAY_DURATION_5S_RATE("play_duration_5s_rate"),
  
  FIRST_ORDER_COUNT("first_order_count"),
  
  ATTRIBUTION_MICRO_GAME_3D_ROI("attribution_micro_game_3d_roi"),
  
  LUBAN_LIVE_ENTER_CNT("luban_live_enter_cnt"),
  
  ATTRIBUTION_DAY_ACTIVE_PAY_COUNT("attribution_day_active_pay_count"),
  
  PLAY_DURATION_3S("play_duration_3s"),
  
  REDIRECT_TO_SHOP("redirect_to_shop"),
  
  ATTRIBUTION_RETENTION_7D_COST("attribution_retention_7d_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_5DAYS("attribution_game_in_app_roi_5days"),
  
  CPA("cpa"),
  
  PLAY_25_FEED_BREAK_RATE("play_25_feed_break_rate"),
  
  ATTRIBUTION_RETENTION_4D_CNT("attribution_retention_4d_cnt"),
  
  REGISTER("register"),
  
  PRE_LOAN_CREDIT_COST("pre_loan_credit_cost"),
  
  DOWNLOAD_FINISH_RATE("download_finish_rate"),
  
  PLAY_DURATION_10S_RATE("play_duration_10s_rate"),
  
  CONSULT_EFFECTIVE("consult_effective"),
  
  PAY_AMOUNT_ROI("pay_amount_roi"),
  
  ACTIVE_REGISTER_COST("active_register_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_4DAYS("attribution_game_in_app_roi_4days"),
  
  ATTRIBUTION_GAME_PAY_7D_COST("attribution_game_pay_7d_cost"),
  
  LUBAN_ORDER_STAT_AMOUNT("luban_order_stat_amount"),
  
  LUBAN_ORDER_CNT("luban_order_cnt"),
  
  CONSULT("consult"),
  
  LUBAN_LIVE_SLIDECART_CLICK_CNT("luban_live_slidecart_click_cnt"),
  
  LOAN_COMPLETION_COST("loan_completion_cost"),
  
  HOME_VISITED("home_visited"),
  
  WIFI_PLAY_RATE("wifi_play_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_7DAYS("attribution_game_in_app_roi_7days"),
  
  PRE_CONVERT_COUNT("pre_convert_count"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_4DAYS("attribution_game_in_app_ltv_4days"),
  
  CTR("ctr"),
  
  ATTRIBUTION_DEEP_CONVERT("attribution_deep_convert"),
  
  STAT_UNION_LTV_3("stat_union_ltv_3"),
  
  STAT_PAY_AMOUNT("stat_pay_amount"),
  
  NEXT_DAY_OPEN("next_day_open"),
  
  ATTRIBUTION_RETENTION_7D_SUM_CNT("attribution_retention_7d_sum_cnt"),
  
  LOTTERY("lottery"),
  
  ATTRIBUTION_RETENTION_4D_COST("attribution_retention_4d_cost"),
  
  ATTRIBUTION_RETENTION_2D_RATE("attribution_retention_2d_rate"),
  
  ATTRIBUTION_RETENTION_5D_RATE("attribution_retention_5d_rate"),
  
  ACTIVE_RATE("active_rate"),
  
  LOAN_COMPLETION("loan_completion"),
  
  AVERAGE_PLAY_TIME_PER_PLAY("average_play_time_per_play"),
  
  ADVANCED_CREATIVE_COUNSEL_CLICK("advanced_creative_counsel_click"),
  
  CLICK_WEBSITE("click_website"),
  
  BUTTON("button"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_6DAYS("attribution_game_in_app_roi_6days"),
  
  LUBAN_LIVE_FOLLOW_CNT("luban_live_follow_cnt"),
  
  WECHAT_FIRST_PAY_RATE("wechat_first_pay_rate"),
  
  ADVANCED_CREATIVE_FORM_SUBMIT("advanced_creative_form_submit"),
  
  ATTRIBUTION_RETENTION_2D_COST("attribution_retention_2d_cost"),
  
  INTERACT_PER_COST("interact_per_cost"),
  
  WECHAT_FIRST_PAY_COST("wechat_first_pay_cost"),
  
  CLICK_LANDING_PAGE("click_landing_page"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_COST("attribution_next_day_open_cost"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_RATE("attribution_next_day_open_rate"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_RATE("attribution_active_pay_7d_rate"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COST("attribution_active_pay_7d_cost"),
  
  ATTRIBUTION_RETENTION_7D_CNT("attribution_retention_7d_cnt"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_ROI("attribution_active_pay_intra_one_day_roi"),
  
  LIVE_COMPONENT_CLICK_COST("live_component_click_cost"),
  
  LIKE("like"),
  
  ATTRIBUTION_RETENTION_6D_CNT("attribution_retention_6d_cnt"),
  
  SHOPPING("shopping"),
  
  WIFI_PLAY("wifi_play"),
  
  LUBAN_LIVE_GIFT_AMOUNT("luban_live_gift_amount"),
  
  CONVERT_SHOW_RATE("convert_show_rate"),
  
  ATTRIBUTION_GAME_PAY_7D_COUNT("attribution_game_pay_7d_count"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_1DAY("attribution_game_in_app_roi_1day"),
  
  ATTRIBUTION_MICRO_GAME_0D_LTV("attribution_micro_game_0d_ltv"),
  
  DOWNLOAD_FINISH("download_finish"),
  
  SHOW("show"),
  
  UNION_ROI_0("union_roi_0"),
  
  VOTE("vote"),
  
  CLICK_DOWNLOAD("click_download"),
  
  VALID_PLAY("valid_play"),
  
  COUPON_SINGLE_PAGE("coupon_single_page"),
  
  ATTRIBUTION_RETENTION_3D_COST("attribution_retention_3d_cost"),
  
  FORM("form"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_CNT("attribution_next_day_open_cnt"),
  
  ATTRIBUTION_CONVERT_COST("attribution_convert_cost"),
  
  REDIRECT("redirect"),
  
  LUBAN_LIVE_GIFT_CNT("luban_live_gift_cnt"),
  
  ACTIVE("active"),
  
  GAME_PAY_COUNT("game_pay_count"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_PER_COUNT("attribution_active_pay_7d_per_count"),
  
  UNION_ROI_3("union_roi_3"),
  
  PLAY_OVER("play_over"),
  
  IES_CHALLENGE_CLICK("ies_challenge_click"),
  
  CONVERT("convert"),
  
  ATTRIBUTION_WECHAT_PAY_30D_AMOUNT("attribution_wechat_pay_30d_amount"),
  
  CONVERT_COST("convert_cost"),
  
  DEEP_CONVERT("deep_convert"),
  
  WECHAT_LOGIN_COUNT("wechat_login_count"),
  
  DISLIKE("dislike"),
  
  IN_APP_CART("in_app_cart"),
  
  ACTIVE_REGISTER_RATE("active_register_rate"),
  
  QQ("qq"),
  
  AVG_CLICK_COST("avg_click_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_RATE("attribution_active_pay_intra_one_day_rate"),
  
  CUSTOMER_EFFECTIVE("customer_effective"),
  
  PLAY_75_FEED_BREAK_RATE("play_75_feed_break_rate"),
  
  LUBAN_LIVE_PAY_ORDER_STAT_COST("luban_live_pay_order_stat_cost"),
  
  ACTIVE_PAY_COST("active_pay_cost"),
  
  ATTRIBUTION_RETENTION_2D_CNT("attribution_retention_2d_cnt"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_2DAYS("attribution_game_in_app_ltv_2days"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_2DAYS("attribution_game_in_app_roi_2days"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COST("attribution_wechat_first_pay_30d_cost"),
  
  STAT_UNION_LTV_0("stat_union_ltv_0"),
  
  INSTALL_FINISH_COST("install_finish_cost"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_8DAYS("attribution_game_in_app_ltv_8days"),
  
  COUPON("coupon"),
  
  PLAY_100_FEED_BREAK_RATE("play_100_feed_break_rate"),
  
  ATTRIBUTION_CONVERT("attribution_convert"),
  
  UNION_ROI_7("union_roi_7"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COUNT("attribution_active_pay_7d_count"),
  
  DEEP_CONVERT_COST("deep_convert_cost"),
  
  ATTRIBUTION_RETENTION_6D_RATE("attribution_retention_6d_rate"),
  
  ATTRIBUTION_RETENTION_7D_RATE("attribution_retention_7d_rate"),
  
  WECHAT("wechat"),
  
  WECHAT_PAY_AMOUNT("wechat_pay_amount"),
  
  ATTRIBUTION_RETENTION_7D_TOTAL_COST("attribution_retention_7d_total_cost"),
  
  IES_MUSIC_CLICK("ies_music_click"),
  
  ATTRIBUTION_DEEP_CONVERT_COST("attribution_deep_convert_cost"),
  
  VALID_PLAY_RATE("valid_play_rate"),
  
  AVG_RANK("avg_rank"),
  
  GAME_ADDICTION_COST("game_addiction_cost"),
  
  IN_APP_PAY("in_app_pay"),
  
  DOWNLOAD_START_COST("download_start_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COUNT("attribution_active_pay_intra_one_day_count"),
  
  ATTRIBUTION_MICRO_GAME_0D_ROI("attribution_micro_game_0d_roi"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_3DAYS("attribution_game_in_app_ltv_3days"),
  
  PRE_CONVERT_COST("pre_convert_cost"),
  
  WECHAT_LOGIN_COST("wechat_login_cost"),
  
  DOWNLOAD("download"),
  
  PLAY_DURATION("play_duration"),
  
  PLAY_DURATION_10S("play_duration_10s"),
  
  LIVE_WATCH_ONE_MINUTE_COUNT("live_watch_one_minute_count"),
  
  ATTRIBUTION_DAY_ACITVE_PAY_COUNT("attribution_day_acitve_pay_count"),
  
  GAME_ADDICTION("game_addiction"),
  
  LOAN_COMPLETION_RATE("loan_completion_rate"),
  
  PRE_LOAN_CREDIT("pre_loan_credit"),
  
  MESSAGE_ACTION("message_action"),
  
  VIEW("view"),
  
  APPROVAL_COUNT("approval_count"),
  
  COMMUTE_FIRST_PAY_COUNT("commute_first_pay_count"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_7DAYS("attribution_game_in_app_ltv_7days"),
  
  FOLLOW("follow"),
  
  PLAY_50_FEED_BREAK("play_50_feed_break"),
  
  PLAY_25_FEED_BREAK("play_25_feed_break"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_5DAYS("attribution_game_in_app_ltv_5days"),
  
  WECHAT_FIRST_PAY_COUNT("wechat_first_pay_count"),
  
  AVERAGE_PLAY_PROGRESS("average_play_progress"),
  
  ATTRIBUTION_RETENTION_4D_RATE("attribution_retention_4d_rate"),
  
  GAME_PAY_COST("game_pay_cost"),
  
  IN_APP_UV("in_app_uv"),
  
  COST("cost"),
  
  REPORT("report"),
  
  DOWNLOAD_START("download_start"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_1DAY("attribution_game_in_app_ltv_1day"),
  
  PHONE_CONFIRM("phone_confirm"),
  
  CLICK_INSTALL("click_install"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_8DAYS("attribution_game_in_app_roi_8days"),
  
  PLAY_100_FEED_BREAK("play_100_feed_break"),
  
  ACTIVE_PAY_AMOUNT("active_pay_amount"),
  
  LUBAN_LIVE_CLICK_PRODUCT_CNT("luban_live_click_product_cnt"),
  
  STAT_UNION_LTV_7("stat_union_ltv_7"),
  
  CONVERT_RATE("convert_rate"),
  
  TOTAL_PLAY("total_play"),
  
  ADVANCED_CREATIVE_COUPON_ADDITION("advanced_creative_coupon_addition"),
  
  LUBAN_LIVE_COMMENT_CNT("luban_live_comment_cnt"),
  
  ATTRIBUTION_MICRO_GAME_3D_LTV("attribution_micro_game_3d_ltv"),
  
  LUBAN_ORDER_ROI("luban_order_roi"),
  
  CLICK_SHOPWINDOW("click_shopwindow"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COST("attribution_wechat_login_30d_cost"),
  
  ADVANCED_CREATIVE_FORM_CLICK("advanced_creative_form_click"),
  
  CLICK_CALL_DY("click_call_dy"),
  
  LOAN_CREDIT_RATE("loan_credit_rate"),
  
  GAME_ADDICTION_RATE("game_addiction_rate"),
  
  LUBAN_LIVE_SHARE_CNT("luban_live_share_cnt"),
  
  SUBMIT_CERTIFICATION_COUNT("submit_certification_count"),
  
  PHONE_EFFECTIVE("phone_effective"),
  
  ATTRIBUTION_RETENTION_5D_CNT("attribution_retention_5d_cnt"),
  
  ACTIVE_PAY_RATE("active_pay_rate"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_6DAYS("attribution_game_in_app_ltv_6days"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COUNT("attribution_wechat_login_30d_count"),
  
  PLAY_DURATION_3S_RATE("play_duration_3s_rate"),
  
  LIVE_COMPONENT_CLICK_RATE("live_component_click_rate"),
  
  FIRST_RENTAL_ORDER_COUNT("first_rental_order_count"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COUNT("attribution_wechat_first_pay_30d_count"),
  
  NEXT_DAY_OPEN_RATE("next_day_open_rate"),
  
  LUBAN_LIVE_PAY_ORDER_COUNT("luban_live_pay_order_count"),
  
  PLAY_DURATION_2S_RATE("play_duration_2s_rate"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_AMOUNT("attribution_active_pay_intra_one_day_amount"),
  
  CPM("cpm"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_3DAYS("attribution_game_in_app_roi_3days"),
  
  ATTRIBUTION_RETENTION_3D_CNT("attribution_retention_3d_cnt"),
  
  AVERAGE_VIDEO_PLAY("average_video_play"),
  
  ATTRIBUTION_MICRO_GAME_7D_ROI("attribution_micro_game_7d_roi"),
  
  AVG_SHOW_COST("avg_show_cost"),
  
  DEEP_CONVERT_RATE("deep_convert_rate"),
  
  INSTALL_FINISH_RATE("install_finish_rate"),
  
  LIVE_FANS_CLUB_JOIN_CNT("live_fans_club_join_cnt"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_RATE("attribution_wechat_first_pay_30d_rate"),
  
  PLAY_OVER_RATE("play_over_rate"),
  
  PLAY_DURATION_SUM("play_duration_sum"),
  
  MESSAGE("message"),
  
  CLICK("click"),
  
  PLAY_DURATION_2S("play_duration_2s"),
  
  POI_ADDRESS_CLICK("poi_address_click"),
  
  IN_APP_DETAIL_UV("in_app_detail_uv"),
  
  PHONE("phone"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COST("attribution_active_pay_intra_one_day_cost"),
  
  ATTRIBUTION_RETENTION_5D_COST("attribution_retention_5d_cost"),
  
  IN_APP_ORDER("in_app_order"),
  
  ATTRIBUTION_RETENTION_6D_COST("attribution_retention_6d_cost"),
  
  PLAY_75_FEED_BREAK("play_75_feed_break"),
  
  ATTRIBUTION_RETENTION_3D_RATE("attribution_retention_3d_rate"),
  
  DOWNLOAD_FINISH_COST("download_finish_cost"),
  
  COMMENT("comment"),
  
  LIVE_COMPONENT_CLICK_COUNT("live_component_click_count"),
  
  PRE_CONVERT_RATE("pre_convert_rate"),
  
  VALID_PLAY_COST("valid_play_cost");

  private String value;

  ReportCampaignGetV2OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCampaignGetV2OrderField fromValue(String value) {
    for (ReportCampaignGetV2OrderField b : ReportCampaignGetV2OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCampaignGetV2OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCampaignGetV2OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCampaignGetV2OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCampaignGetV2OrderField.fromValue(value);
    }
  }
}

