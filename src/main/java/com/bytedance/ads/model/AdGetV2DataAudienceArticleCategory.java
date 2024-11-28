/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(AdGetV2DataAudienceArticleCategory.Adapter.class)
public enum AdGetV2DataAudienceArticleCategory {
  
  FASHION("FASHION"),
  
  ANIMATION("ANIMATION"),
  
  PARENTING("PARENTING"),
  
  BUSINESS("BUSINESS"),
  
  PETS("PETS"),
  
  SCIENCE("SCIENCE"),
  
  INTERNATIONAL("INTERNATIONAL"),
  
  MOVIE("MOVIE"),
  
  GOVERNMENT("GOVERNMENT"),
  
  GRADUATES("GRADUATES"),
  
  COLLECTION("COLLECTION"),
  
  ESSAY("ESSAY"),
  
  HOME("HOME"),
  
  PHOTOGRAPHY("PHOTOGRAPHY"),
  
  LAWS("LAWS"),
  
  MILITARY("MILITARY"),
  
  EMOTION("EMOTION"),
  
  CARS("CARS"),
  
  FINANCE("FINANCE"),
  
  TECHNOLOGY("TECHNOLOGY"),
  
  TRAVEL("TRAVEL"),
  
  WORKPLACE("WORKPLACE"),
  
  REGIMEN("REGIMEN"),
  
  WEIGHT_LOSING("WEIGHT_LOSING"),
  
  CULTURE("CULTURE"),
  
  ESTATE("ESTATE"),
  
  DESIGN("DESIGN"),
  
  STORIES("STORIES"),
  
  GOURMET("GOURMET"),
  
  AMUSEMENT("AMUSEMENT"),
  
  FREAK("FREAK"),
  
  HISTORY("HISTORY"),
  
  DIGITAL("DIGITAL"),
  
  SPORTS("SPORTS"),
  
  RUMOR_CRACKER("RUMOR_CRACKER"),
  
  CONSTELLATION("CONSTELLATION"),
  
  TIPS("TIPS"),
  
  EDUCATION("EDUCATION"),
  
  EXPLORE("EXPLORE"),
  
  SOCIETY("SOCIETY"),
  
  COMICS("COMICS"),
  
  HEALTH("HEALTH"),
  
  LOCAL("LOCAL"),
  
  GAMES("GAMES"),
  
  ENTERTAINMENT("ENTERTAINMENT");

  private String value;

  AdGetV2DataAudienceArticleCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAudienceArticleCategory fromValue(String value) {
    for (AdGetV2DataAudienceArticleCategory b : AdGetV2DataAudienceArticleCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAudienceArticleCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAudienceArticleCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAudienceArticleCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAudienceArticleCategory.fromValue(value);
    }
  }
}

