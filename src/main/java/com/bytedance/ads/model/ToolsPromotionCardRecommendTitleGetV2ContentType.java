/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
@JsonAdapter(ToolsPromotionCardRecommendTitleGetV2ContentType.Adapter.class)
public enum ToolsPromotionCardRecommendTitleGetV2ContentType {
  
  GAME_SUBSCRIBE("GAME_SUBSCRIBE"),
  
  TABLE("TABLE"),
  
  PHONE("PHONE"),
  
  CONSULT("CONSULT"),
  
  CARD("CARD"),
  
  GAME_FORM("GAME_FORM"),
  
  GAME_PACKAGE("GAME_PACKAGE"),
  
  DOWNLOAD("DOWNLOAD"),
  
  LANDING("LANDING"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ToolsPromotionCardRecommendTitleGetV2ContentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPromotionCardRecommendTitleGetV2ContentType fromValue(String value) {
    for (ToolsPromotionCardRecommendTitleGetV2ContentType b : ToolsPromotionCardRecommendTitleGetV2ContentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsPromotionCardRecommendTitleGetV2ContentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPromotionCardRecommendTitleGetV2ContentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPromotionCardRecommendTitleGetV2ContentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPromotionCardRecommendTitleGetV2ContentType.fromValue(value);
    }
  }
}

