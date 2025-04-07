/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(AssetsCreativeComponentCreateV2ComponentInfoComponentType.Adapter.class)
public enum AssetsCreativeComponentCreateV2ComponentInfoComponentType {
  
  GAME_PACK("GAME_PACK"),
  
  COMMERCE_MAGNET("COMMERCE_MAGNET"),
  
  IMAGE_MAGNET("IMAGE_MAGNET"),
  
  VOTE_MAGNET("VOTE_MAGNET"),
  
  PROMOTION_CARD("PROMOTION_CARD"),
  
  LIGHT_INTER_ACTIVE("LIGHT_INTER_ACTIVE"),
  
  RESERVATION_BUTTON("RESERVATION_BUTTON"),
  
  UNION_LIGHT_INTERACTIVE("UNION_LIGHT_INTERACTIVE"),
  
  COUPON_MAGNET("COUPON_MAGNET"),
  
  ECOMMERCE_CARD("ECOMMERCE_CARD"),
  
  CHOICE_MAGNET("CHOICE_MAGNET"),
  
  LUCKY_BOX("LUCKY_BOX"),
  
  HALF_INTERACTIVE("HALF_INTERACTIVE");

  private String value;

  AssetsCreativeComponentCreateV2ComponentInfoComponentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetsCreativeComponentCreateV2ComponentInfoComponentType fromValue(String value) {
    for (AssetsCreativeComponentCreateV2ComponentInfoComponentType b : AssetsCreativeComponentCreateV2ComponentInfoComponentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AssetsCreativeComponentCreateV2ComponentInfoComponentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AssetsCreativeComponentCreateV2ComponentInfoComponentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AssetsCreativeComponentCreateV2ComponentInfoComponentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AssetsCreativeComponentCreateV2ComponentInfoComponentType.fromValue(value);
    }
  }
}

