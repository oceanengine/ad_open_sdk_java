/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(SecurityScoreDisposalInfoGetV30FilteringDisposalStatus.Adapter.class)
public enum SecurityScoreDisposalInfoGetV30FilteringDisposalStatus {
  
  DISPOSAL("DISPOSAL");

  private String value;

  SecurityScoreDisposalInfoGetV30FilteringDisposalStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SecurityScoreDisposalInfoGetV30FilteringDisposalStatus fromValue(String value) {
    for (SecurityScoreDisposalInfoGetV30FilteringDisposalStatus b : SecurityScoreDisposalInfoGetV30FilteringDisposalStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SecurityScoreDisposalInfoGetV30FilteringDisposalStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final SecurityScoreDisposalInfoGetV30FilteringDisposalStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SecurityScoreDisposalInfoGetV30FilteringDisposalStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SecurityScoreDisposalInfoGetV30FilteringDisposalStatus.fromValue(value);
    }
  }
}

