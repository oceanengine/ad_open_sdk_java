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
@JsonAdapter(PromotionCreateV30PromotionMaterialsBlueFlowMaterialRecommend.Adapter.class)
public enum PromotionCreateV30PromotionMaterialsBlueFlowMaterialRecommend {
  
  OFF("OFF"),
  
  ON("ON");

  private String value;

  PromotionCreateV30PromotionMaterialsBlueFlowMaterialRecommend(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionCreateV30PromotionMaterialsBlueFlowMaterialRecommend fromValue(String value) {
    for (PromotionCreateV30PromotionMaterialsBlueFlowMaterialRecommend b : PromotionCreateV30PromotionMaterialsBlueFlowMaterialRecommend.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionCreateV30PromotionMaterialsBlueFlowMaterialRecommend> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionCreateV30PromotionMaterialsBlueFlowMaterialRecommend enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionCreateV30PromotionMaterialsBlueFlowMaterialRecommend read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionCreateV30PromotionMaterialsBlueFlowMaterialRecommend.fromValue(value);
    }
  }
}

