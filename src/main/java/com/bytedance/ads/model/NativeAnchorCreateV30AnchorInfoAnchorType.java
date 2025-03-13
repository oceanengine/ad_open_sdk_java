/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(NativeAnchorCreateV30AnchorInfoAnchorType.Adapter.class)
public enum NativeAnchorCreateV30AnchorInfoAnchorType {
  
  APP_GAME("APP_GAME"),
  
  APP_INTERNET_SERVICE("APP_INTERNET_SERVICE"),
  
  APP_SHOP("APP_SHOP"),
  
  MICRO_APP("MICRO_APP"),
  
  ONLINE_SUBSCRIBE("ONLINE_SUBSCRIBE"),
  
  PRIVATE_CHAT("PRIVATE_CHAT"),
  
  SHOPPING_CART("SHOPPING_CART");

  private String value;

  NativeAnchorCreateV30AnchorInfoAnchorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorCreateV30AnchorInfoAnchorType fromValue(String value) {
    for (NativeAnchorCreateV30AnchorInfoAnchorType b : NativeAnchorCreateV30AnchorInfoAnchorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NativeAnchorCreateV30AnchorInfoAnchorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorCreateV30AnchorInfoAnchorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorCreateV30AnchorInfoAnchorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorCreateV30AnchorInfoAnchorType.fromValue(value);
    }
  }
}

