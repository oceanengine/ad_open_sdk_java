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
@JsonAdapter(BrandMaterialListV30OrderFilterProType.Adapter.class)
public enum BrandMaterialListV30OrderFilterProType {
  
  FEED("FEED"),
  
  MALL("MALL"),
  
  PLANT_GRASS("PLANT_GRASS"),
  
  SEARCH("SEARCH"),
  
  SPLASH("SPLASH");

  private String value;

  BrandMaterialListV30OrderFilterProType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandMaterialListV30OrderFilterProType fromValue(String value) {
    for (BrandMaterialListV30OrderFilterProType b : BrandMaterialListV30OrderFilterProType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandMaterialListV30OrderFilterProType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandMaterialListV30OrderFilterProType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandMaterialListV30OrderFilterProType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandMaterialListV30OrderFilterProType.fromValue(value);
    }
  }
}

