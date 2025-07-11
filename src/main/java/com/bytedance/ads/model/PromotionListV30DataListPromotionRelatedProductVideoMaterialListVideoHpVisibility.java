/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
@JsonAdapter(PromotionListV30DataListPromotionRelatedProductVideoMaterialListVideoHpVisibility.Adapter.class)
public enum PromotionListV30DataListPromotionRelatedProductVideoMaterialListVideoHpVisibility {
  
  ALWAYS_VISIBLE("ALWAYS_VISIBLE"),
  
  HIDE_AFTER_END_DATE("HIDE_AFTER_END_DATE"),
  
  HIDE_AFTER_NO_PLAYBACK("HIDE_AFTER_NO_PLAYBACK"),
  
  HIDE_VIDEO_ON_HP("HIDE_VIDEO_ON_HP");

  private String value;

  PromotionListV30DataListPromotionRelatedProductVideoMaterialListVideoHpVisibility(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30DataListPromotionRelatedProductVideoMaterialListVideoHpVisibility fromValue(String value) {
    for (PromotionListV30DataListPromotionRelatedProductVideoMaterialListVideoHpVisibility b : PromotionListV30DataListPromotionRelatedProductVideoMaterialListVideoHpVisibility.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionListV30DataListPromotionRelatedProductVideoMaterialListVideoHpVisibility> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30DataListPromotionRelatedProductVideoMaterialListVideoHpVisibility enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30DataListPromotionRelatedProductVideoMaterialListVideoHpVisibility read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30DataListPromotionRelatedProductVideoMaterialListVideoHpVisibility.fromValue(value);
    }
  }
}

