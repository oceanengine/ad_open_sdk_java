/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.48
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
  
  TECHNOLOGY("TECHNOLOGY"),
  
  MOVIE("MOVIE"),
  
  ANIMATION("ANIMATION"),
  
  STORIES("STORIES"),
  
  FINANCE("FINANCE"),
  
  SPORTS("SPORTS"),
  
  WORKPLACE("WORKPLACE"),
  
  FASHION("FASHION"),
  
  EDUCATION("EDUCATION"),
  
  ENTERTAINMENT("ENTERTAINMENT"),
  
  GOVERNMENT("GOVERNMENT"),
  
  LAWS("LAWS"),
  
  HEALTH("HEALTH"),
  
  GAMES("GAMES"),
  
  REGIMEN("REGIMEN"),
  
  COLLECTION("COLLECTION"),
  
  CULTURE("CULTURE"),
  
  ESTATE("ESTATE"),
  
  TRAVEL("TRAVEL"),
  
  LOCAL("LOCAL"),
  
  EMOTION("EMOTION"),
  
  TIPS("TIPS"),
  
  RUMOR_CRACKER("RUMOR_CRACKER"),
  
  AMUSEMENT("AMUSEMENT"),
  
  EXPLORE("EXPLORE"),
  
  PETS("PETS"),
  
  PHOTOGRAPHY("PHOTOGRAPHY"),
  
  MILITARY("MILITARY"),
  
  HOME("HOME"),
  
  GOURMET("GOURMET"),
  
  BUSINESS("BUSINESS"),
  
  WEIGHT_LOSING("WEIGHT_LOSING"),
  
  PARENTING("PARENTING"),
  
  DESIGN("DESIGN"),
  
  ESSAY("ESSAY"),
  
  CONSTELLATION("CONSTELLATION"),
  
  INTERNATIONAL("INTERNATIONAL"),
  
  COMICS("COMICS"),
  
  SOCIETY("SOCIETY"),
  
  CARS("CARS"),
  
  GRADUATES("GRADUATES"),
  
  HISTORY("HISTORY"),
  
  FREAK("FREAK"),
  
  DIGITAL("DIGITAL"),
  
  SCIENCE("SCIENCE");

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

