/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(LocalProjectUpdateV30ScheduleType.Adapter.class)
public enum LocalProjectUpdateV30ScheduleType {
  
  FIXED_TIME("FIXED_TIME"),
  
  FROM_NOW_ON("FROM_NOW_ON"),
  
  START_TO_END("START_TO_END");

  private String value;

  LocalProjectUpdateV30ScheduleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectUpdateV30ScheduleType fromValue(String value) {
    for (LocalProjectUpdateV30ScheduleType b : LocalProjectUpdateV30ScheduleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalProjectUpdateV30ScheduleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectUpdateV30ScheduleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectUpdateV30ScheduleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectUpdateV30ScheduleType.fromValue(value);
    }
  }
}

