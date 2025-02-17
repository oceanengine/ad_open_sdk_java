/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(LocalProjectListV30DataProjectListProjectStatusFirst.Adapter.class)
public enum LocalProjectListV30DataProjectListProjectStatusFirst {
  
  DELETE("PROJECT_STATUS_DELETE"),
  
  DISABLE("PROJECT_STATUS_DISABLE"),
  
  DONE("PROJECT_STATUS_DONE"),
  
  ENABLE("PROJECT_STATUS_ENABLE");

  private String value;

  LocalProjectListV30DataProjectListProjectStatusFirst(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectListV30DataProjectListProjectStatusFirst fromValue(String value) {
    for (LocalProjectListV30DataProjectListProjectStatusFirst b : LocalProjectListV30DataProjectListProjectStatusFirst.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalProjectListV30DataProjectListProjectStatusFirst> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectListV30DataProjectListProjectStatusFirst enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectListV30DataProjectListProjectStatusFirst read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectListV30DataProjectListProjectStatusFirst.fromValue(value);
    }
  }
}

