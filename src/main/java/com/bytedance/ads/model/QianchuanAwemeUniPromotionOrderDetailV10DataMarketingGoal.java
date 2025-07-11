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
@JsonAdapter(QianchuanAwemeUniPromotionOrderDetailV10DataMarketingGoal.Adapter.class)
public enum QianchuanAwemeUniPromotionOrderDetailV10DataMarketingGoal {
  
  LIVE_PROM_GOODS("LIVE_PROM_GOODS"),
  
  VIDEO_PROM_GOODS("VIDEO_PROM_GOODS");

  private String value;

  QianchuanAwemeUniPromotionOrderDetailV10DataMarketingGoal(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeUniPromotionOrderDetailV10DataMarketingGoal fromValue(String value) {
    for (QianchuanAwemeUniPromotionOrderDetailV10DataMarketingGoal b : QianchuanAwemeUniPromotionOrderDetailV10DataMarketingGoal.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeUniPromotionOrderDetailV10DataMarketingGoal> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeUniPromotionOrderDetailV10DataMarketingGoal enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeUniPromotionOrderDetailV10DataMarketingGoal read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeUniPromotionOrderDetailV10DataMarketingGoal.fromValue(value);
    }
  }
}

