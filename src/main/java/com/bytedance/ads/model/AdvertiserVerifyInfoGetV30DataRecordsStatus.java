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
@JsonAdapter(AdvertiserVerifyInfoGetV30DataRecordsStatus.Adapter.class)
public enum AdvertiserVerifyInfoGetV30DataRecordsStatus {
  
  EXPIRE("EXPIRE"),
  
  FAIL("FAIL"),
  
  SUCCESS("SUCCESS"),
  
  UNDER_REVIEWING("UNDER_REVIEWING"),
  
  WAITING("WAITING");

  private String value;

  AdvertiserVerifyInfoGetV30DataRecordsStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserVerifyInfoGetV30DataRecordsStatus fromValue(String value) {
    for (AdvertiserVerifyInfoGetV30DataRecordsStatus b : AdvertiserVerifyInfoGetV30DataRecordsStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdvertiserVerifyInfoGetV30DataRecordsStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserVerifyInfoGetV30DataRecordsStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserVerifyInfoGetV30DataRecordsStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserVerifyInfoGetV30DataRecordsStatus.fromValue(value);
    }
  }
}

