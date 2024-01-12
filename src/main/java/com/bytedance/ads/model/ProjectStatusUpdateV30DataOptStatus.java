/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
@JsonAdapter(ProjectStatusUpdateV30DataOptStatus.Adapter.class)
public enum ProjectStatusUpdateV30DataOptStatus {
  
  DISABLE("DISABLE"),
  
  ENABLE("ENABLE");

  private String value;

  ProjectStatusUpdateV30DataOptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectStatusUpdateV30DataOptStatus fromValue(String value) {
    for (ProjectStatusUpdateV30DataOptStatus b : ProjectStatusUpdateV30DataOptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectStatusUpdateV30DataOptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectStatusUpdateV30DataOptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectStatusUpdateV30DataOptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectStatusUpdateV30DataOptStatus.fromValue(value);
    }
  }
}

