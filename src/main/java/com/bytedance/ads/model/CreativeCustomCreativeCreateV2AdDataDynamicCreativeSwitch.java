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
@JsonAdapter(CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch.Adapter.class)
public enum CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch {
  
  ABSTRACT("DYNAMIC_CREATIVE_ABSTRACT"),
  
  SUBLINK("DYNAMIC_CREATIVE_SUBLINK"),
  
  TITLE("DYNAMIC_CREATIVE_TITLE"),
  
  ON("DYNAMIC_CREATIVE_ON");

  private String value;

  CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch fromValue(String value) {
    for (CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch b : CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch.fromValue(value);
    }
  }
}

