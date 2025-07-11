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
@JsonAdapter(EnterpriseOverviewDataGetV10TimeDimension.Adapter.class)
public enum EnterpriseOverviewDataGetV10TimeDimension {
  
  DAILY("DAILY"),
  
  SUM("SUM");

  private String value;

  EnterpriseOverviewDataGetV10TimeDimension(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnterpriseOverviewDataGetV10TimeDimension fromValue(String value) {
    for (EnterpriseOverviewDataGetV10TimeDimension b : EnterpriseOverviewDataGetV10TimeDimension.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnterpriseOverviewDataGetV10TimeDimension> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnterpriseOverviewDataGetV10TimeDimension enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnterpriseOverviewDataGetV10TimeDimension read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnterpriseOverviewDataGetV10TimeDimension.fromValue(value);
    }
  }
}

