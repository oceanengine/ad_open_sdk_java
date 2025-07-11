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
@JsonAdapter(EventManagerShareCancelV30AllAccountType.Adapter.class)
public enum EventManagerShareCancelV30AllAccountType {
  
  AD("AD");

  private String value;

  EventManagerShareCancelV30AllAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerShareCancelV30AllAccountType fromValue(String value) {
    for (EventManagerShareCancelV30AllAccountType b : EventManagerShareCancelV30AllAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EventManagerShareCancelV30AllAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerShareCancelV30AllAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerShareCancelV30AllAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerShareCancelV30AllAccountType.fromValue(value);
    }
  }
}

