/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(QianchuanCampaignListGetV10DataListBudgetMode.Adapter.class)
public enum QianchuanCampaignListGetV10DataListBudgetMode {
  
  DAY("BUDGET_MODE_DAY"),
  
  INFINITE("BUDGET_MODE_INFINITE"),
  
  TOTAL("BUDGET_MODE_TOTAL");

  private String value;

  QianchuanCampaignListGetV10DataListBudgetMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanCampaignListGetV10DataListBudgetMode fromValue(String value) {
    for (QianchuanCampaignListGetV10DataListBudgetMode b : QianchuanCampaignListGetV10DataListBudgetMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanCampaignListGetV10DataListBudgetMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanCampaignListGetV10DataListBudgetMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanCampaignListGetV10DataListBudgetMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanCampaignListGetV10DataListBudgetMode.fromValue(value);
    }
  }
}

