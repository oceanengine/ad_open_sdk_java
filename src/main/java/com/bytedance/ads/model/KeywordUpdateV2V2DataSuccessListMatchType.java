/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(KeywordUpdateV2V2DataSuccessListMatchType.Adapter.class)
public enum KeywordUpdateV2V2DataSuccessListMatchType {
  
  PHRASE("PHRASE"),
  
  EXTENSIVE("EXTENSIVE"),
  
  PRECISION("PRECISION");

  private String value;

  KeywordUpdateV2V2DataSuccessListMatchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeywordUpdateV2V2DataSuccessListMatchType fromValue(String value) {
    for (KeywordUpdateV2V2DataSuccessListMatchType b : KeywordUpdateV2V2DataSuccessListMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<KeywordUpdateV2V2DataSuccessListMatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeywordUpdateV2V2DataSuccessListMatchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeywordUpdateV2V2DataSuccessListMatchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeywordUpdateV2V2DataSuccessListMatchType.fromValue(value);
    }
  }
}

