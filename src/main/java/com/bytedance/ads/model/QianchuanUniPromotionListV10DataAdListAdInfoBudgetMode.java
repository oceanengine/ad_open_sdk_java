/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode.Adapter.class)
public enum QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode {
  
  DAY("BUDGET_MODE_DAY"),
  
  INFINITE("BUDGET_MODE_INFINITE"),
  
  TOTAL("BUDGET_MODE_TOTAL");

  private String value;

  QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode fromValue(String value) {
    for (QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode b : QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode.fromValue(value);
    }
  }
}

