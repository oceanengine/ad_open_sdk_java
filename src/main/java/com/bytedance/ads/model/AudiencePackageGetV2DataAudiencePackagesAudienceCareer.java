/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@JsonAdapter(AudiencePackageGetV2DataAudiencePackagesAudienceCareer.Adapter.class)
public enum AudiencePackageGetV2DataAudiencePackagesAudienceCareer {
  
  CIVIL_SERVANTS("CIVIL_SERVANTS"),
  
  COLLEGE_STUDENT("COLLEGE_STUDENT"),
  
  FINANCIAL("FINANCIAL"),
  
  IT("IT"),
  
  MEDICAL_STAFF("MEDICAL_STAFF"),
  
  TEACHER("TEACHER");

  private String value;

  AudiencePackageGetV2DataAudiencePackagesAudienceCareer(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageGetV2DataAudiencePackagesAudienceCareer fromValue(String value) {
    for (AudiencePackageGetV2DataAudiencePackagesAudienceCareer b : AudiencePackageGetV2DataAudiencePackagesAudienceCareer.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudiencePackageGetV2DataAudiencePackagesAudienceCareer> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageGetV2DataAudiencePackagesAudienceCareer enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageGetV2DataAudiencePackagesAudienceCareer read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageGetV2DataAudiencePackagesAudienceCareer.fromValue(value);
    }
  }
}

