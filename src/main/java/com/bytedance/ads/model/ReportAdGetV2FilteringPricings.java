/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(ReportAdGetV2FilteringPricings.Adapter.class)
public enum ReportAdGetV2FilteringPricings {
  
  CPM("PRICING_CPM"),
  
  OCPC("PRICING_OCPC"),
  
  OCPM("PRICING_OCPM"),
  
  CPC("PRICING_CPC"),
  
  CPA("PRICING_CPA"),
  
  ECPC("PRICING_ECPC"),
  
  CPV("PRICING_CPV");

  private String value;

  ReportAdGetV2FilteringPricings(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdGetV2FilteringPricings fromValue(String value) {
    for (ReportAdGetV2FilteringPricings b : ReportAdGetV2FilteringPricings.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdGetV2FilteringPricings> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdGetV2FilteringPricings enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdGetV2FilteringPricings read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdGetV2FilteringPricings.fromValue(value);
    }
  }
}

