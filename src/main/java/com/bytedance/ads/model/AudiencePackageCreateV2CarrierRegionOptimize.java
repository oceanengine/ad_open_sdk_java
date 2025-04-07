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
@JsonAdapter(AudiencePackageCreateV2CarrierRegionOptimize.Adapter.class)
public enum AudiencePackageCreateV2CarrierRegionOptimize {
  
  ON("ON"),
  
  OFF("OFF");

  private String value;

  AudiencePackageCreateV2CarrierRegionOptimize(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageCreateV2CarrierRegionOptimize fromValue(String value) {
    for (AudiencePackageCreateV2CarrierRegionOptimize b : AudiencePackageCreateV2CarrierRegionOptimize.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageCreateV2CarrierRegionOptimize> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageCreateV2CarrierRegionOptimize enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageCreateV2CarrierRegionOptimize read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageCreateV2CarrierRegionOptimize.fromValue(value);
    }
  }
}

