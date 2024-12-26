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
@JsonAdapter(KeywordListV30DataListBidType.Adapter.class)
public enum KeywordListV30DataListBidType {
  
  CUSTOM("CUSTOM"),
  
  FEED_TO_SEARCH("FEED_TO_SEARCH"),
  
  WITH_PROMOTION("WITH_PROMOTION");

  private String value;

  KeywordListV30DataListBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeywordListV30DataListBidType fromValue(String value) {
    for (KeywordListV30DataListBidType b : KeywordListV30DataListBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<KeywordListV30DataListBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeywordListV30DataListBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeywordListV30DataListBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeywordListV30DataListBidType.fromValue(value);
    }
  }
}

