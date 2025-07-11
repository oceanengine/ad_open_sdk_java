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
@JsonAdapter(BrandCreativeGetV30CreativeStatus.Adapter.class)
public enum BrandCreativeGetV30CreativeStatus {
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_4(4l),
  
  NUMBER_41(41l),
  
  NUMBER_0(0l);

  private Long value;

  BrandCreativeGetV30CreativeStatus(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandCreativeGetV30CreativeStatus fromValue(Long value) {
    for (BrandCreativeGetV30CreativeStatus b : BrandCreativeGetV30CreativeStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandCreativeGetV30CreativeStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandCreativeGetV30CreativeStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandCreativeGetV30CreativeStatus read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return BrandCreativeGetV30CreativeStatus.fromValue(value);
    }
  }
}

