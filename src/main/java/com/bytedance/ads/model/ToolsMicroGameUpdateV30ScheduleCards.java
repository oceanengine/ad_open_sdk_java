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
@JsonAdapter(ToolsMicroGameUpdateV30ScheduleCards.Adapter.class)
public enum ToolsMicroGameUpdateV30ScheduleCards {
  
  ANNUAL("Annual"),
  
  LIFETIME("Lifetime"),
  
  MONTHLY("Monthly"),
  
  NONE("None"),
  
  QUARTERLY("Quarterly"),
  
  WEEKLY("Weekly");

  private String value;

  ToolsMicroGameUpdateV30ScheduleCards(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsMicroGameUpdateV30ScheduleCards fromValue(String value) {
    for (ToolsMicroGameUpdateV30ScheduleCards b : ToolsMicroGameUpdateV30ScheduleCards.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsMicroGameUpdateV30ScheduleCards> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsMicroGameUpdateV30ScheduleCards enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsMicroGameUpdateV30ScheduleCards read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsMicroGameUpdateV30ScheduleCards.fromValue(value);
    }
  }
}

