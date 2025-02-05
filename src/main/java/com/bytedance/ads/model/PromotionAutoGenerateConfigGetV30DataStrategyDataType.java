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
@JsonAdapter(PromotionAutoGenerateConfigGetV30DataStrategyDataType.Adapter.class)
public enum PromotionAutoGenerateConfigGetV30DataStrategyDataType {
  
  HORIZONTAL2HORIZONTAL("Horizontal2Horizontal"),
  
  HORIZONTAL2VERTICAL("Horizontal2Vertical"),
  
  VERTICAL2HORIZONTAL("Vertical2Horizontal"),
  
  VERTICAL2VERTICAL("Vertical2Vertical");

  private String value;

  PromotionAutoGenerateConfigGetV30DataStrategyDataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionAutoGenerateConfigGetV30DataStrategyDataType fromValue(String value) {
    for (PromotionAutoGenerateConfigGetV30DataStrategyDataType b : PromotionAutoGenerateConfigGetV30DataStrategyDataType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionAutoGenerateConfigGetV30DataStrategyDataType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionAutoGenerateConfigGetV30DataStrategyDataType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionAutoGenerateConfigGetV30DataStrategyDataType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionAutoGenerateConfigGetV30DataStrategyDataType.fromValue(value);
    }
  }
}

