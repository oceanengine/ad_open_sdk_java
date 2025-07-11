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
@JsonAdapter(ProjectListV30DataListAudienceFilterAwemeFansCount.Adapter.class)
public enum ProjectListV30DataListAudienceFilterAwemeFansCount {
  
  NUMBER_1000(1000l),
  
  NUMBER_200(200l),
  
  NUMBER_500(500l);

  private Long value;

  ProjectListV30DataListAudienceFilterAwemeFansCount(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListAudienceFilterAwemeFansCount fromValue(Long value) {
    for (ProjectListV30DataListAudienceFilterAwemeFansCount b : ProjectListV30DataListAudienceFilterAwemeFansCount.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListAudienceFilterAwemeFansCount> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListAudienceFilterAwemeFansCount enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListAudienceFilterAwemeFansCount read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ProjectListV30DataListAudienceFilterAwemeFansCount.fromValue(value);
    }
  }
}

