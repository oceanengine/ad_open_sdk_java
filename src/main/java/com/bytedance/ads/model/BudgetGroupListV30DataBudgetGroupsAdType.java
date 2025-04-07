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
@JsonAdapter(BudgetGroupListV30DataBudgetGroupsAdType.Adapter.class)
public enum BudgetGroupListV30DataBudgetGroupsAdType {
  
  ALL("ALL"),
  
  SEARCH("SEARCH");

  private String value;

  BudgetGroupListV30DataBudgetGroupsAdType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BudgetGroupListV30DataBudgetGroupsAdType fromValue(String value) {
    for (BudgetGroupListV30DataBudgetGroupsAdType b : BudgetGroupListV30DataBudgetGroupsAdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BudgetGroupListV30DataBudgetGroupsAdType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BudgetGroupListV30DataBudgetGroupsAdType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BudgetGroupListV30DataBudgetGroupsAdType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BudgetGroupListV30DataBudgetGroupsAdType.fromValue(value);
    }
  }
}

