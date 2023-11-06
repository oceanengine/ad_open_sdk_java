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
@JsonAdapter(ReportCreativeGetV2DataListExternalAction.Adapter.class)
public enum ReportCreativeGetV2DataListExternalAction {
  
  TYPE_LT_ROI("AD_CONVERT_TYPE_LT_ROI"),
  
  TYPE_RETENTION_DAYS("AD_CONVERT_TYPE_RETENTION_DAYS"),
  
  TYPE_MESSAGE_ORDER_SUCCESS("AD_CONVERT_TYPE_MESSAGE_ORDER_SUCCESS"),
  
  TYPE_NATIVE_ACTION("AD_CONVERT_TYPE_NATIVE_ACTION"),
  
  TYPE_DOWNLOAD_FINISH("AD_CONVERT_TYPE_DOWNLOAD_FINISH"),
  
  TYPE_MESSAGE_CLICK("AD_CONVERT_TYPE_MESSAGE_CLICK"),
  
  TYPE_FOLLOW_LIVE_ENTER("AD_CONVERT_TYPE_FOLLOW_LIVE_ENTER"),
  
  TYPE_CUSTOMER_EFFECTIVE("AD_CONVERT_TYPE_CUSTOMER_EFFECTIVE"),
  
  TYPE_ANCHOR_CLICK("AD_CONVERT_TYPE_ANCHOR_CLICK"),
  
  TYPE_DEEP_PURCHASE("AD_CONVERT_TYPE_DEEP_PURCHASE"),
  
  TYPE_FOLLOW_ACTION("AD_CONVERT_TYPE_FOLLOW_ACTION"),
  
  TYPE_LOCATION_ACTION("AD_CONVERT_TYPE_LOCATION_ACTION"),
  
  TYPE_SHARE_ACTION("AD_CONVERT_TYPE_SHARE_ACTION"),
  
  TYPE_APP_DETAIL_UV("AD_CONVERT_TYPE_APP_DETAIL_UV"),
  
  TYPE_ACTIVE_REGISTER("AD_CONVERT_TYPE_ACTIVE_REGISTER"),
  
  TYPE_WECHAT_WECOM_ADD("AD_CONVERT_TYPE_WECHAT_WECOM_ADD"),
  
  TYPE_POI_ADDRESS_CLICK("AD_CONVERT_TYPE_POI_ADDRESS_CLICK"),
  
  TYPE_RSS("AD_CONVERT_TYPE_RSS"),
  
  TYPE_CLICK_LANDING_PAGE("AD_CONVERT_TYPE_CLICK_LANDING_PAGE"),
  
  TYPE_WECHAT("AD_CONVERT_TYPE_WECHAT"),
  
  TYPE_LOAN_CREDIT("AD_CONVERT_TYPE_LOAN_CREDIT"),
  
  TYPE_IDCARD_INFORMATION("AD_CONVERT_TYPE_IDCARD_INFORMATION"),
  
  TYPE_SHOPPING("AD_CONVERT_TYPE_SHOPPING"),
  
  TYPE_DIALBACK_CONNECT("AD_CONVERT_TYPE_DIALBACK_CONNECT"),
  
  TYPE_CLASS("AD_CONVERT_TYPE_CLASS"),
  
  TYPE_LIVE_NATIVE_ACITON("AD_CONVERT_TYPE_LIVE_NATIVE_ACITON"),
  
  TYPE_BUTTON("AD_CONVERT_TYPE_BUTTON"),
  
  TYPE_MESSAGE_JOIN_GROUP("AD_CONVERT_TYPE_MESSAGE_JOIN_GROUP"),
  
  TYPE_DIALBACK("AD_CONVERT_TYPE_DIALBACK"),
  
  TYPE_APP_ORDER("AD_CONVERT_TYPE_APP_ORDER"),
  
  TYPE_ARPU0("AD_CONVERT_TYPE_ARPU0"),
  
  TYPE_PURCHASE_ROI("AD_CONVERT_TYPE_PURCHASE_ROI"),
  
  TYPE_LIVE_SUCCESSORDER_PAY("AD_CONVERT_TYPE_LIVE_SUCCESSORDER_PAY"),
  
  TYPE_APP_CART("AD_CONVERT_TYPE_APP_CART"),
  
  TYPE_FORM_DEEP("AD_CONVERT_TYPE_FORM_DEEP"),
  
  TYPE_MESSAGE_CLUE("AD_CONVERT_TYPE_MESSAGE_CLUE"),
  
  TYPE_LOAN("AD_CONVERT_TYPE_LOAN"),
  
  TYPE_LIVE_SLIDECART_CLICK_ACTION("AD_CONVERT_TYPE_LIVE_SLIDECART_CLICK_ACTION"),
  
  TYPE_COUPON("AD_CONVERT_TYPE_COUPON"),
  
