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
@JsonAdapter(LocalProjectListV30DataProjectListProjectStatusSecond.Adapter.class)
public enum LocalProjectListV30DataProjectListProjectStatusSecond {
  
  BUDGET_EXCEED("PROJECT_STATUS_BUDGET_EXCEED"),
  
  DISABLE("PROJECT_STATUS_DISABLE"),
  
  NOT_SCHEDULE("PROJECT_STATUS_NOT_SCHEDULE"),
  
  NOT_START("PROJECT_STATUS_NOT_START");

  private String value;

  LocalProjectListV30DataProjectListProjectStatusSecond(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectListV30DataProjectListProjectStatusSecond fromValue(String value) {
    for (LocalProjectListV30DataProjectListProjectStatusSecond b : LocalProjectListV30DataProjectListProjectStatusSecond.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalProjectListV30DataProjectListProjectStatusSecond> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectListV30DataProjectListProjectStatusSecond enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectListV30DataProjectListProjectStatusSecond read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectListV30DataProjectListProjectStatusSecond.fromValue(value);
    }
  }
}

