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
@JsonAdapter(AudiencePackageGetV2DataAudiencePackagesAudienceActivateType.Adapter.class)
public enum AudiencePackageGetV2DataAudiencePackagesAudienceActivateType {
  
  ONE_MONTH_2_THREE_MONTH("ONE_MONTH_2_THREE_MONTH"),
  
  THREE_MONTH_EAILIER("THREE_MONTH_EAILIER"),
  
  UNLIMITED("UNLIMITED"),
  
  WITH_IN_A_MONTH("WITH_IN_A_MONTH");

  private String value;

  AudiencePackageGetV2DataAudiencePackagesAudienceActivateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageGetV2DataAudiencePackagesAudienceActivateType fromValue(String value) {
    for (AudiencePackageGetV2DataAudiencePackagesAudienceActivateType b : AudiencePackageGetV2DataAudiencePackagesAudienceActivateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudiencePackageGetV2DataAudiencePackagesAudienceActivateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageGetV2DataAudiencePackagesAudienceActivateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageGetV2DataAudiencePackagesAudienceActivateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageGetV2DataAudiencePackagesAudienceActivateType.fromValue(value);
    }
  }
}

