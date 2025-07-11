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
@JsonAdapter(ProjectListV30DataListKeywordsBidType.Adapter.class)
public enum ProjectListV30DataListKeywordsBidType {
  
  CUSTOM("CUSTOM"),
  
  FEED_TO_SEARCH("FEED_TO_SEARCH"),
  
  WITH_PROMOTION("WITH_PROMOTION");

  private String value;

  ProjectListV30DataListKeywordsBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListKeywordsBidType fromValue(String value) {
    for (ProjectListV30DataListKeywordsBidType b : ProjectListV30DataListKeywordsBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListKeywordsBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListKeywordsBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListKeywordsBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListKeywordsBidType.fromValue(value);
    }
  }
}

