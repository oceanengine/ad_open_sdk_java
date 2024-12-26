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
@JsonAdapter(ReportBrandDataV30FilterAdForm.Adapter.class)
public enum ReportBrandDataV30FilterAdForm {
  
  AWEME_LBS("AWEME_LBS"),
  
  CONTENTRECOMMEND("CONTENTRECOMMEND"),
  
  CONTENTRECOMMEND_NO_GRASS("CONTENTRECOMMEND_NO_GRASS"),
  
  CONTENTSERVICE("CONTENTSERVICE"),
  
  CONTENTSERVICE_NO_GRASS("CONTENTSERVICE_NO_GRASS"),
  
  FEED("FEED"),
  
  FEEDSLIVE_AD("FEEDSLIVE_AD"),
  
  FEEDSLIVE_SERVICE("FEEDSLIVE_SERVICE"),
  
  SPLASH("SPLASH"),
  
  VIDEOLIVE_AD("VIDEOLIVE_AD");

  private String value;

  ReportBrandDataV30FilterAdForm(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportBrandDataV30FilterAdForm fromValue(String value) {
    for (ReportBrandDataV30FilterAdForm b : ReportBrandDataV30FilterAdForm.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportBrandDataV30FilterAdForm> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportBrandDataV30FilterAdForm enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportBrandDataV30FilterAdForm read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportBrandDataV30FilterAdForm.fromValue(value);
    }
  }
}

