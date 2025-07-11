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
@JsonAdapter(ToolsMicroGameCreateV30ScheduleCards.Adapter.class)
public enum ToolsMicroGameCreateV30ScheduleCards {
  
  ANNUAL("Annual"),
  
  LIFETIME("Lifetime"),
  
  MONTHLY("Monthly"),
  
  NONE("None"),
  
  QUARTERLY("Quarterly"),
  
  WEEKLY("Weekly");

  private String value;

  ToolsMicroGameCreateV30ScheduleCards(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsMicroGameCreateV30ScheduleCards fromValue(String value) {
    for (ToolsMicroGameCreateV30ScheduleCards b : ToolsMicroGameCreateV30ScheduleCards.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsMicroGameCreateV30ScheduleCards> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsMicroGameCreateV30ScheduleCards enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsMicroGameCreateV30ScheduleCards read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsMicroGameCreateV30ScheduleCards.fromValue(value);
    }
  }
}

