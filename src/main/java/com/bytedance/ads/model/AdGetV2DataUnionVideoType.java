/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(AdGetV2DataUnionVideoType.Adapter.class)
public enum AdGetV2DataUnionVideoType {
  
  SPLASH_VIDEO("SPLASH_VIDEO"),
  
  REWARDED_VIDEO("REWARDED_VIDEO"),
  
  ORIGINAL_VIDEO("ORIGINAL_VIDEO");

  private String value;

  AdGetV2DataUnionVideoType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataUnionVideoType fromValue(String value) {
    for (AdGetV2DataUnionVideoType b : AdGetV2DataUnionVideoType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataUnionVideoType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataUnionVideoType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataUnionVideoType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataUnionVideoType.fromValue(value);
    }
  }
}

