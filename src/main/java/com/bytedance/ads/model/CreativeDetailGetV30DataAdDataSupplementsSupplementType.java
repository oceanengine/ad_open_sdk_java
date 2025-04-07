/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(CreativeDetailGetV30DataAdDataSupplementsSupplementType.Adapter.class)
public enum CreativeDetailGetV30DataAdDataSupplementsSupplementType {
  
  CLOUD_GAME("CLOUD_GAME"),
  
  NORMAL("NORMAL");

  private String value;

  CreativeDetailGetV30DataAdDataSupplementsSupplementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeDetailGetV30DataAdDataSupplementsSupplementType fromValue(String value) {
    for (CreativeDetailGetV30DataAdDataSupplementsSupplementType b : CreativeDetailGetV30DataAdDataSupplementsSupplementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeDetailGetV30DataAdDataSupplementsSupplementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeDetailGetV30DataAdDataSupplementsSupplementType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeDetailGetV30DataAdDataSupplementsSupplementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeDetailGetV30DataAdDataSupplementsSupplementType.fromValue(value);
    }
  }
}

