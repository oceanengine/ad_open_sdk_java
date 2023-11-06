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
@JsonAdapter(PromotionRejectReasonGetV30DataListMaterialRejectType.Adapter.class)
public enum PromotionRejectReasonGetV30DataListMaterialRejectType {
  
  ANCHOR("ANCHOR"),
  
  AWEME_NICK_NAME("AWEME_NICK_NAME"),
  
  CALL_TO_ACTION("CALL_TO_ACTION"),
  
  CREATIVE_COMPONENT("CREATIVE_COMPONENT"),
  
  CREATIVE_IMAGE("CREATIVE_IMAGE"),
  
  CREATIVE_TITLE("CREATIVE_TITLE"),
  
  CREATIVE_URL("CREATIVE_URL"),
  
  CREATIVE_VIDEO("CREATIVE_VIDEO"),
  
  OPEN_URL("OPEN_URL"),
  
  PRODUCT_DESCRIBE("PRODUCT_DESCRIBE"),
  
  PRODUCT_IMAGE("PRODUCT_IMAGE"),
  
  PRODUCT_SELLING_POINTS("PRODUCT_SELLING_POINTS");

  private String value;

  PromotionRejectReasonGetV30DataListMaterialRejectType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionRejectReasonGetV30DataListMaterialRejectType fromValue(String value) {
    for (PromotionRejectReasonGetV30DataListMaterialRejectType b : PromotionRejectReasonGetV30DataListMaterialRejectType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionRejectReasonGetV30DataListMaterialRejectType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionRejectReasonGetV30DataListMaterialRejectType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionRejectReasonGetV30DataListMaterialRejectType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionRejectReasonGetV30DataListMaterialRejectType.fromValue(value);
    }
  }
}

