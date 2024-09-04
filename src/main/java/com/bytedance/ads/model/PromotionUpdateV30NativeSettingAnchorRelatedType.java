/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@JsonAdapter(PromotionUpdateV30NativeSettingAnchorRelatedType.Adapter.class)
public enum PromotionUpdateV30NativeSettingAnchorRelatedType {
  
  AUTO("AUTO"),
  
  OFF("OFF"),
  
  SELECT("SELECT");

  private String value;

  PromotionUpdateV30NativeSettingAnchorRelatedType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionUpdateV30NativeSettingAnchorRelatedType fromValue(String value) {
    for (PromotionUpdateV30NativeSettingAnchorRelatedType b : PromotionUpdateV30NativeSettingAnchorRelatedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionUpdateV30NativeSettingAnchorRelatedType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionUpdateV30NativeSettingAnchorRelatedType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionUpdateV30NativeSettingAnchorRelatedType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionUpdateV30NativeSettingAnchorRelatedType.fromValue(value);
    }
  }
}

