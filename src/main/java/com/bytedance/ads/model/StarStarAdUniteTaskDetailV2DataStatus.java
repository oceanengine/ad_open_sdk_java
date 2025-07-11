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
@JsonAdapter(StarStarAdUniteTaskDetailV2DataStatus.Adapter.class)
public enum StarStarAdUniteTaskDetailV2DataStatus {
  
  BILLING("BILLING"),
  
  BULLETIN("BULLETIN"),
  
  CANCELED("CANCELED"),
  
  CLOSED("CLOSED"),
  
  ENROLL("ENROLL"),
  
  FINISHED("FINISHED"),
  
  PROVIDER_ACCEPTING("PROVIDER_ACCEPTING"),
  
  STARTED("STARTED");

  private String value;

  StarStarAdUniteTaskDetailV2DataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarStarAdUniteTaskDetailV2DataStatus fromValue(String value) {
    for (StarStarAdUniteTaskDetailV2DataStatus b : StarStarAdUniteTaskDetailV2DataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarStarAdUniteTaskDetailV2DataStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarStarAdUniteTaskDetailV2DataStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarStarAdUniteTaskDetailV2DataStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarStarAdUniteTaskDetailV2DataStatus.fromValue(value);
    }
  }
}

