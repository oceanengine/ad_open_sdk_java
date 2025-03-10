/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility.Adapter.class)
public enum PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility {
  
  ALWAYS_VISIBLE("ALWAYS_VISIBLE"),
  
  HIDE_AFTER_END_DATE("HIDE_AFTER_END_DATE"),
  
  HIDE_AFTER_NO_PLAYBACK("HIDE_AFTER_NO_PLAYBACK"),
  
  HIDE_VIDEO_ON_HP("HIDE_VIDEO_ON_HP");

  private String value;

  PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility fromValue(String value) {
    for (PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility b : PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility.fromValue(value);
    }
  }
}

