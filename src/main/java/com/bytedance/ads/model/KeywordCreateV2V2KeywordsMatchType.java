/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(KeywordCreateV2V2KeywordsMatchType.Adapter.class)
public enum KeywordCreateV2V2KeywordsMatchType {
  
  PHRASE("PHRASE"),
  
  EXTENSIVE("EXTENSIVE"),
  
  PRECISION("PRECISION");

  private String value;

  KeywordCreateV2V2KeywordsMatchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeywordCreateV2V2KeywordsMatchType fromValue(String value) {
    for (KeywordCreateV2V2KeywordsMatchType b : KeywordCreateV2V2KeywordsMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<KeywordCreateV2V2KeywordsMatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeywordCreateV2V2KeywordsMatchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeywordCreateV2V2KeywordsMatchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeywordCreateV2V2KeywordsMatchType.fromValue(value);
    }
  }
}