  TYPE_CONSULT("AD_CONVERT_TYPE_CONSULT"),
  
  TYPE_XPATH("AD_CONVERT_TYPE_XPATH"),
  
  TYPE_CLUE_CONFIRM("AD_CONVERT_TYPE_CLUE_CONFIRM"),
  
  TYPE_MESSAGE_SERVICE("AD_CONVERT_TYPE_MESSAGE_SERVICE"),
  
  TYPE_CLICK_NUM("AD_CONVERT_TYPE_CLICK_NUM"),
  
  TYPE_LIVE_OTO_PAY_CLICK("AD_CONVERT_TYPE_LIVE_OTO_PAY_CLICK"),
  
  TYPE_VOTE("AD_CONVERT_TYPE_VOTE"),
  
  TYPE_LIVE_FANS_ACTION("AD_CONVERT_TYPE_LIVE_FANS_ACTION"),
  
  TYPE_LIVE_COMMENT_ACTION("AD_CONVERT_TYPE_LIVE_COMMENT_ACTION"),
  
  TYPE_INTENTION_CLUE("AD_CONVERT_TYPE_INTENTION_CLUE"),
  
  TYPE_OTO_STAY_TIME("AD_CONVERT_TYPE_OTO_STAY_TIME"),
  
  TYPE_WECHAT_REGISTER("AD_CONVERT_TYPE_WECHAT_REGISTER"),
  
  TYPE_LIVE_SUCCESSORDER_ACTION("AD_CONVERT_TYPE_LIVE_SUCCESSORDER_ACTION"),
  
  TYPE_LIVE_COMPONENT_CLICK("AD_CONVERT_TYPE_LIVE_COMPONENT_CLICK"),
  
  TYPE_PHONE("AD_CONVERT_TYPE_PHONE"),
  
  TYPE_POI_COLLECT("AD_CONVERT_TYPE_POI_COLLECT"),
  
  TYPE_MULTIPLE("AD_CONVERT_TYPE_MULTIPLE"),
  
  TYPE_INSTALL_FINISH("AD_CONVERT_TYPE_INSTALL_FINISH"),
  
  TYPE_LINK_ACTION("AD_CONVERT_TYPE_LINK_ACTION"),
  
  TYPE_CLICK_SHOPWINDOW("AD_CONVERT_TYPE_CLICK_SHOPWINDOW"),
  
  TYPE_LIVE_JOIN_GROUP("AD_CONVERT_TYPE_LIVE_JOIN_GROUP"),
  
  TYPE_INTELLIGENT_SERVICE_OPEN("AD_CONVERT_TYPE_INTELLIGENT_SERVICE_OPEN"),
  
  TYPE_LIVE_FOLLOW_ACITON("AD_CONVERT_TYPE_LIVE_FOLLOW_ACITON"),
  
  TYPE_FORM("AD_CONVERT_TYPE_FORM"),
  
  TYPE_COMMODITY_CLICK("AD_CONVERT_TYPE_COMMODITY_CLICK"),
  
  TYPE_GAME_ADDICTION("AD_CONVERT_TYPE_GAME_ADDICTION"),
  
  TYPE_FOLLOW_VIDEO_PLAY_FINISH("AD_CONVERT_TYPE_FOLLOW_VIDEO_PLAY_FINISH"),
  
  TYPE_PAID_CLUE("AD_CONVERT_TYPE_PAID_CLUE"),
  
  TYPE_CLICK_CALL_DY("AD_CONVERT_TYPE_CLICK_CALL_DY"),
  
  TYPE_APP_PAY("AD_CONVERT_TYPE_APP_PAY"),
  
  TYPE_CLUE_PAY_SUCCEED("AD_CONVERT_TYPE_CLUE_PAY_SUCCEED"),
  
  TYPE_PURCHASE_OF_GOODS("AD_CONVERT_TYPE_PURCHASE_OF_GOODS"),
  
  TYPE_NEW_FOLLOW_ACTION("AD_CONVERT_TYPE_NEW_FOLLOW_ACTION"),
  
  TYPE_CLUE_INTERFLOW("AD_CONVERT_TYPE_CLUE_INTERFLOW"),
  
  TYPE_SUCCESSORDER_ACTION("AD_CONVERT_TYPE_SUCCESSORDER_ACTION"),
  
  TYPE_DOWNLOAD_START("AD_CONVERT_TYPE_DOWNLOAD_START"),
  
  TYPE_PREMIUM_UPGEADE("AD_CONVERT_TYPE_PREMIUM_UPGEADE"),
  
  TYPE_UG_ROI("AD_CONVERT_TYPE_UG_ROI"),
  
  TYPE_EFFECTIVE_PLAY("AD_CONVERT_TYPE_EFFECTIVE_PLAY"),
  
