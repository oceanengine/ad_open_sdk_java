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
@JsonAdapter(BrandPolicyListV30AudienceInfoDistrictInfoDistrictType.Adapter.class)
public enum BrandPolicyListV30AudienceInfoDistrictInfoDistrictType {
  
  REGION("REGION"),
  
  UNLIMITED("UNLIMITED");

  private String value;

  BrandPolicyListV30AudienceInfoDistrictInfoDistrictType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandPolicyListV30AudienceInfoDistrictInfoDistrictType fromValue(String value) {
    for (BrandPolicyListV30AudienceInfoDistrictInfoDistrictType b : BrandPolicyListV30AudienceInfoDistrictInfoDistrictType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandPolicyListV30AudienceInfoDistrictInfoDistrictType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandPolicyListV30AudienceInfoDistrictInfoDistrictType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandPolicyListV30AudienceInfoDistrictInfoDistrictType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandPolicyListV30AudienceInfoDistrictInfoDistrictType.fromValue(value);
    }
  }
}

