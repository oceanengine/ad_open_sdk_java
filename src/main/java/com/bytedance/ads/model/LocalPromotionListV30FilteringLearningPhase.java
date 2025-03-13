/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(LocalPromotionListV30FilteringLearningPhase.Adapter.class)
public enum LocalPromotionListV30FilteringLearningPhase {
  
  ALL("ALL"),
  
  LEARNED("LEARNED"),
  
  LEARNING("LEARNING"),
  
  LEARN_FAILED("LEARN_FAILED");

  private String value;

  LocalPromotionListV30FilteringLearningPhase(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalPromotionListV30FilteringLearningPhase fromValue(String value) {
    for (LocalPromotionListV30FilteringLearningPhase b : LocalPromotionListV30FilteringLearningPhase.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalPromotionListV30FilteringLearningPhase> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalPromotionListV30FilteringLearningPhase enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalPromotionListV30FilteringLearningPhase read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalPromotionListV30FilteringLearningPhase.fromValue(value);
    }
  }
}

