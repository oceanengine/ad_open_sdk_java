/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
@JsonAdapter(AdGetV2DataAudienceAwemeFanBehaviors.Adapter.class)
public enum AdGetV2DataAudienceAwemeFanBehaviors {
  
  LIVE_EFFECTIVE_WATCH("LIVE_EFFECTIVE_WATCH"),
  
  GOODS_CARTS_ORDER("GOODS_CARTS_ORDER"),
  
  LIVE_GOODS_CLICK("LIVE_GOODS_CLICK"),
  
  LIVE_COMMENT("LIVE_COMMENT"),
  
  SHARED_USER("SHARED_USER"),
  
  LIKED_USER("LIKED_USER"),
  
  LIVE_EXCEPTIONAL("LIVE_EXCEPTIONAL"),
  
  LIVE_WATCH("LIVE_WATCH"),
  
  COMMENTED_USER("COMMENTED_USER"),
  
  GOODS_CARTS_CLICK("GOODS_CARTS_CLICK"),
  
  FOLLOWED_USER("FOLLOWED_USER"),
  
  LIVE_GOODS_ORDER("LIVE_GOODS_ORDER");

  private String value;

  AdGetV2DataAudienceAwemeFanBehaviors(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAudienceAwemeFanBehaviors fromValue(String value) {
    for (AdGetV2DataAudienceAwemeFanBehaviors b : AdGetV2DataAudienceAwemeFanBehaviors.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAudienceAwemeFanBehaviors> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAudienceAwemeFanBehaviors enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAudienceAwemeFanBehaviors read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAudienceAwemeFanBehaviors.fromValue(value);
    }
  }
}
