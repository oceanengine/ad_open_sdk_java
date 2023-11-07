/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
@JsonAdapter(ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay.Adapter.class)
public enum ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay {
  
  EVERY_DAY("EVERY_DAY"),
  
  PER_FRIDAY("PER_FRIDAY"),
  
  PER_MONDAY("PER_MONDAY"),
  
  PER_SATURDAY("PER_SATURDAY"),
  
  PER_SUNDAY("PER_SUNDAY"),
  
  PER_THURSDAY("PER_THURSDAY"),
  
  PER_TUESDAY("PER_TUESDAY"),
  
  PER_WEDNESDAY("PER_WEDNESDAY");

  private String value;

  ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay fromValue(String value) {
    for (ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay b : ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPromotionRaiseStatusGetV30DataListRaiseInfoAppointTimeRepeatDay.fromValue(value);
    }
  }
}

