/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(CreativeGetV2FilteringPricing.Adapter.class)
public enum CreativeGetV2FilteringPricing {
  
  CPA("PRICING_CPA"),
  
  CPC("PRICING_CPC"),
  
  CPC_OCPM("PRICING_CPC_OCPM"),
  
  CPM("PRICING_CPM"),
  
  CPV("PRICING_CPV"),
  
  OCPC("PRICING_OCPC"),
  
  OCPM("PRICING_OCPM");

  private String value;

  CreativeGetV2FilteringPricing(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeGetV2FilteringPricing fromValue(String value) {
    for (CreativeGetV2FilteringPricing b : CreativeGetV2FilteringPricing.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeGetV2FilteringPricing> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeGetV2FilteringPricing enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeGetV2FilteringPricing read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeGetV2FilteringPricing.fromValue(value);
    }
  }
}

