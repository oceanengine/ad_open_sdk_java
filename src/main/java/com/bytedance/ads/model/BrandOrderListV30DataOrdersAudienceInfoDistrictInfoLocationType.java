/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType.Adapter.class)
public enum BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType {
  
  ALL_LOCATION("ALL_LOCATION"),
  
  CURRENT("CURRENT"),
  
  HOME("HOME"),
  
  TRAVEL("TRAVEL");

  private String value;

  BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType fromValue(String value) {
    for (BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType b : BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType.fromValue(value);
    }
  }
}

