/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(BrandQueryStockV30AudienceInfoGender.Adapter.class)
public enum BrandQueryStockV30AudienceInfoGender {
  
  FEMALE("FEMALE"),
  
  MALE("MALE"),
  
  UNLIMITED("UNLIMITED");

  private String value;

  BrandQueryStockV30AudienceInfoGender(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandQueryStockV30AudienceInfoGender fromValue(String value) {
    for (BrandQueryStockV30AudienceInfoGender b : BrandQueryStockV30AudienceInfoGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandQueryStockV30AudienceInfoGender> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandQueryStockV30AudienceInfoGender enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandQueryStockV30AudienceInfoGender read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandQueryStockV30AudienceInfoGender.fromValue(value);
    }
  }
}

