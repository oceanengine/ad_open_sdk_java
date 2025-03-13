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
@JsonAdapter(BrandOrderCreateV30AdForm.Adapter.class)
public enum BrandOrderCreateV30AdForm {
  
  CONTENTRECOMMEND("CONTENTRECOMMEND"),
  
  CONTENTRECOMMEND_NO_GRASS("CONTENTRECOMMEND_NO_GRASS"),
  
  CONTENTSERVICE("CONTENTSERVICE"),
  
  CONTENTSERVICE_NO_GRASS("CONTENTSERVICE_NO_GRASS");

  private String value;

  BrandOrderCreateV30AdForm(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandOrderCreateV30AdForm fromValue(String value) {
    for (BrandOrderCreateV30AdForm b : BrandOrderCreateV30AdForm.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandOrderCreateV30AdForm> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandOrderCreateV30AdForm enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandOrderCreateV30AdForm read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandOrderCreateV30AdForm.fromValue(value);
    }
  }
}

