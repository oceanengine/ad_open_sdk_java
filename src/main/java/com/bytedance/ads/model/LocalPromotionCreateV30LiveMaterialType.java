/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(LocalPromotionCreateV30LiveMaterialType.Adapter.class)
public enum LocalPromotionCreateV30LiveMaterialType {
  
  LIVE("LIVE"),
  
  VIDEO("VIDEO");

  private String value;

  LocalPromotionCreateV30LiveMaterialType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalPromotionCreateV30LiveMaterialType fromValue(String value) {
    for (LocalPromotionCreateV30LiveMaterialType b : LocalPromotionCreateV30LiveMaterialType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalPromotionCreateV30LiveMaterialType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalPromotionCreateV30LiveMaterialType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalPromotionCreateV30LiveMaterialType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalPromotionCreateV30LiveMaterialType.fromValue(value);
    }
  }
}

