/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(LocalProjectCreateV30PeakHolidays.Adapter.class)
public enum LocalProjectCreateV30PeakHolidays {
  
  CHINESE_VALENTINES_DAY("CHINESE_VALENTINES_DAY"),
  
  CHRISTMAS("CHRISTMAS"),
  
  DRAGON_BOAT_FESTIVAL("DRAGON_BOAT_FESTIVAL"),
  
  LABOUR_DAY("LABOUR_DAY"),
  
  MOON_FESTIVAL("MOON_FESTIVAL"),
  
  NATIONAL_DAY("NATIONAL_DAY"),
  
  NEW_YEAR("NEW_YEAR"),
  
  SHOPPING_DAY_1111("SHOPPING_DAY_1111"),
  
  SHOPPING_DAY_618("SHOPPING_DAY_618"),
  
  SPRING_FESTIVAL("SPRING_FESTIVAL"),
  
  VALENTINES_DAY("VALENTINES_DAY");

  private String value;

  LocalProjectCreateV30PeakHolidays(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectCreateV30PeakHolidays fromValue(String value) {
    for (LocalProjectCreateV30PeakHolidays b : LocalProjectCreateV30PeakHolidays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalProjectCreateV30PeakHolidays> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectCreateV30PeakHolidays enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectCreateV30PeakHolidays read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectCreateV30PeakHolidays.fromValue(value);
    }
  }
}

