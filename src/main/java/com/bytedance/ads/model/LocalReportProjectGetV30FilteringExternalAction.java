/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(LocalReportProjectGetV30FilteringExternalAction.Adapter.class)
public enum LocalReportProjectGetV30FilteringExternalAction {
  
  CLUE_ACQUISITION("CLUE_ACQUISITION"),
  
  INTENTION_CLUE_ACQUISITION("INTENTION_CLUE_ACQUISITION"),
  
  PRIVATE_MESSAGE("PRIVATE_MESSAGE");

  private String value;

  LocalReportProjectGetV30FilteringExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalReportProjectGetV30FilteringExternalAction fromValue(String value) {
    for (LocalReportProjectGetV30FilteringExternalAction b : LocalReportProjectGetV30FilteringExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalReportProjectGetV30FilteringExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalReportProjectGetV30FilteringExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalReportProjectGetV30FilteringExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalReportProjectGetV30FilteringExternalAction.fromValue(value);
    }
  }
}

