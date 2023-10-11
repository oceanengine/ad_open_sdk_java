/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
@JsonAdapter(ProjectUpdateV30TrackUrlSettingTrackUrlType.Adapter.class)
public enum ProjectUpdateV30TrackUrlSettingTrackUrlType {
  
  CUSTOM("CUSTOM"),
  
  GROUP_ID("GROUP_ID");

  private String value;

  ProjectUpdateV30TrackUrlSettingTrackUrlType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectUpdateV30TrackUrlSettingTrackUrlType fromValue(String value) {
    for (ProjectUpdateV30TrackUrlSettingTrackUrlType b : ProjectUpdateV30TrackUrlSettingTrackUrlType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectUpdateV30TrackUrlSettingTrackUrlType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectUpdateV30TrackUrlSettingTrackUrlType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectUpdateV30TrackUrlSettingTrackUrlType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectUpdateV30TrackUrlSettingTrackUrlType.fromValue(value);
    }
  }
}

