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
@JsonAdapter(AudiencePackageGetV30DataAudiencePackagesGender.Adapter.class)
public enum AudiencePackageGetV30DataAudiencePackagesGender {
  
  FEMALE("GENDER_FEMALE"),
  
  MALE("GENDER_MALE"),
  
  UNLIMITED("GENDER_UNLIMITED");

  private String value;

  AudiencePackageGetV30DataAudiencePackagesGender(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageGetV30DataAudiencePackagesGender fromValue(String value) {
    for (AudiencePackageGetV30DataAudiencePackagesGender b : AudiencePackageGetV30DataAudiencePackagesGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudiencePackageGetV30DataAudiencePackagesGender> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageGetV30DataAudiencePackagesGender enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageGetV30DataAudiencePackagesGender read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageGetV30DataAudiencePackagesGender.fromValue(value);
    }
  }
}

