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
@JsonAdapter(ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay.Adapter.class)
public enum ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay {
  
  EVERY_DAY("EVERY_DAY"),
  
  PER_FRIDAY("PER_FRIDAY"),
  
  PER_MONDAY("PER_MONDAY"),
  
  PER_SATURDAY("PER_SATURDAY"),
  
  PER_SUNDAY("PER_SUNDAY"),
  
  PER_THURSDAY("PER_THURSDAY"),
  
  PER_TUESDAY("PER_TUESDAY"),
  
  PER_WEDNESDAY("PER_WEDNESDAY");

  private String value;

  ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay fromValue(String value) {
    for (ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay b : ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPromotionRaiseSetV30RaiseInfoAppointedTimeRepeatedDay.fromValue(value);
    }
  }
}

