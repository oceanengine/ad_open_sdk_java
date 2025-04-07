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
@JsonAdapter(DiagnosisTaskAdvCreateV2DiagnoseConfigExternalAction.Adapter.class)
public enum DiagnosisTaskAdvCreateV2DiagnoseConfigExternalAction {
  
  AD_APP_ACTIVATE("AD_APP_ACTIVATE"),
  
  AD_APP_AUTH("AD_APP_AUTH"),
  
  AD_APP_BOOK("AD_APP_BOOK"),
  
  AD_APP_BUY("AD_APP_BUY"),
  
  AD_APP_CLICKS("AD_APP_CLICKS"),
  
  AD_APP_DETAIL("AD_APP_DETAIL"),
  
  AD_APP_DOWNLOADED("AD_APP_DOWNLOADED"),
  
  AD_APP_INSTALLED("AD_APP_INSTALLED"),
  
  AD_APP_KEY_BEHAVIOR("AD_APP_KEY_BEHAVIOR"),
  
  AD_APP_ORDER("AD_APP_ORDER"),
  
  AD_APP_PAY("AD_APP_PAY"),
  
  AD_APP_PRE_AUTH("AD_APP_PRE_AUTH"),
  
  AD_APP_PRE_DOWNLOAD("AD_APP_PRE_DOWNLOAD"),
  
  AD_APP_PUSH_ORDER("AD_APP_PUSH_ORDER"),
  
  AD_APP_REGISTER("AD_APP_REGISTER"),
  
  AD_APP_SHOW("AD_APP_SHOW"),
  
  AD_APP_SUBMIT("AD_APP_SUBMIT"),
  
  AD_APP_VIEW("AD_APP_VIEW"),
  
  AD_CLUE_AUTH("AD_CLUE_AUTH"),
  
  AD_CLUE_BUTTON("AD_CLUE_BUTTON"),
  
  AD_CLUE_CLICKS("AD_CLUE_CLICKS"),
  
  AD_CLUE_CONFIRM("AD_CLUE_CONFIRM"),
  
  AD_CLUE_CONSULT("AD_CLUE_CONSULT"),
  
  AD_CLUE_CONSULT_MSG("AD_CLUE_CONSULT_MSG"),
  
  AD_CLUE_COUPON("AD_CLUE_COUPON"),
  
  AD_CLUE_CUSTOMER("AD_CLUE_CUSTOMER"),
  
  AD_CLUE_CVT("AD_CLUE_CVT"),
  
  AD_CLUE_DONE("AD_CLUE_DONE"),
  
  AD_CLUE_FORM("AD_CLUE_FORM"),
  
  AD_CLUE_FRIENDS("AD_CLUE_FRIENDS"),
  
  AD_CLUE_INSURANCE("AD_CLUE_INSURANCE"),
  
  AD_CLUE_INTENTION("AD_CLUE_INTENTION"),
  
  AD_CLUE_INTENTION_FORM("AD_CLUE_INTENTION_FORM"),
  
  AD_CLUE_INTENTION_TEL("AD_CLUE_INTENTION_TEL"),
  
  AD_CLUE_MESSAGE("AD_CLUE_MESSAGE"),
  
  AD_CLUE_MONEY("AD_CLUE_MONEY"),
  
  AD_CLUE_MSG("AD_CLUE_MSG"),
  
  AD_CLUE_PAGE("AD_CLUE_PAGE"),
  
  AD_CLUE_PAY("AD_CLUE_PAY"),
  
  AD_CLUE_PRE_AUTH("AD_CLUE_PRE_AUTH"),
  
  AD_CLUE_PROTENTIAL_DEAL("AD_CLUE_PROTENTIAL_DEAL"),
  
  AD_CLUE_PUSH_ORDER("AD_CLUE_PUSH_ORDER"),
  
  AD_CLUE_REGISTER("AD_CLUE_REGISTER"),
  
  AD_CLUE_SHOW("AD_CLUE_SHOW"),
  
  AD_CLUE_SUBMIT("AD_CLUE_SUBMIT"),
  
  AD_CLUE_TEL("AD_CLUE_TEL"),
  
  AD_CLUE_TEL_CALL("AD_CLUE_TEL_CALL"),
  
  AD_CLUE_WX_ADD("AD_CLUE_WX_ADD"),
  
  AD_CLUE_WX_COPY("AD_CLUE_WX_COPY"),
  
  AD_CLUE_WX_MSG("AD_CLUE_WX_MSG"),
  
  AD_ECP_APP_BUY("AD_ECP_APP_BUY"),
  
  AD_ECP_APP_DETAIL("AD_ECP_APP_DETAIL"),
  
  AD_ECP_APP_VIEW("AD_ECP_APP_VIEW"),
  
  AD_ECP_BUTTON("AD_ECP_BUTTON"),
  
  AD_ECP_INTEREST("AD_ECP_INTEREST"),
  
