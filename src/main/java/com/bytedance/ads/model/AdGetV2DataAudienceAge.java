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
@JsonAdapter(AdGetV2DataAudienceAge.Adapter.class)
public enum AdGetV2DataAudienceAge {
  
  BETWEEN_31_35("AGE_BETWEEN_31_35"),
  
  ABOVE_50("AGE_ABOVE_50"),
  
  BETWEEN_31_40("AGE_BETWEEN_31_40"),
  
  BETWEEN_46_50("AGE_BETWEEN_46_50"),
  
  BETWEEN_20_23("AGE_BETWEEN_20_23"),
  
  BETWEEN_51_55("AGE_BETWEEN_51_55"),
  
  BETWEEN_56_59("AGE_BETWEEN_56_59"),
  
  BETWEEN_18_23("AGE_BETWEEN_18_23"),
  
  BETWEEN_24_30("AGE_BETWEEN_24_30"),
  
  BETWEEN_18_19("AGE_BETWEEN_18_19"),
  
  ABOVE_60("AGE_ABOVE_60"),
  
  BETWEEN_41_49("AGE_BETWEEN_41_49"),
  
  BELOW_18("AGE_BELOW_18"),
  
  BETWEEN_41_45("AGE_BETWEEN_41_45"),
  
  BETWEEN_36_40("AGE_BETWEEN_36_40");

  private String value;

  AdGetV2DataAudienceAge(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAudienceAge fromValue(String value) {
    for (AdGetV2DataAudienceAge b : AdGetV2DataAudienceAge.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAudienceAge> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAudienceAge enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAudienceAge read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAudienceAge.fromValue(value);
    }
  }
}

