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
@JsonAdapter(LocalCxtStatusUpdateV30OptStatus.Adapter.class)
public enum LocalCxtStatusUpdateV30OptStatus {
  
  ENABLE("ENABLE"),
  
  PAUSED("PAUSED");

  private String value;

  LocalCxtStatusUpdateV30OptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalCxtStatusUpdateV30OptStatus fromValue(String value) {
    for (LocalCxtStatusUpdateV30OptStatus b : LocalCxtStatusUpdateV30OptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalCxtStatusUpdateV30OptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalCxtStatusUpdateV30OptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalCxtStatusUpdateV30OptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalCxtStatusUpdateV30OptStatus.fromValue(value);
    }
  }
}

