/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform.Adapter.class)
public enum ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform {
  
  JD("JD"),
  
  OTHER("OTHER"),
  
  PDD("PDD"),
  
  TB("TB");

  private String value;

  ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform fromValue(String value) {
    for (ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform b : ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform.fromValue(value);
    }
  }
}

