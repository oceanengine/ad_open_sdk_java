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
@JsonAdapter(LocalPromotionUpdateV30VideoHpVisibility.Adapter.class)
public enum LocalPromotionUpdateV30VideoHpVisibility {
  
  ALWAYS_VISIBLE("ALWAYS_VISIBLE"),
  
  HIDE_VIDEO_ON_HP("HIDE_VIDEO_ON_HP");

  private String value;

  LocalPromotionUpdateV30VideoHpVisibility(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalPromotionUpdateV30VideoHpVisibility fromValue(String value) {
    for (LocalPromotionUpdateV30VideoHpVisibility b : LocalPromotionUpdateV30VideoHpVisibility.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalPromotionUpdateV30VideoHpVisibility> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalPromotionUpdateV30VideoHpVisibility enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalPromotionUpdateV30VideoHpVisibility read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalPromotionUpdateV30VideoHpVisibility.fromValue(value);
    }
  }
}

