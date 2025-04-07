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
@JsonAdapter(AdvertiserInfoV2DataStatus.Adapter.class)
public enum AdvertiserInfoV2DataStatus {
  
  SELF_SERVICE_UNAUDITED("STATUS_SELF_SERVICE_UNAUDITED"),
  
  LIMIT("STATUS_LIMIT"),
  
  PENDING_CONFIRM("STATUS_PENDING_CONFIRM"),
  
  DISABLE("STATUS_DISABLE"),
  
  WAIT_FOR_PUBLIC_AUTH("STATUS_WAIT_FOR_PUBLIC_AUTH"),
  
  CONFIRM_MODIFY_FAIL("STATUS_CONFIRM_MODIFY_FAIL"),
  
  PENDING_VERIFIED("STATUS_PENDING_VERIFIED"),
  
  CONFIRM_FAIL_END("STATUS_CONFIRM_FAIL_END"),
  
  WAIT_FOR_BPM_AUDIT("STATUS_WAIT_FOR_BPM_AUDIT"),
  
  PENDING_CONFIRM_MODIFY("STATUS_PENDING_CONFIRM_MODIFY"),
  
  CONFIRM_FAIL("STATUS_CONFIRM_FAIL"),
  
  ENABLE("STATUS_ENABLE");

  private String value;

  AdvertiserInfoV2DataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserInfoV2DataStatus fromValue(String value) {
    for (AdvertiserInfoV2DataStatus b : AdvertiserInfoV2DataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdvertiserInfoV2DataStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserInfoV2DataStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserInfoV2DataStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserInfoV2DataStatus.fromValue(value);
    }
  }
}

