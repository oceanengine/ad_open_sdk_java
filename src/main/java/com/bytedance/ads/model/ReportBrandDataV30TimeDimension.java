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
@JsonAdapter(ReportBrandDataV30TimeDimension.Adapter.class)
public enum ReportBrandDataV30TimeDimension {
  
  DAY("DAY"),
  
  MONTH("MONTH"),
  
  WEEK("WEEK");

  private String value;

  ReportBrandDataV30TimeDimension(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportBrandDataV30TimeDimension fromValue(String value) {
    for (ReportBrandDataV30TimeDimension b : ReportBrandDataV30TimeDimension.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportBrandDataV30TimeDimension> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportBrandDataV30TimeDimension enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportBrandDataV30TimeDimension read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportBrandDataV30TimeDimension.fromValue(value);
    }
  }
}

