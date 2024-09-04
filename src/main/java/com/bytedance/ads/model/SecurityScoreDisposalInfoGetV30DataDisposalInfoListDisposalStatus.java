/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@JsonAdapter(SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus.Adapter.class)
public enum SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus {
  
  DISPOSAL("DISPOSAL");

  private String value;

  SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus fromValue(String value) {
    for (SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus b : SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus.fromValue(value);
    }
  }
}

