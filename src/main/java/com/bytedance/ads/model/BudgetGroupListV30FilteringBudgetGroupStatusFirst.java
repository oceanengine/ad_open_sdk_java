/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(BudgetGroupListV30FilteringBudgetGroupStatusFirst.Adapter.class)
public enum BudgetGroupListV30FilteringBudgetGroupStatusFirst {
  
  DELETED("DELETED"),
  
  ENABLE("ENABLE"),
  
  UNDELIVERIED("UNDELIVERIED");

  private String value;

  BudgetGroupListV30FilteringBudgetGroupStatusFirst(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BudgetGroupListV30FilteringBudgetGroupStatusFirst fromValue(String value) {
    for (BudgetGroupListV30FilteringBudgetGroupStatusFirst b : BudgetGroupListV30FilteringBudgetGroupStatusFirst.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BudgetGroupListV30FilteringBudgetGroupStatusFirst> {
    @Override
    public void write(final JsonWriter jsonWriter, final BudgetGroupListV30FilteringBudgetGroupStatusFirst enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BudgetGroupListV30FilteringBudgetGroupStatusFirst read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BudgetGroupListV30FilteringBudgetGroupStatusFirst.fromValue(value);
    }
  }
}

