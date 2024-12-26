/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(ProjectListV30DataListTrackUrlSettingTrackUrlType.Adapter.class)
public enum ProjectListV30DataListTrackUrlSettingTrackUrlType {
  
  CUSTOM("CUSTOM"),
  
  GROUP_ID("GROUP_ID");

  private String value;

  ProjectListV30DataListTrackUrlSettingTrackUrlType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListTrackUrlSettingTrackUrlType fromValue(String value) {
    for (ProjectListV30DataListTrackUrlSettingTrackUrlType b : ProjectListV30DataListTrackUrlSettingTrackUrlType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListTrackUrlSettingTrackUrlType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListTrackUrlSettingTrackUrlType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListTrackUrlSettingTrackUrlType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListTrackUrlSettingTrackUrlType.fromValue(value);
    }
  }
}

