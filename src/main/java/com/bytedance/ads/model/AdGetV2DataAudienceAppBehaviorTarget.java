/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(AdGetV2DataAudienceAppBehaviorTarget.Adapter.class)
public enum AdGetV2DataAudienceAppBehaviorTarget {
  
  APP("APP"),
  
  NONE("NONE"),
  
  CATEGORY("CATEGORY");

  private String value;

  AdGetV2DataAudienceAppBehaviorTarget(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAudienceAppBehaviorTarget fromValue(String value) {
    for (AdGetV2DataAudienceAppBehaviorTarget b : AdGetV2DataAudienceAppBehaviorTarget.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAudienceAppBehaviorTarget> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAudienceAppBehaviorTarget enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAudienceAppBehaviorTarget read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAudienceAppBehaviorTarget.fromValue(value);
    }
  }
}

