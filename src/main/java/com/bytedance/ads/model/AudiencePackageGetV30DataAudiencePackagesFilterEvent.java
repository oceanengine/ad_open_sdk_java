/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(AudiencePackageGetV30DataAudiencePackagesFilterEvent.Adapter.class)
public enum AudiencePackageGetV30DataAudiencePackagesFilterEvent {
  
  EXTERNAL_ACTION("AD_CONVERT_EXTERNAL_ACTION"),
  
  TYPE_ACTIVE("AD_CONVERT_TYPE_ACTIVE"),
  
  TYPE_ACTIVE_REGISTER("AD_CONVERT_TYPE_ACTIVE_REGISTER"),
  
  TYPE_PAY("AD_CONVERT_TYPE_PAY");

  private String value;

  AudiencePackageGetV30DataAudiencePackagesFilterEvent(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageGetV30DataAudiencePackagesFilterEvent fromValue(String value) {
    for (AudiencePackageGetV30DataAudiencePackagesFilterEvent b : AudiencePackageGetV30DataAudiencePackagesFilterEvent.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudiencePackageGetV30DataAudiencePackagesFilterEvent> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageGetV30DataAudiencePackagesFilterEvent enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageGetV30DataAudiencePackagesFilterEvent read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageGetV30DataAudiencePackagesFilterEvent.fromValue(value);
    }
  }
}

