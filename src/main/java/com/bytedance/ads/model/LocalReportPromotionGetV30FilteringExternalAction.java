/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(LocalReportPromotionGetV30FilteringExternalAction.Adapter.class)
public enum LocalReportPromotionGetV30FilteringExternalAction {
  
  CLUE_ACQUISITION("CLUE_ACQUISITION"),
  
  INTENTION_CLUE_ACQUISITION("INTENTION_CLUE_ACQUISITION"),
  
  PRIVATE_MESSAGE("PRIVATE_MESSAGE");

  private String value;

  LocalReportPromotionGetV30FilteringExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalReportPromotionGetV30FilteringExternalAction fromValue(String value) {
    for (LocalReportPromotionGetV30FilteringExternalAction b : LocalReportPromotionGetV30FilteringExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalReportPromotionGetV30FilteringExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalReportPromotionGetV30FilteringExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalReportPromotionGetV30FilteringExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalReportPromotionGetV30FilteringExternalAction.fromValue(value);
    }
  }
}

