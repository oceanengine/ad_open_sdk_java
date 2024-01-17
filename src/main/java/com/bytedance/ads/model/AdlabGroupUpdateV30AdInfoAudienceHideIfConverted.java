/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(AdlabGroupUpdateV30AdInfoAudienceHideIfConverted.Adapter.class)
public enum AdlabGroupUpdateV30AdInfoAudienceHideIfConverted {
  
  AD("AD"),
  
  ADVERTISER("ADVERTISER"),
  
  APP("APP"),
  
  CAMPAIGN("CAMPAIGN"),
  
  CUSTOMER("CUSTOMER"),
  
  NO_EXCLUDE("NO_EXCLUDE"),
  
  ORGANIZATION("ORGANIZATION");

  private String value;

  AdlabGroupUpdateV30AdInfoAudienceHideIfConverted(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupUpdateV30AdInfoAudienceHideIfConverted fromValue(String value) {
    for (AdlabGroupUpdateV30AdInfoAudienceHideIfConverted b : AdlabGroupUpdateV30AdInfoAudienceHideIfConverted.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdlabGroupUpdateV30AdInfoAudienceHideIfConverted> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupUpdateV30AdInfoAudienceHideIfConverted enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupUpdateV30AdInfoAudienceHideIfConverted read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupUpdateV30AdInfoAudienceHideIfConverted.fromValue(value);
    }
  }
}

