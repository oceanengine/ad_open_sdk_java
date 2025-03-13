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
@JsonAdapter(AdGetV2DataAdvancedCreativeType.Adapter.class)
public enum AdGetV2DataAdvancedCreativeType {
  
  APP("ATTACHED_CREATIVE_APP"),
  
  VOTE_INTERACT("ATTACHED_CREATIVE_VOTE_INTERACT"),
  
  COMMERCE_CARD("ATTACHED_CREATIVE_COMMERCE_CARD"),
  
  COUPON("ATTACHED_CREATIVE_COUPON"),
  
  INTERACT("ATTACHED_CREATIVE_INTERACT"),
  
  PHONE("ATTACHED_CREATIVE_PHONE"),
  
  SMART_PHONE("ATTACHED_CREATIVE_SMART_PHONE"),
  
  GAME_FORM("ATTACHED_CREATIVE_GAME_FORM"),
  
  LIVE_CARD("ATTACHED_CREATIVE_LIVE_CARD"),
  
  COUPON_INTERACT("ATTACHED_CREATIVE_COUPON_INTERACT"),
  
  GAME_SUBSCRIBE("ATTACHED_CREATIVE_GAME_SUBSCRIBE"),
  
  CARD("ATTACHED_CREATIVE_CARD"),
  
  FORM("ATTACHED_CREATIVE_FORM"),
  
  DOWNLOAD_CARD("ATTACHED_CREATIVE_DOWNLOAD_CARD"),
  
  GAME_PACKAGE("ATTACHED_CREATIVE_GAME_PACKAGE"),
  
  CONSULTANT("ATTACHED_CREATIVE_CONSULTANT"),
  
  NONE("ATTACHED_CREATIVE_NONE");

  private String value;

  AdGetV2DataAdvancedCreativeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAdvancedCreativeType fromValue(String value) {
    for (AdGetV2DataAdvancedCreativeType b : AdGetV2DataAdvancedCreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAdvancedCreativeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAdvancedCreativeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAdvancedCreativeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAdvancedCreativeType.fromValue(value);
    }
  }
}

