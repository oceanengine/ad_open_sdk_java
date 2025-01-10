/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.33
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
@JsonAdapter(PromotionListV30DataListPromotionRelatedProductAnchorMaterialListAnchorType.Adapter.class)
public enum PromotionListV30DataListPromotionRelatedProductAnchorMaterialListAnchorType {
  
  APP_GAME("APP_GAME"),
  
  APP_INTERNET_SERVICE("APP_INTERNET_SERVICE"),
  
  APP_SHOP("APP_SHOP"),
  
  INSURANCE("INSURANCE"),
  
  MICRO_APP("MICRO_APP"),
  
  MICRO_GAME("MICRO_GAME"),
  
  ONLINE_SUBSCRIBE("ONLINE_SUBSCRIBE"),
  
  PRIVATE_CHAT("PRIVATE_CHAT"),
  
  SHOPPING_CART("SHOPPING_CART");

  private String value;

  PromotionListV30DataListPromotionRelatedProductAnchorMaterialListAnchorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30DataListPromotionRelatedProductAnchorMaterialListAnchorType fromValue(String value) {
    for (PromotionListV30DataListPromotionRelatedProductAnchorMaterialListAnchorType b : PromotionListV30DataListPromotionRelatedProductAnchorMaterialListAnchorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionListV30DataListPromotionRelatedProductAnchorMaterialListAnchorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30DataListPromotionRelatedProductAnchorMaterialListAnchorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30DataListPromotionRelatedProductAnchorMaterialListAnchorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30DataListPromotionRelatedProductAnchorMaterialListAnchorType.fromValue(value);
    }
  }
}
