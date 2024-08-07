/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.14
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
  
  BUSINESS("BUSINESS"),
  
  HEALTH("HEALTH"),
  
  EXPLORE("EXPLORE"),
  
  CULTURE("CULTURE"),
  
  MOVIE("MOVIE"),
  
  FASHION("FASHION"),
  
  DIGITAL("DIGITAL"),
  
  EMOTION("EMOTION"),
  
  WORKPLACE("WORKPLACE"),
  
  LAWS("LAWS"),
  
  TRAVEL("TRAVEL"),
  
  GOURMET("GOURMET"),
  
  PETS("PETS"),
  
  CONSTELLATION("CONSTELLATION"),
  
  HOME("HOME"),
  
  ESTATE("ESTATE"),
  
  COMICS("COMICS"),
  
  GRADUATES("GRADUATES"),
  
  SCIENCE("SCIENCE"),
  
  HISTORY("HISTORY"),
  
  SOCIETY("SOCIETY"),
  
  STORIES("STORIES"),
  
  LOCAL("LOCAL"),
  
  FINANCE("FINANCE"),
  
  COLLECTION("COLLECTION"),
  
  DESIGN("DESIGN"),
  
  ANIMATION("ANIMATION"),
  
  CARS("CARS"),
  
  WEIGHT_LOSING("WEIGHT_LOSING"),
  
  ESSAY("ESSAY"),
  
  FREAK("FREAK"),
  
  INTERNATIONAL("INTERNATIONAL"),
  
  PHOTOGRAPHY("PHOTOGRAPHY"),
  
  TIPS("TIPS"),
  
  TECHNOLOGY("TECHNOLOGY"),
  
  GOVERNMENT("GOVERNMENT"),
  
  RUMOR_CRACKER("RUMOR_CRACKER"),
  
  EDUCATION("EDUCATION"),
  
  AMUSEMENT("AMUSEMENT"),
  
  REGIMEN("REGIMEN"),
  
  MILITARY("MILITARY"),
  
  ENTERTAINMENT("ENTERTAINMENT"),
  
  GAMES("GAMES"),
  
  PARENTING("PARENTING"),
  
  SPORTS("SPORTS");

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

