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
@JsonAdapter(ToolsBidSuggestV2Gender.Adapter.class)
public enum ToolsBidSuggestV2Gender {
  
  GENDER_MALE("GENDER_MALE"),
  
  GENDER_FEMALE("GENDER_FEMALE"),
  
  GENDER_UNLIMITED("GENDER_UNLIMITED"),
  
  NONE("NONE");

  private String value;

  ToolsBidSuggestV2Gender(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidSuggestV2Gender fromValue(String value) {
    for (ToolsBidSuggestV2Gender b : ToolsBidSuggestV2Gender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidSuggestV2Gender> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidSuggestV2Gender enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidSuggestV2Gender read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBidSuggestV2Gender.fromValue(value);
    }
  }
}

