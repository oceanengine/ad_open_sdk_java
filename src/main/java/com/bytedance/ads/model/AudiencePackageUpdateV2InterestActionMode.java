/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
@JsonAdapter(AudiencePackageUpdateV2InterestActionMode.Adapter.class)
public enum AudiencePackageUpdateV2InterestActionMode {
  
  RECOMMEND("RECOMMEND"),
  
  UNLIMITED("UNLIMITED"),
  
  CUSTOM("CUSTOM");

  private String value;

  AudiencePackageUpdateV2InterestActionMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageUpdateV2InterestActionMode fromValue(String value) {
    for (AudiencePackageUpdateV2InterestActionMode b : AudiencePackageUpdateV2InterestActionMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageUpdateV2InterestActionMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageUpdateV2InterestActionMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageUpdateV2InterestActionMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageUpdateV2InterestActionMode.fromValue(value);
    }
  }
}

