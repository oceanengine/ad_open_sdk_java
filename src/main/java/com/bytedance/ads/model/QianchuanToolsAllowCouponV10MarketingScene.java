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
@JsonAdapter(QianchuanToolsAllowCouponV10MarketingScene.Adapter.class)
public enum QianchuanToolsAllowCouponV10MarketingScene {
  
  ALL("ALL"),
  
  FEED("FEED"),
  
  SEARCH("SEARCH"),
  
  SHOPPING_MALL("SHOPPING_MALL");

  private String value;

  QianchuanToolsAllowCouponV10MarketingScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanToolsAllowCouponV10MarketingScene fromValue(String value) {
    for (QianchuanToolsAllowCouponV10MarketingScene b : QianchuanToolsAllowCouponV10MarketingScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanToolsAllowCouponV10MarketingScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanToolsAllowCouponV10MarketingScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanToolsAllowCouponV10MarketingScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanToolsAllowCouponV10MarketingScene.fromValue(value);
    }
  }
}

