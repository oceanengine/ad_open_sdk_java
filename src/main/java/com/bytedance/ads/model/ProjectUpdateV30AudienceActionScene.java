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
@JsonAdapter(ProjectUpdateV30AudienceActionScene.Adapter.class)
public enum ProjectUpdateV30AudienceActionScene {
  
  AD("AD"),
  
  APP("APP"),
  
  E_COMMERCE("E-COMMERCE"),
  
  NEWS("NEWS"),
  
  SEARCH("SEARCH");

  private String value;

  ProjectUpdateV30AudienceActionScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectUpdateV30AudienceActionScene fromValue(String value) {
    for (ProjectUpdateV30AudienceActionScene b : ProjectUpdateV30AudienceActionScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectUpdateV30AudienceActionScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectUpdateV30AudienceActionScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectUpdateV30AudienceActionScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectUpdateV30AudienceActionScene.fromValue(value);
    }
  }
}

