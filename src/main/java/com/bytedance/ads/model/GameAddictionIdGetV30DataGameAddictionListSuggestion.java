/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(GameAddictionIdGetV30DataGameAddictionListSuggestion.Adapter.class)
public enum GameAddictionIdGetV30DataGameAddictionListSuggestion {
  
  ACTIVATION_LOW_BEHAVIOR_HIGH("ACTIVATION_LOW_BEHAVIOR_HIGH"),
  
  ACTIVATION_LOW_BEHAVIOR_LOW("ACTIVATION_LOW_BEHAVIOR_LOW"),
  
  BEHAVIOR_ACTIVATION_LOW("BEHAVIOR_ACTIVATION_LOW"),
  
  NORMAL("NORMAL"),
  
  NOT_PRE_STANDARD("NOT_PRE_STANDARD"),
  
  PAYMENT_ACTION_HIGH("PAYMENT_ACTION_HIGH"),
  
  PAYMENT_ACTION_LOW("PAYMENT_ACTION_LOW");

  private String value;

  GameAddictionIdGetV30DataGameAddictionListSuggestion(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GameAddictionIdGetV30DataGameAddictionListSuggestion fromValue(String value) {
    for (GameAddictionIdGetV30DataGameAddictionListSuggestion b : GameAddictionIdGetV30DataGameAddictionListSuggestion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<GameAddictionIdGetV30DataGameAddictionListSuggestion> {
    @Override
    public void write(final JsonWriter jsonWriter, final GameAddictionIdGetV30DataGameAddictionListSuggestion enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GameAddictionIdGetV30DataGameAddictionListSuggestion read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GameAddictionIdGetV30DataGameAddictionListSuggestion.fromValue(value);
    }
  }
}

