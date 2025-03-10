/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(ProjectListV30FilteringAppPromotionType.Adapter.class)
public enum ProjectListV30FilteringAppPromotionType {
  
  DOWNLOAD("DOWNLOAD"),
  
  LAUNCH("LAUNCH"),
  
  RESERVE("RESERVE");

  private String value;

  ProjectListV30FilteringAppPromotionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30FilteringAppPromotionType fromValue(String value) {
    for (ProjectListV30FilteringAppPromotionType b : ProjectListV30FilteringAppPromotionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectListV30FilteringAppPromotionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30FilteringAppPromotionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30FilteringAppPromotionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30FilteringAppPromotionType.fromValue(value);
    }
  }
}

