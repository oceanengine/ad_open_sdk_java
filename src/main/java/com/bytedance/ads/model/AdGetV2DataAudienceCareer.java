/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
@JsonAdapter(AdGetV2DataAudienceCareer.Adapter.class)
public enum AdGetV2DataAudienceCareer {
  
  FINANCIAL("FINANCIAL"),
  
  COLLEGE_STUDENT("COLLEGE_STUDENT"),
  
  IT("IT"),
  
  MEDICAL_STAFF("MEDICAL_STAFF"),
  
  TEACHER("TEACHER"),
  
  CIVIL_SERVANTS("CIVIL_SERVANTS");

  private String value;

  AdGetV2DataAudienceCareer(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAudienceCareer fromValue(String value) {
    for (AdGetV2DataAudienceCareer b : AdGetV2DataAudienceCareer.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAudienceCareer> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAudienceCareer enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAudienceCareer read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAudienceCareer.fromValue(value);
    }
  }
}

