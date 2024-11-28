/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(AudiencePackageGetV30DataAudiencePackagesAge.Adapter.class)
public enum AudiencePackageGetV30DataAudiencePackagesAge {
  
  ABOVE50("ABOVE50"),
  
  BETWEEN18_23("BETWEEN18_23"),
  
  BETWEEN24_30("BETWEEN24_30"),
  
  BETWEEN31_40("BETWEEN31_40"),
  
  BETWEEN41_49("BETWEEN41_49"),
  
  UNLIMITED("UNLIMITED");

  private String value;

  AudiencePackageGetV30DataAudiencePackagesAge(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageGetV30DataAudiencePackagesAge fromValue(String value) {
    for (AudiencePackageGetV30DataAudiencePackagesAge b : AudiencePackageGetV30DataAudiencePackagesAge.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudiencePackageGetV30DataAudiencePackagesAge> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageGetV30DataAudiencePackagesAge enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageGetV30DataAudiencePackagesAge read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageGetV30DataAudiencePackagesAge.fromValue(value);
    }
  }
}

