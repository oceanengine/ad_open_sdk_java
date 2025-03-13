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
@JsonAdapter(PromotionUpdateV30PromotionMaterialsAdvancedDcSettings.Adapter.class)
public enum PromotionUpdateV30PromotionMaterialsAdvancedDcSettings {
  
  LANDING_PAGE("OPTIMIZE_LANDING_PAGE"),
  
  SEARCH_RESULTS_PAGE("OPTIMIZE_SEARCH_RESULTS_PAGE");

  private String value;

  PromotionUpdateV30PromotionMaterialsAdvancedDcSettings(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionUpdateV30PromotionMaterialsAdvancedDcSettings fromValue(String value) {
    for (PromotionUpdateV30PromotionMaterialsAdvancedDcSettings b : PromotionUpdateV30PromotionMaterialsAdvancedDcSettings.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionUpdateV30PromotionMaterialsAdvancedDcSettings> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionUpdateV30PromotionMaterialsAdvancedDcSettings enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionUpdateV30PromotionMaterialsAdvancedDcSettings read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionUpdateV30PromotionMaterialsAdvancedDcSettings.fromValue(value);
    }
  }
}

