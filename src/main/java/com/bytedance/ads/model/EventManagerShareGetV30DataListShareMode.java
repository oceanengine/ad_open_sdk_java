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
@JsonAdapter(EventManagerShareGetV30DataListShareMode.Adapter.class)
public enum EventManagerShareGetV30DataListShareMode {
  
  ALL("ALL"),
  
  PART("PART");

  private String value;

  EventManagerShareGetV30DataListShareMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerShareGetV30DataListShareMode fromValue(String value) {
    for (EventManagerShareGetV30DataListShareMode b : EventManagerShareGetV30DataListShareMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EventManagerShareGetV30DataListShareMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerShareGetV30DataListShareMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerShareGetV30DataListShareMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerShareGetV30DataListShareMode.fromValue(value);
    }
  }
}

