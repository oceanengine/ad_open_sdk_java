/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@JsonAdapter(EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType.Adapter.class)
public enum EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType {
  
  INT("Int"),
  
  BIGINT("Bigint"),
  
  STRING("String"),
  
  FLOAT("Float"),
  
  BOOL("Bool"),
  
  ENUM("Enum");

  private String value;

  EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType fromValue(String value) {
    for (EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType b : EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType.fromValue(value);
    }
  }
}

