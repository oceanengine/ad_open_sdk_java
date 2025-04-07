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
@JsonAdapter(QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode.Adapter.class)
public enum QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode {
  
  DAY("BUDGET_MODE_DAY"),
  
  INFINITE("BUDGET_MODE_INFINITE"),
  
  SEVEN_DAY_CYCLE("BUDGET_MODE_SEVEN_DAY_CYCLE"),
  
  TOTAL("BUDGET_MODE_TOTAL");

  private String value;

  QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode fromValue(String value) {
    for (QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode b : QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode.fromValue(value);
    }
  }
}

