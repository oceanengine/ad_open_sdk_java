/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(ClueFormDetailV2DataFormValidateType.Adapter.class)
public enum ClueFormDetailV2DataFormValidateType {
  
  AUTO_VERIFICATION("AUTO_VERIFICATION"),
  
  ALL_VERIFICATION("ALL_VERIFICATION"),
  
  VALIDITY_PRIORITY("VALIDITY_PRIORITY"),
  
  CLUE_PRIORITY("CLUE_PRIORITY"),
  
  NONE_VERIFICATION("NONE_VERIFICATION");

  private String value;

  ClueFormDetailV2DataFormValidateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueFormDetailV2DataFormValidateType fromValue(String value) {
    for (ClueFormDetailV2DataFormValidateType b : ClueFormDetailV2DataFormValidateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueFormDetailV2DataFormValidateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueFormDetailV2DataFormValidateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueFormDetailV2DataFormValidateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueFormDetailV2DataFormValidateType.fromValue(value);
    }
  }
}

