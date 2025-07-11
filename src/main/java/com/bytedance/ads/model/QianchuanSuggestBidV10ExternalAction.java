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
@JsonAdapter(QianchuanSuggestBidV10ExternalAction.Adapter.class)
public enum QianchuanSuggestBidV10ExternalAction {
  
  LIVE_CLICK_PRODUCT_ACTION("AD_CONVERT_TYPE_LIVE_CLICK_PRODUCT_ACTION"),
  
  LIVE_SUCCESSORDER_ACTION("AD_CONVERT_TYPE_LIVE_SUCCESSORDER_ACTION"),
  
  LIVE_SUCCESSORDER_PAY("AD_CONVERT_TYPE_LIVE_SUCCESSORDER_PAY"),
  
  NEW_FOLLOW_ACTION("AD_CONVERT_TYPE_NEW_FOLLOW_ACTION"),
  
  QC_FOLLOW_ACTION("AD_CONVERT_TYPE_QC_FOLLOW_ACTION"),
  
  QC_MUST_BUY("AD_CONVERT_TYPE_QC_MUST_BUY"),
  
  SHOPPING("AD_CONVERT_TYPE_SHOPPING");

  private String value;

  QianchuanSuggestBidV10ExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanSuggestBidV10ExternalAction fromValue(String value) {
    for (QianchuanSuggestBidV10ExternalAction b : QianchuanSuggestBidV10ExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanSuggestBidV10ExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanSuggestBidV10ExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanSuggestBidV10ExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanSuggestBidV10ExternalAction.fromValue(value);
    }
  }
}