  TYPE_LIVE_ENTER_ACTION("AD_CONVERT_TYPE_LIVE_ENTER_ACTION"),
  
  TYPE_CLICK_WEBSITE("AD_CONVERT_TYPE_CLICK_WEBSITE"),
  
  TYPE_SHOPPING_ACTION("AD_CONVERT_TYPE_SHOPPING_ACTION"),
  
  TYPE_PHONE_CONFIRM("AD_CONVERT_TYPE_PHONE_CONFIRM"),
  
  PAGE_VIEW("AD_CONVERT_PAGE_VIEW"),
  
  TYPE_CREATE_GAMEROLE("AD_CONVERT_TYPE_CREATE_GAMEROLE"),
  
  TYPE_MESSAGE_ACTION("AD_CONVERT_TYPE_MESSAGE_ACTION"),
  
  TYPE_INTERACTION("AD_CONVERT_TYPE_INTERACTION"),
  
  TYPE_PURCHASE_ROI_7D("AD_CONVERT_TYPE_PURCHASE_ROI_7D"),
  
  TYPE_REDIRECT_TO_STORE("AD_CONVERT_TYPE_REDIRECT_TO_STORE"),
  
  TYPE_PAY("AD_CONVERT_TYPE_PAY"),
  
  TYPE_COMMENT_ACTION("AD_CONVERT_TYPE_COMMENT_ACTION"),
  
  TYPE_REDIRECT_TO_SHOP("AD_CONVERT_TYPE_REDIRECT_TO_SHOP"),
  
  TYPE_PHONE_EFFECTIVE("AD_CONVERT_TYPE_PHONE_EFFECTIVE"),
  
  TYPE_AUTHORIZATION("AD_CONVERT_TYPE_AUTHORIZATION"),
  
  TYPE_BANKCARD_INFORMATION("AD_CONVERT_TYPE_BANKCARD_INFORMATION"),
  
  TYPE_POI_MULTIPLE("AD_CONVERT_TYPE_POI_MULTIPLE"),
  
  TYPE_SHOPPING_CART("AD_CONVERT_TYPE_SHOPPING_CART"),
  
  TYPE_RETENTION_7D("AD_CONVERT_TYPE_RETENTION_7D"),
  
  TYPE_LOTTERY("AD_CONVERT_TYPE_LOTTERY"),
  
  TYPE_FEED_LIVE_HOMEPAGE("AD_CONVERT_TYPE_FEED_LIVE_HOMEPAGE"),
  
  TYPE_LIKE_ACTION("AD_CONVERT_TYPE_LIKE_ACTION"),
  
  TYPE_NOTIFY_FORM("AD_CONVERT_TYPE_NOTIFY_FORM"),
  
  TYPE_PRE_LOAN_CREDIT("AD_CONVERT_TYPE_PRE_LOAN_CREDIT"),
  
  TYPE_NEXT_DAY_OPEN("AD_CONVERT_TYPE_NEXT_DAY_OPEN"),
  
  TYPE_SUBMIT_CERTIFICATION("AD_CONVERT_TYPE_SUBMIT_CERTIFICATION"),
  
  TYPE_LIVE_CLICK_PRODUCT_ACTION("AD_CONVERT_TYPE_LIVE_CLICK_PRODUCT_ACTION"),
  
  TYPE_FIRST_RENTAL_ORDER("AD_CONVERT_TYPE_FIRST_RENTAL_ORDER"),
  
  TYPE_LIVE_GIFT_ACTION("AD_CONVERT_TYPE_LIVE_GIFT_ACTION"),
  
  TYPE_MESSAGE_INTERACTION("AD_CONVERT_TYPE_MESSAGE_INTERACTION"),
  
  TYPE_REDIRECT("AD_CONVERT_TYPE_REDIRECT"),
  
  TYPE_LIVE_HOMEPAGE("AD_CONVERT_TYPE_LIVE_HOMEPAGE"),
  
  TYPE_WECHAT_USER_FIRST_MESSAGE("AD_CONVERT_TYPE_WECHAT_USER_FIRST_MESSAGE"),
  
  TYPE_CERTIFICATION_INFORMATION("AD_CONVERT_TYPE_CERTIFICATION_INFORMATION"),
  
  TYPE_INVALID_CLUE("AD_CONVERT_TYPE_INVALID_CLUE"),
  
  TYPE_PREMIUM_PAYMENT("AD_CONVERT_TYPE_PREMIUM_PAYMENT"),
  
  TYPE_LIVE_APPOINTMENT("AD_CONVERT_TYPE_LIVE_APPOINTMENT"),
  
  TYPE_FIRST_CLASS("AD_CONVERT_TYPE_FIRST_CLASS"),
  
  TYPE_UPDATE_LEVEL("AD_CONVERT_TYPE_UPDATE_LEVEL"),
  
  TYPE_PHONE_CONNECT("AD_CONVERT_TYPE_PHONE_CONNECT"),
  
