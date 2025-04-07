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
@JsonAdapter(AudiencePackageCreateV2Gender.Adapter.class)
public enum AudiencePackageCreateV2Gender {
  
  GENDER_UNLIMITED("GENDER_UNLIMITED"),
  
  GENDER_FEMALE("GENDER_FEMALE"),
  
  NONE("NONE"),
  
  GENDER_MALE("GENDER_MALE");

  private String value;

  AudiencePackageCreateV2Gender(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageCreateV2Gender fromValue(String value) {
    for (AudiencePackageCreateV2Gender b : AudiencePackageCreateV2Gender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageCreateV2Gender> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageCreateV2Gender enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageCreateV2Gender read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageCreateV2Gender.fromValue(value);
    }
  }
}

