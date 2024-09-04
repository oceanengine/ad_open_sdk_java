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
@JsonAdapter(SecurityScoreViolationEventGetV30DataAdvScoreEventStatus.Adapter.class)
public enum SecurityScoreViolationEventGetV30DataAdvScoreEventStatus {
  
  APPEAL("APPEAL"),
  
  FAILAPPEAL("FAILAPPEAL"),
  
  ONAPPEAL("ONAPPEAL"),
  
  VALID("VALID");

  private String value;

  SecurityScoreViolationEventGetV30DataAdvScoreEventStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SecurityScoreViolationEventGetV30DataAdvScoreEventStatus fromValue(String value) {
    for (SecurityScoreViolationEventGetV30DataAdvScoreEventStatus b : SecurityScoreViolationEventGetV30DataAdvScoreEventStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SecurityScoreViolationEventGetV30DataAdvScoreEventStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final SecurityScoreViolationEventGetV30DataAdvScoreEventStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SecurityScoreViolationEventGetV30DataAdvScoreEventStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SecurityScoreViolationEventGetV30DataAdvScoreEventStatus.fromValue(value);
    }
  }
}

