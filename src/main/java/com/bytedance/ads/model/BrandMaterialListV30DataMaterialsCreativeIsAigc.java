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
@JsonAdapter(BrandMaterialListV30DataMaterialsCreativeIsAigc.Adapter.class)
public enum BrandMaterialListV30DataMaterialsCreativeIsAigc {
  
  Enum_0("0"),
  
  Enum_1("1");

  private String value;

  BrandMaterialListV30DataMaterialsCreativeIsAigc(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandMaterialListV30DataMaterialsCreativeIsAigc fromValue(String value) {
    for (BrandMaterialListV30DataMaterialsCreativeIsAigc b : BrandMaterialListV30DataMaterialsCreativeIsAigc.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandMaterialListV30DataMaterialsCreativeIsAigc> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandMaterialListV30DataMaterialsCreativeIsAigc enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandMaterialListV30DataMaterialsCreativeIsAigc read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandMaterialListV30DataMaterialsCreativeIsAigc.fromValue(value);
    }
  }
}

