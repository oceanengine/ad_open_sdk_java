/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
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
@JsonAdapter(PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType.Adapter.class)
public enum PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType {
  
  INFORMATION_FLOW_IMAGE("INFORMATION_FLOW_IMAGE"),
  
  SEARCH_DISPLAY_WINDOW_IMAGE("SEARCH_DISPLAY_WINDOW_IMAGE"),
  
  TOUTIAO_SEARCH_AD_IMAGE("TOUTIAO_SEARCH_AD_IMAGE");

  private String value;

  PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType fromValue(String value) {
    for (PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType b : PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType.fromValue(value);
    }
  }
}
