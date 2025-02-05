/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(BrandToolQueryPublishPriceV30AudienceInfoDistrictInfoCitySelectType.Adapter.class)
public enum BrandToolQueryPublishPriceV30AudienceInfoDistrictInfoCitySelectType {
  
  EXCLUDE("EXCLUDE"),
  
  SELECT("SELECT");

  private String value;

  BrandToolQueryPublishPriceV30AudienceInfoDistrictInfoCitySelectType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandToolQueryPublishPriceV30AudienceInfoDistrictInfoCitySelectType fromValue(String value) {
    for (BrandToolQueryPublishPriceV30AudienceInfoDistrictInfoCitySelectType b : BrandToolQueryPublishPriceV30AudienceInfoDistrictInfoCitySelectType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandToolQueryPublishPriceV30AudienceInfoDistrictInfoCitySelectType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandToolQueryPublishPriceV30AudienceInfoDistrictInfoCitySelectType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandToolQueryPublishPriceV30AudienceInfoDistrictInfoCitySelectType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandToolQueryPublishPriceV30AudienceInfoDistrictInfoCitySelectType.fromValue(value);
    }
  }
}

