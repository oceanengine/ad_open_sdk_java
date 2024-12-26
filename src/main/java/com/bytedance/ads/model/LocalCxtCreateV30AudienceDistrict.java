/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(LocalCxtCreateV30AudienceDistrict.Adapter.class)
public enum LocalCxtCreateV30AudienceDistrict {
  
  ALL("ALL"),
  
  CITY("CITY"),
  
  COUNTRY("COUNTRY"),
  
  POI_AROUND("POI_AROUND");

  private String value;

  LocalCxtCreateV30AudienceDistrict(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalCxtCreateV30AudienceDistrict fromValue(String value) {
    for (LocalCxtCreateV30AudienceDistrict b : LocalCxtCreateV30AudienceDistrict.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalCxtCreateV30AudienceDistrict> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalCxtCreateV30AudienceDistrict enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalCxtCreateV30AudienceDistrict read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalCxtCreateV30AudienceDistrict.fromValue(value);
    }
  }
}

