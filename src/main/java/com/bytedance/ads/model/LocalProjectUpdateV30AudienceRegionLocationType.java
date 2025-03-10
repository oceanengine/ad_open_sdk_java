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
@JsonAdapter(LocalProjectUpdateV30AudienceRegionLocationType.Adapter.class)
public enum LocalProjectUpdateV30AudienceRegionLocationType {
  
  ALL("ALL"),
  
  CURRENT("CURRENT"),
  
  HOME("HOME"),
  
  TRAVEL("TRAVEL");

  private String value;

  LocalProjectUpdateV30AudienceRegionLocationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectUpdateV30AudienceRegionLocationType fromValue(String value) {
    for (LocalProjectUpdateV30AudienceRegionLocationType b : LocalProjectUpdateV30AudienceRegionLocationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalProjectUpdateV30AudienceRegionLocationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectUpdateV30AudienceRegionLocationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectUpdateV30AudienceRegionLocationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectUpdateV30AudienceRegionLocationType.fromValue(value);
    }
  }
}

