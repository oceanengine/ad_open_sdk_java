/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
@JsonAdapter(AssetsCreativeComponentUpdateV2ComponentInfoComponentType.Adapter.class)
public enum AssetsCreativeComponentUpdateV2ComponentInfoComponentType {
  
  UNION_LIGHT_INTERACTIVE("UNION_LIGHT_INTERACTIVE"),
  
  CHOICE_MAGNET("CHOICE_MAGNET"),
  
  ECOMMERCE_CARD("ECOMMERCE_CARD"),
  
  VOTE_MAGNET("VOTE_MAGNET"),
  
  LIGHT_INTER_ACTIVE("LIGHT_INTER_ACTIVE"),
  
  RESERVATION_BUTTON("RESERVATION_BUTTON"),
  
  HALF_INTERACTIVE("HALF_INTERACTIVE"),
  
  COUPON_MAGNET("COUPON_MAGNET"),
  
  IMAGE_MAGNET("IMAGE_MAGNET"),
  
  PROMOTION_CARD("PROMOTION_CARD"),
  
  GAME_PACK("GAME_PACK"),
  
  LUCKY_BOX("LUCKY_BOX"),
  
  COMMERCE_MAGNET("COMMERCE_MAGNET");

  private String value;

  AssetsCreativeComponentUpdateV2ComponentInfoComponentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetsCreativeComponentUpdateV2ComponentInfoComponentType fromValue(String value) {
    for (AssetsCreativeComponentUpdateV2ComponentInfoComponentType b : AssetsCreativeComponentUpdateV2ComponentInfoComponentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AssetsCreativeComponentUpdateV2ComponentInfoComponentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AssetsCreativeComponentUpdateV2ComponentInfoComponentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AssetsCreativeComponentUpdateV2ComponentInfoComponentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AssetsCreativeComponentUpdateV2ComponentInfoComponentType.fromValue(value);
    }
  }
}

