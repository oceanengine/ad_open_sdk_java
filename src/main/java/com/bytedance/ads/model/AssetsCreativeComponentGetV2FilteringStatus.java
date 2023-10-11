/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
@JsonAdapter(AssetsCreativeComponentGetV2FilteringStatus.Adapter.class)
public enum AssetsCreativeComponentGetV2FilteringStatus {
  
  PASS("PASS"),
  
  REJECT("REJECT"),
  
  UNDER("UNDER");

  private String value;

  AssetsCreativeComponentGetV2FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetsCreativeComponentGetV2FilteringStatus fromValue(String value) {
    for (AssetsCreativeComponentGetV2FilteringStatus b : AssetsCreativeComponentGetV2FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AssetsCreativeComponentGetV2FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AssetsCreativeComponentGetV2FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AssetsCreativeComponentGetV2FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AssetsCreativeComponentGetV2FilteringStatus.fromValue(value);
    }
  }
}

