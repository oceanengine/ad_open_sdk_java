/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.55
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
@JsonAdapter(ToolsEstimateAudienceV2ArticleCategory.Adapter.class)
public enum ToolsEstimateAudienceV2ArticleCategory {
  
  PETS("PETS"),
  
  AMUSEMENT("AMUSEMENT"),
  
  DIGITAL("DIGITAL"),
  
  EDUCATION("EDUCATION"),
  
  MOVIE("MOVIE"),
  
  ESSAY("ESSAY"),
  
  GOVERNMENT("GOVERNMENT"),
  
  RUMOR_CRACKER("RUMOR_CRACKER"),
  
  PHOTOGRAPHY("PHOTOGRAPHY"),
  
  FREAK("FREAK"),
  
  FINANCE("FINANCE"),
  
  HOME("HOME"),
  
  EMOTION("EMOTION"),
  
  REGIMEN("REGIMEN"),
  
  HISTORY("HISTORY"),
  
  HEALTH("HEALTH"),
  
  FASHION("FASHION"),
  
  TRAVEL("TRAVEL"),
  
  INTERNATIONAL("INTERNATIONAL"),
  
  BUSINESS("BUSINESS"),
  
  COMICS("COMICS"),
  
  WORKPLACE("WORKPLACE"),
  
  CONSTELLATION("CONSTELLATION"),
  
  LAWS("LAWS"),
  
  ENTERTAINMENT("ENTERTAINMENT"),
  
  GOURMET("GOURMET"),
  
  SOCIETY("SOCIETY"),
  
  ANIMATION("ANIMATION"),
  
  WEIGHT_LOSING("WEIGHT_LOSING"),
  
  COLLECTION("COLLECTION"),
  
  STORIES("STORIES"),
  
  SCIENCE("SCIENCE"),
  
  LOCAL("LOCAL"),
  
  GAMES("GAMES"),
  
  MILITARY("MILITARY"),
  
  ESTATE("ESTATE"),
  
  GRADUATES("GRADUATES"),
  
  CARS("CARS"),
  
  TIPS("TIPS"),
  
  SPORTS("SPORTS"),
  
  PARENTING("PARENTING"),
  
  EXPLORE("EXPLORE"),
  
  CULTURE("CULTURE"),
  
  TECHNOLOGY("TECHNOLOGY"),
  
  DESIGN("DESIGN");

  private String value;

  ToolsEstimateAudienceV2ArticleCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEstimateAudienceV2ArticleCategory fromValue(String value) {
    for (ToolsEstimateAudienceV2ArticleCategory b : ToolsEstimateAudienceV2ArticleCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEstimateAudienceV2ArticleCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEstimateAudienceV2ArticleCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEstimateAudienceV2ArticleCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEstimateAudienceV2ArticleCategory.fromValue(value);
    }
  }
}

