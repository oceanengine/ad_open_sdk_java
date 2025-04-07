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
@JsonAdapter(LocalReportAccountGetV30FilteringExternalAction.Adapter.class)
public enum LocalReportAccountGetV30FilteringExternalAction {
  
  CLUE_ACQUISITION("CLUE_ACQUISITION"),
  
  FOLLOW_ACTION("FOLLOW_ACTION"),
  
  INTENTION_CLUE_ACQUISITION("INTENTION_CLUE_ACQUISITION"),
  
  LIVE_ENGAGEMENT("LIVE_ENGAGEMENT"),
  
  LIVE_ENTER_ACTION("LIVE_ENTER_ACTION"),
  
  LIVE_OTO_CLICK("LIVE_OTO_CLICK"),
  
  LIVE_OTO_GROUP_BUYING("LIVE_OTO_GROUP_BUYING"),
  
  LIVE_STAY_TIME("LIVE_STAY_TIME"),
  
  NATIVE_ACTION("NATIVE_ACTION"),
  
  OTO_PAY("OTO_PAY"),
  
  POI_RECOMMEND("POI_RECOMMEND"),
  
  PRIVATE_MESSAGE("PRIVATE_MESSAGE"),
  
  SHOW("SHOW");

  private String value;

  LocalReportAccountGetV30FilteringExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalReportAccountGetV30FilteringExternalAction fromValue(String value) {
    for (LocalReportAccountGetV30FilteringExternalAction b : LocalReportAccountGetV30FilteringExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalReportAccountGetV30FilteringExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalReportAccountGetV30FilteringExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalReportAccountGetV30FilteringExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalReportAccountGetV30FilteringExternalAction.fromValue(value);
    }
  }
}

