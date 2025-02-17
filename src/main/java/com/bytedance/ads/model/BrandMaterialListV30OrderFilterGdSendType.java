/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(BrandMaterialListV30OrderFilterGdSendType.Adapter.class)
public enum BrandMaterialListV30OrderFilterGdSendType {
  
  CPV("CPV"),
  
  CPV_EFFECTIVE("CPV_EFFECTIVE"),
  
  CTR("CTR"),
  
  CVR("CVR"),
  
  FANS_INCR("FANS_INCR"),
  
  FORM("FORM"),
  
  HOISTING("HOISTING"),
  
  INTERACTIVE("INTERACTIVE"),
  
  LIVE_INTERACTIVE("LIVE_INTERACTIVE"),
  
  LIVE_ROOM("LIVE_ROOM"),
  
  LIVE_WATICH("LIVE_WATICH"),
  
  PLANT_GRASS("PLANT_GRASS"),
  
  REACH("REACH"),
  
  SEQUENCE("SEQUENCE"),
  
  STRIDE_PLANT_GRASS("STRIDE_PLANT_GRASS");

  private String value;

  BrandMaterialListV30OrderFilterGdSendType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandMaterialListV30OrderFilterGdSendType fromValue(String value) {
    for (BrandMaterialListV30OrderFilterGdSendType b : BrandMaterialListV30OrderFilterGdSendType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandMaterialListV30OrderFilterGdSendType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandMaterialListV30OrderFilterGdSendType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandMaterialListV30OrderFilterGdSendType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandMaterialListV30OrderFilterGdSendType.fromValue(value);
    }
  }
}

