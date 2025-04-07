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
@JsonAdapter(LocalProjectListV30FilteringProjectStatusFirst.Adapter.class)
public enum LocalProjectListV30FilteringProjectStatusFirst {
  
  ALL("PROJECT_STATUS_ALL"),
  
  DELETE("PROJECT_STATUS_DELETE"),
  
  DISABLE("PROJECT_STATUS_DISABLE"),
  
  DONE("PROJECT_STATUS_DONE"),
  
  ENABLE("PROJECT_STATUS_ENABLE"),
  
  NOT_DELETE("PROJECT_STATUS_NOT_DELETE");

  private String value;

  LocalProjectListV30FilteringProjectStatusFirst(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectListV30FilteringProjectStatusFirst fromValue(String value) {
    for (LocalProjectListV30FilteringProjectStatusFirst b : LocalProjectListV30FilteringProjectStatusFirst.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalProjectListV30FilteringProjectStatusFirst> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectListV30FilteringProjectStatusFirst enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectListV30FilteringProjectStatusFirst read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectListV30FilteringProjectStatusFirst.fromValue(value);
    }
  }
}

