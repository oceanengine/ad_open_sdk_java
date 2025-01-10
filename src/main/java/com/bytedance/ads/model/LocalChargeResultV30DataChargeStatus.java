/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.33
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
@JsonAdapter(LocalChargeResultV30DataChargeStatus.Adapter.class)
public enum LocalChargeResultV30DataChargeStatus {
  
  PROCESSING("PROCESSING"),
  
  SUCCESS("SUCCESS"),
  
  FAILED("FAILED");

  private String value;

  LocalChargeResultV30DataChargeStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalChargeResultV30DataChargeStatus fromValue(String value) {
    for (LocalChargeResultV30DataChargeStatus b : LocalChargeResultV30DataChargeStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalChargeResultV30DataChargeStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalChargeResultV30DataChargeStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalChargeResultV30DataChargeStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalChargeResultV30DataChargeStatus.fromValue(value);
    }
  }
}
