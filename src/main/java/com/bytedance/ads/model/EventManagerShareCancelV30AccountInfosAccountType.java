/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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
@JsonAdapter(EventManagerShareCancelV30AccountInfosAccountType.Adapter.class)
public enum EventManagerShareCancelV30AccountInfosAccountType {
  
  AD("AD");

  private String value;

  EventManagerShareCancelV30AccountInfosAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerShareCancelV30AccountInfosAccountType fromValue(String value) {
    for (EventManagerShareCancelV30AccountInfosAccountType b : EventManagerShareCancelV30AccountInfosAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EventManagerShareCancelV30AccountInfosAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerShareCancelV30AccountInfosAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerShareCancelV30AccountInfosAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerShareCancelV30AccountInfosAccountType.fromValue(value);
    }
  }
}

