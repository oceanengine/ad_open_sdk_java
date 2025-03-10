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
@JsonAdapter(KeywordUpdateV2V2DataSuccessListBidType.Adapter.class)
public enum KeywordUpdateV2V2DataSuccessListBidType {
  
  FEED_TO_SEARCH("FEED_TO_SEARCH"),
  
  WITH_AD("WITH_AD"),
  
  BRAND_AD("BRAND_AD"),
  
  CUSTOM("CUSTOM"),
  
  SUGGEST("SUGGEST");

  private String value;

  KeywordUpdateV2V2DataSuccessListBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeywordUpdateV2V2DataSuccessListBidType fromValue(String value) {
    for (KeywordUpdateV2V2DataSuccessListBidType b : KeywordUpdateV2V2DataSuccessListBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<KeywordUpdateV2V2DataSuccessListBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeywordUpdateV2V2DataSuccessListBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeywordUpdateV2V2DataSuccessListBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeywordUpdateV2V2DataSuccessListBidType.fromValue(value);
    }
  }
}

