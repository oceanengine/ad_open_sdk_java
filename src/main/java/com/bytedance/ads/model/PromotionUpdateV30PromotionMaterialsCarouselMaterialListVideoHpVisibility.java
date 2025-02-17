/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(PromotionUpdateV30PromotionMaterialsCarouselMaterialListVideoHpVisibility.Adapter.class)
public enum PromotionUpdateV30PromotionMaterialsCarouselMaterialListVideoHpVisibility {
  
  ALWAYS_VISIBLE("ALWAYS_VISIBLE"),
  
  HIDE_VIDEO_ON_HP("HIDE_VIDEO_ON_HP");

  private String value;

  PromotionUpdateV30PromotionMaterialsCarouselMaterialListVideoHpVisibility(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionUpdateV30PromotionMaterialsCarouselMaterialListVideoHpVisibility fromValue(String value) {
    for (PromotionUpdateV30PromotionMaterialsCarouselMaterialListVideoHpVisibility b : PromotionUpdateV30PromotionMaterialsCarouselMaterialListVideoHpVisibility.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionUpdateV30PromotionMaterialsCarouselMaterialListVideoHpVisibility> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionUpdateV30PromotionMaterialsCarouselMaterialListVideoHpVisibility enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionUpdateV30PromotionMaterialsCarouselMaterialListVideoHpVisibility read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionUpdateV30PromotionMaterialsCarouselMaterialListVideoHpVisibility.fromValue(value);
    }
  }
}

