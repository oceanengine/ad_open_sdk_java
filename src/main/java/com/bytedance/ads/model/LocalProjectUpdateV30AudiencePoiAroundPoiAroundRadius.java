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
@JsonAdapter(LocalProjectUpdateV30AudiencePoiAroundPoiAroundRadius.Adapter.class)
public enum LocalProjectUpdateV30AudiencePoiAroundPoiAroundRadius {
  
  Enum_10("KM_10"),
  
  Enum_12("KM_12"),
  
  Enum_15("KM_15"),
  
  Enum_20("KM_20"),
  
  Enum_6("KM_6"),
  
  Enum_8("KM_8");

  private String value;

  LocalProjectUpdateV30AudiencePoiAroundPoiAroundRadius(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectUpdateV30AudiencePoiAroundPoiAroundRadius fromValue(String value) {
    for (LocalProjectUpdateV30AudiencePoiAroundPoiAroundRadius b : LocalProjectUpdateV30AudiencePoiAroundPoiAroundRadius.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalProjectUpdateV30AudiencePoiAroundPoiAroundRadius> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectUpdateV30AudiencePoiAroundPoiAroundRadius enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectUpdateV30AudiencePoiAroundPoiAroundRadius read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectUpdateV30AudiencePoiAroundPoiAroundRadius.fromValue(value);
    }
  }
}

