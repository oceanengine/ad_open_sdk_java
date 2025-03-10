/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(QianchuanEstimateEffectV10BudgetMode.Adapter.class)
public enum QianchuanEstimateEffectV10BudgetMode {
  
  DAY("BUDGET_MODE_DAY"),
  
  TOTAL("BUDGET_MODE_TOTAL");

  private String value;

  QianchuanEstimateEffectV10BudgetMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanEstimateEffectV10BudgetMode fromValue(String value) {
    for (QianchuanEstimateEffectV10BudgetMode b : QianchuanEstimateEffectV10BudgetMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanEstimateEffectV10BudgetMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanEstimateEffectV10BudgetMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanEstimateEffectV10BudgetMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanEstimateEffectV10BudgetMode.fromValue(value);
    }
  }
}

