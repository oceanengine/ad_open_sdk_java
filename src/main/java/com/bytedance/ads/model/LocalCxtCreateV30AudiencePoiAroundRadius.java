/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(LocalCxtCreateV30AudiencePoiAroundRadius.Adapter.class)
public enum LocalCxtCreateV30AudiencePoiAroundRadius {
  
  Enum_10("KM_10"),
  
  Enum_12("KM_12"),
  
  Enum_15("KM_15"),
  
  Enum_20("KM_20"),
  
  Enum_6("KM_6"),
  
  Enum_8("KM_8");

  private String value;

  LocalCxtCreateV30AudiencePoiAroundRadius(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalCxtCreateV30AudiencePoiAroundRadius fromValue(String value) {
    for (LocalCxtCreateV30AudiencePoiAroundRadius b : LocalCxtCreateV30AudiencePoiAroundRadius.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalCxtCreateV30AudiencePoiAroundRadius> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalCxtCreateV30AudiencePoiAroundRadius enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalCxtCreateV30AudiencePoiAroundRadius read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalCxtCreateV30AudiencePoiAroundRadius.fromValue(value);
    }
  }
}

