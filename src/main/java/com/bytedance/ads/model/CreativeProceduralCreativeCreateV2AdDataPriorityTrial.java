/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(CreativeProceduralCreativeCreateV2AdDataPriorityTrial.Adapter.class)
public enum CreativeProceduralCreativeCreateV2AdDataPriorityTrial {
  
  ON("ON"),
  
  OFF("OFF");

  private String value;

  CreativeProceduralCreativeCreateV2AdDataPriorityTrial(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeProceduralCreativeCreateV2AdDataPriorityTrial fromValue(String value) {
    for (CreativeProceduralCreativeCreateV2AdDataPriorityTrial b : CreativeProceduralCreativeCreateV2AdDataPriorityTrial.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeProceduralCreativeCreateV2AdDataPriorityTrial> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeProceduralCreativeCreateV2AdDataPriorityTrial enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeProceduralCreativeCreateV2AdDataPriorityTrial read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeProceduralCreativeCreateV2AdDataPriorityTrial.fromValue(value);
    }
  }
}

