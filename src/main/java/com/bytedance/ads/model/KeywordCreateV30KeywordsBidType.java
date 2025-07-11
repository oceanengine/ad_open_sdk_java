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
@JsonAdapter(KeywordCreateV30KeywordsBidType.Adapter.class)
public enum KeywordCreateV30KeywordsBidType {
  
  CUSTOM("CUSTOM"),
  
  WITH_PROMOTION("WITH_PROMOTION");

  private String value;

  KeywordCreateV30KeywordsBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeywordCreateV30KeywordsBidType fromValue(String value) {
    for (KeywordCreateV30KeywordsBidType b : KeywordCreateV30KeywordsBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<KeywordCreateV30KeywordsBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeywordCreateV30KeywordsBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeywordCreateV30KeywordsBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeywordCreateV30KeywordsBidType.fromValue(value);
    }
  }
}

