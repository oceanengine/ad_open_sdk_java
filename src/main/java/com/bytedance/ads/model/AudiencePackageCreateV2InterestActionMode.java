/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(AudiencePackageCreateV2InterestActionMode.Adapter.class)
public enum AudiencePackageCreateV2InterestActionMode {
  
  CUSTOM("CUSTOM"),
  
  UNLIMITED("UNLIMITED"),
  
  RECOMMEND("RECOMMEND");

  private String value;

  AudiencePackageCreateV2InterestActionMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageCreateV2InterestActionMode fromValue(String value) {
    for (AudiencePackageCreateV2InterestActionMode b : AudiencePackageCreateV2InterestActionMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageCreateV2InterestActionMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageCreateV2InterestActionMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageCreateV2InterestActionMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageCreateV2InterestActionMode.fromValue(value);
    }
  }
}

