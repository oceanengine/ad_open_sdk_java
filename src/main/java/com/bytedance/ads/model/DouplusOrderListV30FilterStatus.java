/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.8
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
@JsonAdapter(DouplusOrderListV30FilterStatus.Adapter.class)
public enum DouplusOrderListV30FilterStatus {
  
  AUDITING("AUDITING"),
  
  AUDIT_PAUSE("AUDIT_PAUSE"),
  
  DELIVERIED("DELIVERIED"),
  
  DELIVERING("DELIVERING"),
  
  OFFLINE_AUDIT("OFFLINE_AUDIT"),
  
  TIME_NO_REACH("TIME_NO_REACH"),
  
  UNDELIVERIED("UNDELIVERIED"),
  
  UNPAID("UNPAID"),
  
  WAIT_TO_START("WAIT_TO_START");

  private String value;

  DouplusOrderListV30FilterStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DouplusOrderListV30FilterStatus fromValue(String value) {
    for (DouplusOrderListV30FilterStatus b : DouplusOrderListV30FilterStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DouplusOrderListV30FilterStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DouplusOrderListV30FilterStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DouplusOrderListV30FilterStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DouplusOrderListV30FilterStatus.fromValue(value);
    }
  }
}

