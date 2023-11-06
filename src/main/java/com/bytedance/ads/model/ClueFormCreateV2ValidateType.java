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
@JsonAdapter(ClueFormCreateV2ValidateType.Adapter.class)
public enum ClueFormCreateV2ValidateType {
  
  VALIDITY_PRIORITY("VALIDITY_PRIORITY"),
  
  ALL_VERIFICATION("ALL_VERIFICATION"),
  
  AUTO_VERIFICATION("AUTO_VERIFICATION"),
  
  NONE_VERIFICATION("NONE_VERIFICATION"),
  
  CLUE_PRIORITY("CLUE_PRIORITY");

  private String value;

  ClueFormCreateV2ValidateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueFormCreateV2ValidateType fromValue(String value) {
    for (ClueFormCreateV2ValidateType b : ClueFormCreateV2ValidateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueFormCreateV2ValidateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueFormCreateV2ValidateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueFormCreateV2ValidateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueFormCreateV2ValidateType.fromValue(value);
    }
  }
}

