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
@JsonAdapter(BrandAdCreateV30AudienceInfoRetargetingInfoRetargetingType.Adapter.class)
public enum BrandAdCreateV30AudienceInfoRetargetingInfoRetargetingType {
  
  ECOMMERCE("ECOMMERCE"),
  
  EXCLUDE("EXCLUDE"),
  
  INCLUDE("INCLUDE"),
  
  UNLIMITED("UNLIMITED");

  private String value;

  BrandAdCreateV30AudienceInfoRetargetingInfoRetargetingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandAdCreateV30AudienceInfoRetargetingInfoRetargetingType fromValue(String value) {
    for (BrandAdCreateV30AudienceInfoRetargetingInfoRetargetingType b : BrandAdCreateV30AudienceInfoRetargetingInfoRetargetingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandAdCreateV30AudienceInfoRetargetingInfoRetargetingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandAdCreateV30AudienceInfoRetargetingInfoRetargetingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandAdCreateV30AudienceInfoRetargetingInfoRetargetingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandAdCreateV30AudienceInfoRetargetingInfoRetargetingType.fromValue(value);
    }
  }
}

