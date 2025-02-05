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
@JsonAdapter(BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType.Adapter.class)
public enum BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType {
  
  REGION("REGION"),
  
  UNLIMITED("UNLIMITED");

  private String value;

  BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType fromValue(String value) {
    for (BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType b : BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType.fromValue(value);
    }
  }
}

