/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
@JsonAdapter(ReportCreativeGetV2FilteringPricingCategories.Adapter.class)
public enum ReportCreativeGetV2FilteringPricingCategories {
  
  BRAND_AND_PRICING("PRICING_CATEGORY_BRAND_AND_PRICING"),
  
  BRAND("PRICING_CATEGORY_BRAND"),
  
  BID("PRICING_CATEGORY_BID"),
  
  FREE("PRICING_CATEGORY_FREE"),
  
  NOC("PRICING_CATEGORY_NOC");

  private String value;

  ReportCreativeGetV2FilteringPricingCategories(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2FilteringPricingCategories fromValue(String value) {
    for (ReportCreativeGetV2FilteringPricingCategories b : ReportCreativeGetV2FilteringPricingCategories.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2FilteringPricingCategories> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2FilteringPricingCategories enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2FilteringPricingCategories read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2FilteringPricingCategories.fromValue(value);
    }
  }
}

