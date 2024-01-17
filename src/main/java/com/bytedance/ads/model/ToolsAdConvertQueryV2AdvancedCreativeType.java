/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(ToolsAdConvertQueryV2AdvancedCreativeType.Adapter.class)
public enum ToolsAdConvertQueryV2AdvancedCreativeType {
  
  FORM("ATTACHED_CREATIVE_FORM"),
  
  COMMERCE_CARD("ATTACHED_CREATIVE_COMMERCE_CARD"),
  
  COUPON("ATTACHED_CREATIVE_COUPON"),
  
  APP("ATTACHED_CREATIVE_APP"),
  
  CONSULTANT("ATTACHED_CREATIVE_CONSULTANT"),
  
  INTERACT("ATTACHED_CREATIVE_INTERACT"),
  
  NONE("ATTACHED_CREATIVE_NONE"),
  
  GAME_PACKAGE("ATTACHED_CREATIVE_GAME_PACKAGE"),
  
  COUPON_INTERACT("ATTACHED_CREATIVE_COUPON_INTERACT"),
  
  PHONE("ATTACHED_CREATIVE_PHONE"),
  
  VOTE_INTERACT("ATTACHED_CREATIVE_VOTE_INTERACT"),
  
  DOWNLOAD_CARD("ATTACHED_CREATIVE_DOWNLOAD_CARD"),
  
  CARD("ATTACHED_CREATIVE_CARD"),
  
  GAME_SUBSCRIBE("ATTACHED_CREATIVE_GAME_SUBSCRIBE"),
  
  GAME_FORM("ATTACHED_CREATIVE_GAME_FORM"),
  
  SMART_PHONE("ATTACHED_CREATIVE_SMART_PHONE"),
  
  LIVE_CARD("ATTACHED_CREATIVE_LIVE_CARD");

  private String value;

  ToolsAdConvertQueryV2AdvancedCreativeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdConvertQueryV2AdvancedCreativeType fromValue(String value) {
    for (ToolsAdConvertQueryV2AdvancedCreativeType b : ToolsAdConvertQueryV2AdvancedCreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdConvertQueryV2AdvancedCreativeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdConvertQueryV2AdvancedCreativeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdConvertQueryV2AdvancedCreativeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdConvertQueryV2AdvancedCreativeType.fromValue(value);
    }
  }
}

