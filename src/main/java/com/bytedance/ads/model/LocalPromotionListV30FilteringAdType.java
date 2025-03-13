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
@JsonAdapter(LocalPromotionListV30FilteringAdType.Adapter.class)
public enum LocalPromotionListV30FilteringAdType {
  
  ALL("ALL"),
  
  GENERAL("GENERAL"),
  
  SEARCHING("SEARCHING");

  private String value;

  LocalPromotionListV30FilteringAdType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalPromotionListV30FilteringAdType fromValue(String value) {
    for (LocalPromotionListV30FilteringAdType b : LocalPromotionListV30FilteringAdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalPromotionListV30FilteringAdType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalPromotionListV30FilteringAdType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalPromotionListV30FilteringAdType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalPromotionListV30FilteringAdType.fromValue(value);
    }
  }
}

