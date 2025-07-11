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
@JsonAdapter(LocalCxtDetailV30DataStatus.Adapter.class)
public enum LocalCxtDetailV30DataStatus {
  
  ADVERTISER_OFFLINE_BUDGET("ADVERTISER_OFFLINE_BUDGET"),
  
  ADVERTISER_PRE_OFFLINE_BUDGET("ADVERTISER_PRE_OFFLINE_BUDGET"),
  
  CREATE("CREATE"),
  
  ENABLE("ENABLE"),
  
  EXTERNAL_URL_DISABLE("EXTERNAL_URL_DISABLE"),
  
  FROZEN("FROZEN"),
  
  OFFLINE_AUDIT("OFFLINE_AUDIT"),
  
  OFFLINE_BALANCE("OFFLINE_BALANCE"),
  
  PAUSED("PAUSED"),
  
  SYSTEM_DISABLE("SYSTEM_DISABLE");

  private String value;

  LocalCxtDetailV30DataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalCxtDetailV30DataStatus fromValue(String value) {
    for (LocalCxtDetailV30DataStatus b : LocalCxtDetailV30DataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalCxtDetailV30DataStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalCxtDetailV30DataStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalCxtDetailV30DataStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalCxtDetailV30DataStatus.fromValue(value);
    }
  }
}

