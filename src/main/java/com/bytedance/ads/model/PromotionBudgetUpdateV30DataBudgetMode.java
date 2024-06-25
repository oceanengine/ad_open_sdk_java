/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(PromotionBudgetUpdateV30DataBudgetMode.Adapter.class)
public enum PromotionBudgetUpdateV30DataBudgetMode {
  
  DAY("BUDGET_MODE_DAY"),
  
  TOTAL("BUDGET_MODE_TOTAL");

  private String value;

  PromotionBudgetUpdateV30DataBudgetMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionBudgetUpdateV30DataBudgetMode fromValue(String value) {
    for (PromotionBudgetUpdateV30DataBudgetMode b : PromotionBudgetUpdateV30DataBudgetMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionBudgetUpdateV30DataBudgetMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionBudgetUpdateV30DataBudgetMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionBudgetUpdateV30DataBudgetMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionBudgetUpdateV30DataBudgetMode.fromValue(value);
    }
  }
}

