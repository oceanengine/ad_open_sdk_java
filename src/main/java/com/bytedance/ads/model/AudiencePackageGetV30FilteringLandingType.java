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
@JsonAdapter(AudiencePackageGetV30FilteringLandingType.Adapter.class)
public enum AudiencePackageGetV30FilteringLandingType {
  
  APP("APP"),
  
  APP_ANDROID("APP_ANDROID"),
  
  APP_IOS("APP_IOS"),
  
  ARTICLE("ARTICLE"),
  
  AWEME("AWEME"),
  
  DPA("DPA"),
  
  EXTERNAL("EXTERNAL"),
  
  GOODS("GOODS"),
  
  LIVE("LIVE"),
  
  MICRO_GAME("MICRO_GAME"),
  
  QUICK_APP("QUICK_APP"),
  
  SHOP("SHOP"),
  
  STORE("STORE");

  private String value;

  AudiencePackageGetV30FilteringLandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageGetV30FilteringLandingType fromValue(String value) {
    for (AudiencePackageGetV30FilteringLandingType b : AudiencePackageGetV30FilteringLandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageGetV30FilteringLandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageGetV30FilteringLandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageGetV30FilteringLandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageGetV30FilteringLandingType.fromValue(value);
    }
  }
}

