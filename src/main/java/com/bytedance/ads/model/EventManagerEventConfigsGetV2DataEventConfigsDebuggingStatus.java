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
@JsonAdapter(EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus.Adapter.class)
public enum EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus {
  
  INACTIVE("Inactive"),
  
  ACTIVE("Active");

  private String value;

  EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus fromValue(String value) {
    for (EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus b : EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus.fromValue(value);
    }
  }
}