  AD_ECP_SHOP("AD_ECP_SHOP"),
  
  AD_ECP_SHOP_STAY("AD_ECP_SHOP_STAY"),
  
  AD_MINIAPP_ACTIVATE("AD_MINIAPP_ACTIVATE"),
  
  AD_MINIAPP_KEY_BEHAVIOR("AD_MINIAPP_KEY_BEHAVIOR"),
  
  AD_MINIAPP_PAY("AD_MINIAPP_PAY"),
  
  AD_MINIAPP_REGISTER("AD_MINIAPP_REGISTER"),
  
  AD_NATIVE_ACTIVATE("AD_NATIVE_ACTIVATE"),
  
  AD_NATIVE_CLICKS("AD_NATIVE_CLICKS"),
  
  AD_NATIVE_FANS_GROUP("AD_NATIVE_FANS_GROUP"),
  
  AD_NATIVE_FOLLOW("AD_NATIVE_FOLLOW"),
  
  AD_NATIVE_INTERACTIVE("AD_NATIVE_INTERACTIVE"),
  
  AD_NATIVE_LIVE("AD_NATIVE_LIVE"),
  
  AD_NATIVE_LIVE_DONATE("AD_NATIVE_LIVE_DONATE"),
  
  AD_NATIVE_LIVE_PAY("AD_NATIVE_LIVE_PAY"),
  
  AD_NATIVE_LIVE_STAY("AD_NATIVE_LIVE_STAY"),
  
  AD_NATIVE_LIVE_VIEW("AD_NATIVE_LIVE_VIEW"),
  
  AD_NATIVE_PAY("AD_NATIVE_PAY"),
  
  AD_PRODUCT_ACTIVATE("AD_PRODUCT_ACTIVATE"),
  
  AD_PRODUCT_APP_BUY("AD_PRODUCT_APP_BUY"),
  
  AD_PRODUCT_APP_DETAIL("AD_PRODUCT_APP_DETAIL"),
  
  AD_PRODUCT_APP_PAY("AD_PRODUCT_APP_PAY"),
  
  AD_PRODUCT_APP_VIEW("AD_PRODUCT_APP_VIEW"),
  
  AD_PRODUCT_FORM("AD_PRODUCT_FORM"),
  
  AD_PRODUCT_KEY_BEHAVIOR("AD_PRODUCT_KEY_BEHAVIOR"),
  
  AD_PRODUCT_PAY("AD_PRODUCT_PAY"),
  
  AD_TINYAPP_ACTIVATE("AD_TINYAPP_ACTIVATE"),
  
  AD_TINYAPP_KEY_BEHAVIOR("AD_TINYAPP_KEY_BEHAVIOR"),
  
  AD_TINYAPP_PAY("AD_TINYAPP_PAY"),
  
  QC_LIVE_BUY("QC_LIVE_BUY"),
  
  QC_LIVE_CHECK("QC_LIVE_CHECK"),
  
  QC_LIVE_COMMENTS("QC_LIVE_COMMENTS"),
  
  QC_LIVE_DEAL("QC_LIVE_DEAL"),
  
  QC_LIVE_ENTRY("QC_LIVE_ENTRY"),
  
  QC_LIVE_FANS("QC_LIVE_FANS"),
  
  QC_LIVE_HIT("QC_LIVE_HIT"),
  
  QC_LIVE_PRODUCT_CLICKS("QC_LIVE_PRODUCT_CLICKS"),
  
  QC_LIVE_ROI_CHECK("QC_LIVE_ROI_CHECK"),
  
  QC_LIVE_ROI_DEAL("QC_LIVE_ROI_DEAL"),
  
  QC_LIVE_ROI_QC("QC_LIVE_ROI_QC"),
  
  QC_PRODUCT_BUY("QC_PRODUCT_BUY"),
  
  QC_PRODUCT_COMMENTS("QC_PRODUCT_COMMENTS"),
  
  QC_PRODUCT_FANS("QC_PRODUCT_FANS"),
  
  QC_PRODUCT_INTEREST("QC_PRODUCT_INTEREST"),
  
  QC_PRODUCT_QC("QC_PRODUCT_QC"),
  
  QC_PRODUCT_ROI("QC_PRODUCT_ROI");

  private String value;

  DiagnosisTaskAdvCreateV2DiagnoseConfigExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiagnosisTaskAdvCreateV2DiagnoseConfigExternalAction fromValue(String value) {
    for (DiagnosisTaskAdvCreateV2DiagnoseConfigExternalAction b : DiagnosisTaskAdvCreateV2DiagnoseConfigExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DiagnosisTaskAdvCreateV2DiagnoseConfigExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final DiagnosisTaskAdvCreateV2DiagnoseConfigExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DiagnosisTaskAdvCreateV2DiagnoseConfigExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DiagnosisTaskAdvCreateV2DiagnoseConfigExternalAction.fromValue(value);
    }
  }
}

