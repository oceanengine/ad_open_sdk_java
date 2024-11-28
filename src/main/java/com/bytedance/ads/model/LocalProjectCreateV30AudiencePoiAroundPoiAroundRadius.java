/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius.Adapter.class)
public enum LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius {
  
  Enum_10("KM_10"),
  
  Enum_12("KM_12"),
  
  Enum_15("KM_15"),
  
  Enum_20("KM_20"),
  
  Enum_6("KM_6"),
  
  Enum_8("KM_8");

  private String value;

  LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius fromValue(String value) {
    for (LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius b : LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius.fromValue(value);
    }
  }
}

