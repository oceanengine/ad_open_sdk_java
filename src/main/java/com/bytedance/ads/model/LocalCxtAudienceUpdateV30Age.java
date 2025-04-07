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
@JsonAdapter(LocalCxtAudienceUpdateV30Age.Adapter.class)
public enum LocalCxtAudienceUpdateV30Age {
  
  ABOVE_50("AGE_ABOVE_50"),
  
  BETWEEN_18_23("AGE_BETWEEN_18_23"),
  
  BETWEEN_24_30("AGE_BETWEEN_24_30"),
  
  BETWEEN_31_40("AGE_BETWEEN_31_40"),
  
  BETWEEN_41_49("AGE_BETWEEN_41_49");

  private String value;

  LocalCxtAudienceUpdateV30Age(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalCxtAudienceUpdateV30Age fromValue(String value) {
    for (LocalCxtAudienceUpdateV30Age b : LocalCxtAudienceUpdateV30Age.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalCxtAudienceUpdateV30Age> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalCxtAudienceUpdateV30Age enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalCxtAudienceUpdateV30Age read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalCxtAudienceUpdateV30Age.fromValue(value);
    }
  }
}

