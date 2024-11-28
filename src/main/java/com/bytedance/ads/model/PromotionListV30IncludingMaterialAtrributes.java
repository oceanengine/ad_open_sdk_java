/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(PromotionListV30IncludingMaterialAtrributes.Adapter.class)
public enum PromotionListV30IncludingMaterialAtrributes {
  
  RETURN_CARRY_DATA("RETURN_CARRY_DATA");

  private String value;

  PromotionListV30IncludingMaterialAtrributes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30IncludingMaterialAtrributes fromValue(String value) {
    for (PromotionListV30IncludingMaterialAtrributes b : PromotionListV30IncludingMaterialAtrributes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionListV30IncludingMaterialAtrributes> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30IncludingMaterialAtrributes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30IncludingMaterialAtrributes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30IncludingMaterialAtrributes.fromValue(value);
    }
  }
}

