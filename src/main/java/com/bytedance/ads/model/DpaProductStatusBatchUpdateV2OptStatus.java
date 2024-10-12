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
@JsonAdapter(DpaProductStatusBatchUpdateV2OptStatus.Adapter.class)
public enum DpaProductStatusBatchUpdateV2OptStatus {
  
  ENABLE("ENABLE"),
  
  DISABLE("DISABLE");

  private String value;

  DpaProductStatusBatchUpdateV2OptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaProductStatusBatchUpdateV2OptStatus fromValue(String value) {
    for (DpaProductStatusBatchUpdateV2OptStatus b : DpaProductStatusBatchUpdateV2OptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DpaProductStatusBatchUpdateV2OptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaProductStatusBatchUpdateV2OptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaProductStatusBatchUpdateV2OptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaProductStatusBatchUpdateV2OptStatus.fromValue(value);
    }
  }
}

