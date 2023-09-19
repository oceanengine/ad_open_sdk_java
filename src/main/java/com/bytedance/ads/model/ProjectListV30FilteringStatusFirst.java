/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
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
@JsonAdapter(ProjectListV30FilteringStatusFirst.Adapter.class)
public enum ProjectListV30FilteringStatusFirst {
  
  DELETE("PROJECT_STATUS_DELETE"),
  
  DISABLE("PROJECT_STATUS_DISABLE"),
  
  DONE("PROJECT_STATUS_DONE"),
  
  ENABLE("PROJECT_STATUS_ENABLE");

  private String value;

  ProjectListV30FilteringStatusFirst(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30FilteringStatusFirst fromValue(String value) {
    for (ProjectListV30FilteringStatusFirst b : ProjectListV30FilteringStatusFirst.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectListV30FilteringStatusFirst> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30FilteringStatusFirst enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30FilteringStatusFirst read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30FilteringStatusFirst.fromValue(value);
    }
  }
}

