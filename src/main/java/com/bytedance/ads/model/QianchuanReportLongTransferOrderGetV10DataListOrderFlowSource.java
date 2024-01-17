/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource.Adapter.class)
public enum QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource {
  
  ACTIVITY("ACTIVITY"),
  
  DOUYIN_SHOPPING_CENTER("DOUYIN_SHOPPING_CENTER"),
  
  GENERAL_SEARCH("GENERAL_SEARCH"),
  
  GUESS_YOU_LIKE("GUESS_YOU_LIKE"),
  
  HOMEPAGE_FOLLOW("HOMEPAGE_FOLLOW"),
  
  LIVE("LIVE"),
  
  LIVE_OTHER("LIVE_OTHER"),
  
  OTHERS_HOMEPAGE("OTHERS_HOMEPAGE"),
  
  OTHER_PROFILE("OTHER_PROFILE"),
  
  PRODUCT_CARD("PRODUCT_CARD"),
  
  PRODUCT_CARD_GENERAL_SEARCH("PRODUCT_CARD_GENERAL_SEARCH"),
  
  PRODUCT_CARD_OTHER("PRODUCT_CARD_OTHER"),
  
  QIANCHUAN_PROMOTE("QIANCHUAN_PROMOTE"),
  
  RECOMMEND_LIVE("RECOMMEND_LIVE"),
  
  RECOMMEND_PRODUCT("RECOMMEND_PRODUCT"),
  
  RECOMMEND_VIDEO("RECOMMEND_VIDEO"),
  
  SHOP_WINDOW("SHOP_WINDOW"),
  
  UNKNOWN("UNKNOWN"),
  
  VIDEO("VIDEO"),
  
  VIDEO_ACTIVITY("VIDEO_ACTIVITY"),
  
  VIDEO_GENERAL_SEARCH("VIDEO_GENERAL_SEARCH"),
  
  VIDEO_HOMEPAGE_FOLLOW("VIDEO_HOMEPAGE_FOLLOW"),
  
  VIDEO_OTHER("VIDEO_OTHER"),
  
  VIDEO_TO_LIVE("VIDEO_TO_LIVE");

  private String value;

  QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource fromValue(String value) {
    for (QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource b : QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource.fromValue(value);
    }
  }
}

