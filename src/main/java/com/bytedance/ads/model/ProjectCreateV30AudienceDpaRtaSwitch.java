/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(ProjectCreateV30AudienceDpaRtaSwitch.Adapter.class)
public enum ProjectCreateV30AudienceDpaRtaSwitch {
  
  OFF("OFF"),
  
  ON("ON");

  private String value;

  ProjectCreateV30AudienceDpaRtaSwitch(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectCreateV30AudienceDpaRtaSwitch fromValue(String value) {
    for (ProjectCreateV30AudienceDpaRtaSwitch b : ProjectCreateV30AudienceDpaRtaSwitch.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectCreateV30AudienceDpaRtaSwitch> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectCreateV30AudienceDpaRtaSwitch enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectCreateV30AudienceDpaRtaSwitch read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectCreateV30AudienceDpaRtaSwitch.fromValue(value);
    }
  }
}

