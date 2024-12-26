/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(ToolsBidSuggestV2ArticleCategory.Adapter.class)
public enum ToolsBidSuggestV2ArticleCategory {
  
  ESTATE("ESTATE"),
  
  SOCIETY("SOCIETY"),
  
  HISTORY("HISTORY"),
  
  CULTURE("CULTURE"),
  
  SPORTS("SPORTS"),
  
  PARENTING("PARENTING"),
  
  SCIENCE("SCIENCE"),
  
  STORIES("STORIES"),
  
  WORKPLACE("WORKPLACE"),
  
  TECHNOLOGY("TECHNOLOGY"),
  
  COMICS("COMICS"),
  
  EMOTION("EMOTION"),
  
  FREAK("FREAK"),
  
  HEALTH("HEALTH"),
  
  ENTERTAINMENT("ENTERTAINMENT"),
  
  GOURMET("GOURMET"),
  
  GRADUATES("GRADUATES"),
  
  LAWS("LAWS"),
  
  EXPLORE("EXPLORE"),
  
  HOME("HOME"),
  
  PETS("PETS"),
  
  CONSTELLATION("CONSTELLATION"),
  
  EDUCATION("EDUCATION"),
  
  RUMOR_CRACKER("RUMOR_CRACKER"),
  
  PHOTOGRAPHY("PHOTOGRAPHY"),
  
  ESSAY("ESSAY"),
  
  INTERNATIONAL("INTERNATIONAL"),
  
  DESIGN("DESIGN"),
  
  TIPS("TIPS"),
  
  ANIMATION("ANIMATION"),
  
  DIGITAL("DIGITAL"),
  
  COLLECTION("COLLECTION"),
  
  CARS("CARS"),
  
  REGIMEN("REGIMEN"),
  
  TRAVEL("TRAVEL"),
  
  AMUSEMENT("AMUSEMENT"),
  
  LOCAL("LOCAL"),
  
  BUSINESS("BUSINESS"),
  
  FINANCE("FINANCE"),
  
  GOVERNMENT("GOVERNMENT"),
  
  WEIGHT_LOSING("WEIGHT_LOSING"),
  
  GAMES("GAMES"),
  
  FASHION("FASHION"),
  
  MILITARY("MILITARY"),
  
  MOVIE("MOVIE");

  private String value;

  ToolsBidSuggestV2ArticleCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidSuggestV2ArticleCategory fromValue(String value) {
    for (ToolsBidSuggestV2ArticleCategory b : ToolsBidSuggestV2ArticleCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidSuggestV2ArticleCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidSuggestV2ArticleCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidSuggestV2ArticleCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBidSuggestV2ArticleCategory.fromValue(value);
    }
  }
}

