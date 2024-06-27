/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(StarStarAdUniteTaskListV2FilteringStatus.Adapter.class)
public enum StarStarAdUniteTaskListV2FilteringStatus {
  
  ALL("ALL"),
  
  CANCELED("CANCELED"),
  
  FINISHED("FINISHED"),
  
  ONGOING("ONGOING"),
  
  RECEIVEING("RECEIVEING"),
  
  WAIT_EVALUATE("WAIT_EVALUATE"),
  
  WAIT_PAYMENT("WAIT_PAYMENT");

  private String value;

  StarStarAdUniteTaskListV2FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarStarAdUniteTaskListV2FilteringStatus fromValue(String value) {
    for (StarStarAdUniteTaskListV2FilteringStatus b : StarStarAdUniteTaskListV2FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarStarAdUniteTaskListV2FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarStarAdUniteTaskListV2FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarStarAdUniteTaskListV2FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarStarAdUniteTaskListV2FilteringStatus.fromValue(value);
    }
  }
}

