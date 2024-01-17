/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(CreativeDetailGetV30DataAdDataPriorityTrial.Adapter.class)
public enum CreativeDetailGetV30DataAdDataPriorityTrial {
  
  OFF("OFF"),
  
  ON("ON");

  private String value;

  CreativeDetailGetV30DataAdDataPriorityTrial(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeDetailGetV30DataAdDataPriorityTrial fromValue(String value) {
    for (CreativeDetailGetV30DataAdDataPriorityTrial b : CreativeDetailGetV30DataAdDataPriorityTrial.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeDetailGetV30DataAdDataPriorityTrial> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeDetailGetV30DataAdDataPriorityTrial enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeDetailGetV30DataAdDataPriorityTrial read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeDetailGetV30DataAdDataPriorityTrial.fromValue(value);
    }
  }
}