  TYPE_APPLET_CLICK("AD_CONVERT_TYPE_APPLET_CLICK"),
  
  TYPE_WECHAT_PAY("AD_CONVERT_TYPE_WECHAT_PAY"),
  
  TYPE_LOAN_COMPLETION("AD_CONVERT_TYPE_LOAN_COMPLETION"),
  
  TYPE_MESSAGE("AD_CONVERT_TYPE_MESSAGE"),
  
  TYPE_CONSULT_EFFECTIVE("AD_CONVERT_TYPE_CONSULT_EFFECTIVE"),
  
  TYPE_CLICK_DOWNLOAD("AD_CONVERT_TYPE_CLICK_DOWNLOAD"),
  
  TYPE_LIVE_OTO_PAY("AD_CONVERT_TYPE_LIVE_OTO_PAY"),
  
  TYPE_DIALBACK_CONFIRM("AD_CONVERT_TYPE_DIALBACK_CONFIRM"),
  
  TYPE_MAP_SEARCH("AD_CONVERT_TYPE_MAP_SEARCH"),
  
  TYPE_VIEW("AD_CONVERT_TYPE_VIEW"),
  
  TYPE_PERSONAL_INFORMATION("AD_CONVERT_TYPE_PERSONAL_INFORMATION"),
  
  TYPE_APP_UV("AD_CONVERT_TYPE_APP_UV"),
  
  TYPE_INAPP_NEXT_DAY_OPEN("AD_CONVERT_TYPE_INAPP_NEXT_DAY_OPEN"),
  
  TYPE_NOTIFY_DOWNLOAD("AD_CONVERT_TYPE_NOTIFY_DOWNLOAD"),
  
  TYPE_QC_MUST_BUY("AD_CONVERT_TYPE_QC_MUST_BUY"),
  
  TYPE_QQ("AD_CONVERT_TYPE_QQ"),
  
  TYPE_CLUE_HIGH_INTENTION("AD_CONVERT_TYPE_CLUE_HIGH_INTENTION"),
  
  TYPE_BOOST("AD_CONVERT_TYPE_BOOST"),
  
  TYPE_EFFECTIVE_COPY("AD_CONVERT_TYPE_EFFECTIVE_COPY"),
  
  TYPE_OTO_PAY("AD_CONVERT_TYPE_OTO_PAY"),
  
  TYPE_ACTIVE("AD_CONVERT_TYPE_ACTIVE"),
  
  TYPE_HIGH_VALUE_CLUE("AD_CONVERT_TYPE_HIGH_VALUE_CLUE"),
  
  TYPE_OTHER("AD_CONVERT_TYPE_OTHER"),
  
  TYPE_IPU_QUALIFY("AD_CONVERT_TYPE_IPU_QUALIFY"),
  
  TYPE_PURCHASE_ROI_2D("AD_CONVERT_TYPE_PURCHASE_ROI_2D"),
  
  TYPE_LIVE_OTO_CLICK("AD_CONVERT_TYPE_LIVE_OTO_CLICK"),
  
  TYPE_FORM_CONNECT("AD_CONVERT_TYPE_FORM_CONNECT"),
  
  TYPE_ENTER_HOMEPAGE("AD_CONVERT_TYPE_ENTER_HOMEPAGE"),
  
  TYPE_STAY_TIME("AD_CONVERT_TYPE_STAY_TIME"),
  
  TYPE_LIVE_STAY_TIME("AD_CONVERT_TYPE_LIVE_STAY_TIME"),
  
  TYPE_CONSULT_CLUE("AD_CONVERT_TYPE_CONSULT_CLUE"),
  
  TYPE_FOLLOW_CLICK_PRODUCT("AD_CONVERT_TYPE_FOLLOW_CLICK_PRODUCT"),
  
  TYPE_PREMIUM_ROI("AD_CONVERT_TYPE_PREMIUM_ROI"),
  
  TYPE_SALES_LEAD("AD_CONVERT_TYPE_SALES_LEAD"),
  
  TYPE_RESERVATION("AD_CONVERT_TYPE_RESERVATION"),
  
  TYPE_QC_FOLLOW_ACTION("AD_CONVERT_TYPE_QC_FOLLOW_ACTION"),
  
  TYPE_FORM_ANSWER("AD_CONVERT_TYPE_FORM_ANSWER"),
  
  TYPE_SHOW_OFF_NUM("AD_CONVERT_TYPE_SHOW_OFF_NUM");

  private String value;

  ReportCreativeGetV2DataListExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2DataListExternalAction fromValue(String value) {
    for (ReportCreativeGetV2DataListExternalAction b : ReportCreativeGetV2DataListExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2DataListExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2DataListExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2DataListExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2DataListExternalAction.fromValue(value);
    }
  }
}

