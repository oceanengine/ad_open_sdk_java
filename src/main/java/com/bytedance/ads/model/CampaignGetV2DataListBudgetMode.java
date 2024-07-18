/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(CampaignGetV2DataListBudgetMode.Adapter.class)
public enum CampaignGetV2DataListBudgetMode {
  
  TOTAL("BUDGET_MODE_TOTAL"),
  
  INFINITE("BUDGET_MODE_INFINITE"),
  
  DAY("BUDGET_MODE_DAY");

  private String value;

  CampaignGetV2DataListBudgetMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignGetV2DataListBudgetMode fromValue(String value) {
    for (CampaignGetV2DataListBudgetMode b : CampaignGetV2DataListBudgetMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CampaignGetV2DataListBudgetMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignGetV2DataListBudgetMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignGetV2DataListBudgetMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignGetV2DataListBudgetMode.fromValue(value);
    }
  }
}

