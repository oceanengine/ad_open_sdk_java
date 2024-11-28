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
@JsonAdapter(LocalProjectDetailV30DataScheduleType.Adapter.class)
public enum LocalProjectDetailV30DataScheduleType {
  
  FIXED_TIME("FIXED_TIME"),
  
  FROM_NOW_ON("FROM_NOW_ON"),
  
  START_TO_END("START_TO_END");

  private String value;

  LocalProjectDetailV30DataScheduleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectDetailV30DataScheduleType fromValue(String value) {
    for (LocalProjectDetailV30DataScheduleType b : LocalProjectDetailV30DataScheduleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalProjectDetailV30DataScheduleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectDetailV30DataScheduleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectDetailV30DataScheduleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectDetailV30DataScheduleType.fromValue(value);
    }
  }
}

