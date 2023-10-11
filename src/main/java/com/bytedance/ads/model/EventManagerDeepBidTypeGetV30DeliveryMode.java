/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
@JsonAdapter(EventManagerDeepBidTypeGetV30DeliveryMode.Adapter.class)
public enum EventManagerDeepBidTypeGetV30DeliveryMode {
  
  MANUAL("MANUAL"),
  
  PROCEDURAL("PROCEDURAL");

  private String value;

  EventManagerDeepBidTypeGetV30DeliveryMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerDeepBidTypeGetV30DeliveryMode fromValue(String value) {
    for (EventManagerDeepBidTypeGetV30DeliveryMode b : EventManagerDeepBidTypeGetV30DeliveryMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EventManagerDeepBidTypeGetV30DeliveryMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerDeepBidTypeGetV30DeliveryMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerDeepBidTypeGetV30DeliveryMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerDeepBidTypeGetV30DeliveryMode.fromValue(value);
    }
  }
}

