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
@JsonAdapter(LocalProjectDetailV30DataPeakHolidays.Adapter.class)
public enum LocalProjectDetailV30DataPeakHolidays {
  
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

  LocalProjectDetailV30DataPeakHolidays(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectDetailV30DataPeakHolidays fromValue(String value) {
    for (LocalProjectDetailV30DataPeakHolidays b : LocalProjectDetailV30DataPeakHolidays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalProjectDetailV30DataPeakHolidays> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectDetailV30DataPeakHolidays enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectDetailV30DataPeakHolidays read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectDetailV30DataPeakHolidays.fromValue(value);
    }
  }
}

