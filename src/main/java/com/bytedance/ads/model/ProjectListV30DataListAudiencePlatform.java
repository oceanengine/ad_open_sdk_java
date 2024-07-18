/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(ProjectListV30DataListAudiencePlatform.Adapter.class)
public enum ProjectListV30DataListAudiencePlatform {
  
  ANDROID("ANDROID"),
  
  IOS("IOS"),
  
  IPAD("IPAD"),
  
  NONE("NONE"),
  
  PC("PC"),
  
  WAP("WAP");

  private String value;

  ProjectListV30DataListAudiencePlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListAudiencePlatform fromValue(String value) {
    for (ProjectListV30DataListAudiencePlatform b : ProjectListV30DataListAudiencePlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListAudiencePlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListAudiencePlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListAudiencePlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListAudiencePlatform.fromValue(value);
    }
  }
}

