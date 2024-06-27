/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(ReportCreativeGetV2FilteringImageModes.Adapter.class)
public enum ReportCreativeGetV2FilteringImageModes {
  
  SEARCH_AD_SMALL_IMAGE("SEARCH_AD_SMALL_IMAGE"),
  
  CREATIVE_IMAGE_MODE_LARGE_VERTICAL("CREATIVE_IMAGE_MODE_LARGE_VERTICAL"),
  
  CREATIVE_IMAGE_MODE_DISPLAY_WINDOW("CREATIVE_IMAGE_MODE_DISPLAY_WINDOW"),
  
  CREATIVE_IMAGE_MODE_LARGE("CREATIVE_IMAGE_MODE_LARGE"),
  
  CREATIVE_IMAGE_MODE_VIDEO("CREATIVE_IMAGE_MODE_VIDEO"),
  
  CREATIVE_IMAGE_MODE_GROUP("CREATIVE_IMAGE_MODE_GROUP"),
  
  TOUTIAO_SEARCH_AD_IMAGE("TOUTIAO_SEARCH_AD_IMAGE"),
  
  CREATIVE_IMAGE_MODE_DECORATION_COUPON("CREATIVE_IMAGE_MODE_DECORATION_COUPON"),
  
  CREATIVE_IMAGE_MODE_SMALL("CREATIVE_IMAGE_MODE_SMALL"),
  
  CREATIVE_IMAGE_MODE_UNION_SPLASH_VIDEO("CREATIVE_IMAGE_MODE_UNION_SPLASH_VIDEO"),
  
  CREATIVE_IMAGE_MODE_UNION_SPLASH("CREATIVE_IMAGE_MODE_UNION_SPLASH"),
  
  CREATIVE_IMAGE_MODE_GIF("CREATIVE_IMAGE_MODE_GIF"),
  
  CREATIVE_IMAGE_MODE_AWEME_LIVE("CREATIVE_IMAGE_MODE_AWEME_LIVE"),
  
  CREATIVE_IMAGE_MODE_VIDEO_VERTICAL("CREATIVE_IMAGE_MODE_VIDEO_VERTICAL");

  private String value;

  ReportCreativeGetV2FilteringImageModes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2FilteringImageModes fromValue(String value) {
    for (ReportCreativeGetV2FilteringImageModes b : ReportCreativeGetV2FilteringImageModes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2FilteringImageModes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2FilteringImageModes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2FilteringImageModes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2FilteringImageModes.fromValue(value);
    }
  }
}

