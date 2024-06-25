/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType.Adapter.class)
public enum EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType {
  
  APP("BYTE_APP"),
  
  GAME("BYTE_GAME");

  private String value;

  EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType fromValue(String value) {
    for (EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType b : EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType.fromValue(value);
    }
  }
}

