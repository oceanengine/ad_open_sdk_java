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
@JsonAdapter(LocalCxtBudgetUpdateV30PeakWeekDays.Adapter.class)
public enum LocalCxtBudgetUpdateV30PeakWeekDays {
  
  FRIDAY("FRIDAY"),
  
  MONDAY("MONDAY"),
  
  SATURDAY("SATURDAY"),
  
  SUNDAY("SUNDAY"),
  
  THURSDAY("THURSDAY"),
  
  TUESDAY("TUESDAY"),
  
  WEDNESDAY("WEDNESDAY");

  private String value;

  LocalCxtBudgetUpdateV30PeakWeekDays(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalCxtBudgetUpdateV30PeakWeekDays fromValue(String value) {
    for (LocalCxtBudgetUpdateV30PeakWeekDays b : LocalCxtBudgetUpdateV30PeakWeekDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalCxtBudgetUpdateV30PeakWeekDays> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalCxtBudgetUpdateV30PeakWeekDays enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalCxtBudgetUpdateV30PeakWeekDays read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalCxtBudgetUpdateV30PeakWeekDays.fromValue(value);
    }
  }
}

