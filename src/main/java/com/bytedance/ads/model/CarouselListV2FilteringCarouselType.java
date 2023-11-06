/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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
@JsonAdapter(CarouselListV2FilteringCarouselType.Adapter.class)
public enum CarouselListV2FilteringCarouselType {
  
  INFORMATION_FLOW_IMAGE("INFORMATION_FLOW_IMAGE"),
  
  SEARCH_DISPLAY_WINDOW_IMAGE("SEARCH_DISPLAY_WINDOW_IMAGE"),
  
  TOUTIAO_SEARCH_AD_IMAGE("TOUTIAO_SEARCH_AD_IMAGE");

  private String value;

  CarouselListV2FilteringCarouselType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CarouselListV2FilteringCarouselType fromValue(String value) {
    for (CarouselListV2FilteringCarouselType b : CarouselListV2FilteringCarouselType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CarouselListV2FilteringCarouselType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CarouselListV2FilteringCarouselType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CarouselListV2FilteringCarouselType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CarouselListV2FilteringCarouselType.fromValue(value);
    }
  }
}

