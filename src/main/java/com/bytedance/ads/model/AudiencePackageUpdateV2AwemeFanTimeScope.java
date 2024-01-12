/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
@JsonAdapter(AudiencePackageUpdateV2AwemeFanTimeScope.Adapter.class)
public enum AudiencePackageUpdateV2AwemeFanTimeScope {
  
  FIFTEEN_DAYS("FIFTEEN_DAYS"),
  
  THIRTY_DAYS("THIRTY_DAYS"),
  
  SIXTY_DAYS("SIXTY_DAYS");

  private String value;

  AudiencePackageUpdateV2AwemeFanTimeScope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageUpdateV2AwemeFanTimeScope fromValue(String value) {
    for (AudiencePackageUpdateV2AwemeFanTimeScope b : AudiencePackageUpdateV2AwemeFanTimeScope.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageUpdateV2AwemeFanTimeScope> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageUpdateV2AwemeFanTimeScope enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageUpdateV2AwemeFanTimeScope read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageUpdateV2AwemeFanTimeScope.fromValue(value);
    }
  }
}

