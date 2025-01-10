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
@JsonAdapter(BrandMaterialListV30OrderFilterAppOrigin.Adapter.class)
public enum BrandMaterialListV30OrderFilterAppOrigin {
  
  AWEME("AWEME"),
  
  TOUTIAO("TOUTIAO"),
  
  XIGUA("XIGUA");

  private String value;

  BrandMaterialListV30OrderFilterAppOrigin(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandMaterialListV30OrderFilterAppOrigin fromValue(String value) {
    for (BrandMaterialListV30OrderFilterAppOrigin b : BrandMaterialListV30OrderFilterAppOrigin.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandMaterialListV30OrderFilterAppOrigin> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandMaterialListV30OrderFilterAppOrigin enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandMaterialListV30OrderFilterAppOrigin read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandMaterialListV30OrderFilterAppOrigin.fromValue(value);
    }
  }
}
