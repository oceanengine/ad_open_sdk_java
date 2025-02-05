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
@JsonAdapter(StarVasCreateBoostItemGroupV2CustomAudienceTagAge.Adapter.class)
public enum StarVasCreateBoostItemGroupV2CustomAudienceTagAge {
  
  Enum_18_TO_23("18_TO_23"),
  
  Enum_24_TO_30("24_TO_30"),
  
  Enum_31_TO_40("31_TO_40"),
  
  Enum_41_TO_50("41_TO_50"),
  
  INFINITE("INFINITE");

  private String value;

  StarVasCreateBoostItemGroupV2CustomAudienceTagAge(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarVasCreateBoostItemGroupV2CustomAudienceTagAge fromValue(String value) {
    for (StarVasCreateBoostItemGroupV2CustomAudienceTagAge b : StarVasCreateBoostItemGroupV2CustomAudienceTagAge.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarVasCreateBoostItemGroupV2CustomAudienceTagAge> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarVasCreateBoostItemGroupV2CustomAudienceTagAge enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarVasCreateBoostItemGroupV2CustomAudienceTagAge read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarVasCreateBoostItemGroupV2CustomAudienceTagAge.fromValue(value);
    }
  }
}

