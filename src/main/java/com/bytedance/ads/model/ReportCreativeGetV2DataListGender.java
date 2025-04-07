/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(ReportCreativeGetV2DataListGender.Adapter.class)
public enum ReportCreativeGetV2DataListGender {
  
  GENDER_UNLIMITED("GENDER_UNLIMITED"),
  
  GENDER_FEMALE("GENDER_FEMALE"),
  
  NONE("NONE"),
  
  GENDER_MALE("GENDER_MALE");

  private String value;

  ReportCreativeGetV2DataListGender(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2DataListGender fromValue(String value) {
    for (ReportCreativeGetV2DataListGender b : ReportCreativeGetV2DataListGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2DataListGender> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2DataListGender enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2DataListGender read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2DataListGender.fromValue(value);
    }
  }
}

