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
@JsonAdapter(KeywordGetV2DataListBidType.Adapter.class)
public enum KeywordGetV2DataListBidType {
  
  CUSTOM("CUSTOM"),
  
  BRAND_AD("BRAND_AD"),
  
  SUGGEST("SUGGEST"),
  
  FEED_TO_SEARCH("FEED_TO_SEARCH"),
  
  WITH_AD("WITH_AD");

  private String value;

  KeywordGetV2DataListBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeywordGetV2DataListBidType fromValue(String value) {
    for (KeywordGetV2DataListBidType b : KeywordGetV2DataListBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<KeywordGetV2DataListBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeywordGetV2DataListBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeywordGetV2DataListBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeywordGetV2DataListBidType.fromValue(value);
    }
  }
}

