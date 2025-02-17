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
@JsonAdapter(BrandOrderListV30DataOrdersAudienceInfoAges.Adapter.class)
public enum BrandOrderListV30DataOrdersAudienceInfoAges {
  
  ABOVE50("ABOVE50"),
  
  BETWEEN18_23("BETWEEN18_23"),
  
  BETWEEN24_30("BETWEEN24_30"),
  
  BETWEEN31_40("BETWEEN31_40"),
  
  BETWEEN41_49("BETWEEN41_49");

  private String value;

  BrandOrderListV30DataOrdersAudienceInfoAges(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandOrderListV30DataOrdersAudienceInfoAges fromValue(String value) {
    for (BrandOrderListV30DataOrdersAudienceInfoAges b : BrandOrderListV30DataOrdersAudienceInfoAges.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandOrderListV30DataOrdersAudienceInfoAges> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandOrderListV30DataOrdersAudienceInfoAges enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandOrderListV30DataOrdersAudienceInfoAges read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandOrderListV30DataOrdersAudienceInfoAges.fromValue(value);
    }
  }
}

