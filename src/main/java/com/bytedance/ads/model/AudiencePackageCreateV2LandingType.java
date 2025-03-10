/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(AudiencePackageCreateV2LandingType.Adapter.class)
public enum AudiencePackageCreateV2LandingType {
  
  SHOP("SHOP"),
  
  EXTERNAL("EXTERNAL"),
  
  APP_ANDROID("APP_ANDROID"),
  
  DPA("DPA"),
  
  AWEME("AWEME"),
  
  LIVE("LIVE"),
  
  ARTICLE("ARTICLE"),
  
  MICRO_GAME("MICRO_GAME"),
  
  APP_IOS("APP_IOS"),
  
  STORE("STORE"),
  
  QUICK_APP("QUICK_APP"),
  
  GOODS("GOODS");

  private String value;

  AudiencePackageCreateV2LandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageCreateV2LandingType fromValue(String value) {
    for (AudiencePackageCreateV2LandingType b : AudiencePackageCreateV2LandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageCreateV2LandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageCreateV2LandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageCreateV2LandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageCreateV2LandingType.fromValue(value);
    }
  }
}

