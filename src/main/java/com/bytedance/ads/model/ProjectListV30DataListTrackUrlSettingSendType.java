/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
@JsonAdapter(ProjectListV30DataListTrackUrlSettingSendType.Adapter.class)
public enum ProjectListV30DataListTrackUrlSettingSendType {
  
  CLIENT_SEND("CLIENT_SEND"),
  
  SERVER_SEND("SERVER_SEND");

  private String value;

  ProjectListV30DataListTrackUrlSettingSendType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListTrackUrlSettingSendType fromValue(String value) {
    for (ProjectListV30DataListTrackUrlSettingSendType b : ProjectListV30DataListTrackUrlSettingSendType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListTrackUrlSettingSendType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListTrackUrlSettingSendType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListTrackUrlSettingSendType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListTrackUrlSettingSendType.fromValue(value);
    }
  }
}

