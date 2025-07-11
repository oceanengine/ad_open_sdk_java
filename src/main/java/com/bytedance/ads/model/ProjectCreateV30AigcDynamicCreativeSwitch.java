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
@JsonAdapter(ProjectCreateV30AigcDynamicCreativeSwitch.Adapter.class)
public enum ProjectCreateV30AigcDynamicCreativeSwitch {
  
  ON("ON"),
  
  OFF("OFF");

  private String value;

  ProjectCreateV30AigcDynamicCreativeSwitch(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectCreateV30AigcDynamicCreativeSwitch fromValue(String value) {
    for (ProjectCreateV30AigcDynamicCreativeSwitch b : ProjectCreateV30AigcDynamicCreativeSwitch.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectCreateV30AigcDynamicCreativeSwitch> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectCreateV30AigcDynamicCreativeSwitch enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectCreateV30AigcDynamicCreativeSwitch read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectCreateV30AigcDynamicCreativeSwitch.fromValue(value);
    }
  }
}

