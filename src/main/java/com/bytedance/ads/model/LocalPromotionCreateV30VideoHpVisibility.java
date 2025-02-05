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
@JsonAdapter(LocalPromotionCreateV30VideoHpVisibility.Adapter.class)
public enum LocalPromotionCreateV30VideoHpVisibility {
  
  ALWAYS_VISIBLE("ALWAYS_VISIBLE"),
  
  HIDE_VIDEO_ON_HP("HIDE_VIDEO_ON_HP");

  private String value;

  LocalPromotionCreateV30VideoHpVisibility(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalPromotionCreateV30VideoHpVisibility fromValue(String value) {
    for (LocalPromotionCreateV30VideoHpVisibility b : LocalPromotionCreateV30VideoHpVisibility.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalPromotionCreateV30VideoHpVisibility> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalPromotionCreateV30VideoHpVisibility enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalPromotionCreateV30VideoHpVisibility read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalPromotionCreateV30VideoHpVisibility.fromValue(value);
    }
  }
}

