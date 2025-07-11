/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
@JsonAdapter(LocalProjectListV30DataProjectListExternalAction.Adapter.class)
public enum LocalProjectListV30DataProjectListExternalAction {
  
  FOLLOW_ACTION("FOLLOW_ACTION"),
  
  LIVE_ENGAGEMENT("LIVE_ENGAGEMENT"),
  
  LIVE_ENTER_ACTION("LIVE_ENTER_ACTION"),
  
  LIVE_OTO_CLICK("LIVE_OTO_CLICK"),
  
  LIVE_OTO_GROUP_BUYING("LIVE_OTO_GROUP_BUYING"),
  
  LIVE_STAY_TIME("LIVE_STAY_TIME"),
  
  NATIVE_ACTION("NATIVE_ACTION"),
  
  POI_RECOMMEND("POI_RECOMMEND"),
  
  SHOW("SHOW");

  private String value;

  LocalProjectListV30DataProjectListExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectListV30DataProjectListExternalAction fromValue(String value) {
    for (LocalProjectListV30DataProjectListExternalAction b : LocalProjectListV30DataProjectListExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalProjectListV30DataProjectListExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectListV30DataProjectListExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectListV30DataProjectListExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectListV30DataProjectListExternalAction.fromValue(value);
    }
  }
}

