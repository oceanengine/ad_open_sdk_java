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
@JsonAdapter(AdGetV2DataSceneInventory.Adapter.class)
public enum AdGetV2DataSceneInventory {
  
  TAIL_SCENE("TAIL_SCENE"),
  
  FEED_SCENE("FEED_SCENE"),
  
  VIDEO_SCENE("VIDEO_SCENE"),
  
  NOT_SELECT("NOT_SELECT");

  private String value;

  AdGetV2DataSceneInventory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataSceneInventory fromValue(String value) {
    for (AdGetV2DataSceneInventory b : AdGetV2DataSceneInventory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataSceneInventory> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataSceneInventory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataSceneInventory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataSceneInventory.fromValue(value);
    }
  }
}

