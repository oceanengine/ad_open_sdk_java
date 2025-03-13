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
@JsonAdapter(ReportAudienceAwemeListV2FilteringAudienceLevel.Adapter.class)
public enum ReportAudienceAwemeListV2FilteringAudienceLevel {
  
  FOURTH_LEVEL("FOURTH_LEVEL"),
  
  KEYWORD_AWEME("KEYWORD_AWEME"),
  
  FIRST_LEVEL("FIRST_LEVEL"),
  
  SECOND_LEVEL("SECOND_LEVEL"),
  
  THIRD_LEVEL("THIRD_LEVEL");

  private String value;

  ReportAudienceAwemeListV2FilteringAudienceLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAudienceAwemeListV2FilteringAudienceLevel fromValue(String value) {
    for (ReportAudienceAwemeListV2FilteringAudienceLevel b : ReportAudienceAwemeListV2FilteringAudienceLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAudienceAwemeListV2FilteringAudienceLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAudienceAwemeListV2FilteringAudienceLevel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAudienceAwemeListV2FilteringAudienceLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAudienceAwemeListV2FilteringAudienceLevel.fromValue(value);
    }
  }
}

