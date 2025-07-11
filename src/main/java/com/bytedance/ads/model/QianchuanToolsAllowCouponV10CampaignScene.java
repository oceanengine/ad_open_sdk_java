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
@JsonAdapter(QianchuanToolsAllowCouponV10CampaignScene.Adapter.class)
public enum QianchuanToolsAllowCouponV10CampaignScene {
  
  DAILY_SALE("DAILY_SALE"),
  
  NEW_CUSTOMER_TRANSFORMATION("NEW_CUSTOMER_TRANSFORMATION"),
  
  NEW_PRODUCT_BOOST("NEW_PRODUCT_BOOST");

  private String value;

  QianchuanToolsAllowCouponV10CampaignScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanToolsAllowCouponV10CampaignScene fromValue(String value) {
    for (QianchuanToolsAllowCouponV10CampaignScene b : QianchuanToolsAllowCouponV10CampaignScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanToolsAllowCouponV10CampaignScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanToolsAllowCouponV10CampaignScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanToolsAllowCouponV10CampaignScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanToolsAllowCouponV10CampaignScene.fromValue(value);
    }
  }
}

