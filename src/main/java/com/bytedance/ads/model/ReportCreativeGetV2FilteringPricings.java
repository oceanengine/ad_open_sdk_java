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
@JsonAdapter(ReportCreativeGetV2FilteringPricings.Adapter.class)
public enum ReportCreativeGetV2FilteringPricings {
  
  CPA("PRICING_CPA"),
  
  OCPC("PRICING_OCPC"),
  
  CPM("PRICING_CPM"),
  
  ECPC("PRICING_ECPC"),
  
  CPV("PRICING_CPV"),
  
  OCPM("PRICING_OCPM"),
  
  CPC("PRICING_CPC");

  private String value;

  ReportCreativeGetV2FilteringPricings(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2FilteringPricings fromValue(String value) {
    for (ReportCreativeGetV2FilteringPricings b : ReportCreativeGetV2FilteringPricings.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2FilteringPricings> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2FilteringPricings enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2FilteringPricings read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2FilteringPricings.fromValue(value);
    }
  }
}

