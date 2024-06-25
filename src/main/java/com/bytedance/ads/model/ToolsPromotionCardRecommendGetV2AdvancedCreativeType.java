/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(ToolsPromotionCardRecommendGetV2AdvancedCreativeType.Adapter.class)
public enum ToolsPromotionCardRecommendGetV2AdvancedCreativeType {
  
  NONE("ATTACHED_CREATIVE_NONE"),
  
  INTERACT("ATTACHED_CREATIVE_INTERACT"),
  
  GAME_PACKAGE("ATTACHED_CREATIVE_GAME_PACKAGE"),
  
  LIVE_CARD("ATTACHED_CREATIVE_LIVE_CARD"),
  
  COUPON("ATTACHED_CREATIVE_COUPON"),
  
  CONSULTANT("ATTACHED_CREATIVE_CONSULTANT"),
  
  FORM("ATTACHED_CREATIVE_FORM"),
  
  PHONE("ATTACHED_CREATIVE_PHONE"),
  
  APP("ATTACHED_CREATIVE_APP"),
  
  DOWNLOAD_CARD("ATTACHED_CREATIVE_DOWNLOAD_CARD"),
  
  SMART_PHONE("ATTACHED_CREATIVE_SMART_PHONE"),
  
  COUPON_INTERACT("ATTACHED_CREATIVE_COUPON_INTERACT"),
  
  GAME_FORM("ATTACHED_CREATIVE_GAME_FORM"),
  
  GAME_SUBSCRIBE("ATTACHED_CREATIVE_GAME_SUBSCRIBE"),
  
  VOTE_INTERACT("ATTACHED_CREATIVE_VOTE_INTERACT"),
  
  CARD("ATTACHED_CREATIVE_CARD"),
  
  COMMERCE_CARD("ATTACHED_CREATIVE_COMMERCE_CARD");

  private String value;

  ToolsPromotionCardRecommendGetV2AdvancedCreativeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPromotionCardRecommendGetV2AdvancedCreativeType fromValue(String value) {
    for (ToolsPromotionCardRecommendGetV2AdvancedCreativeType b : ToolsPromotionCardRecommendGetV2AdvancedCreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsPromotionCardRecommendGetV2AdvancedCreativeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPromotionCardRecommendGetV2AdvancedCreativeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPromotionCardRecommendGetV2AdvancedCreativeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPromotionCardRecommendGetV2AdvancedCreativeType.fromValue(value);
    }
  }
}

