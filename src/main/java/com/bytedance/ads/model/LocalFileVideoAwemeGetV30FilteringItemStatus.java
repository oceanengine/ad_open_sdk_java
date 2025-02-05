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
@JsonAdapter(LocalFileVideoAwemeGetV30FilteringItemStatus.Adapter.class)
public enum LocalFileVideoAwemeGetV30FilteringItemStatus {
  
  ALL("ALL"),
  
  VALID("VALID");

  private String value;

  LocalFileVideoAwemeGetV30FilteringItemStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalFileVideoAwemeGetV30FilteringItemStatus fromValue(String value) {
    for (LocalFileVideoAwemeGetV30FilteringItemStatus b : LocalFileVideoAwemeGetV30FilteringItemStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalFileVideoAwemeGetV30FilteringItemStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalFileVideoAwemeGetV30FilteringItemStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalFileVideoAwemeGetV30FilteringItemStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalFileVideoAwemeGetV30FilteringItemStatus.fromValue(value);
    }
  }
}

