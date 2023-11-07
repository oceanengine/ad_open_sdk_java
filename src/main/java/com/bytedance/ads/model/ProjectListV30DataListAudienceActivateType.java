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
@JsonAdapter(ProjectListV30DataListAudienceActivateType.Adapter.class)
public enum ProjectListV30DataListAudienceActivateType {
  
  ONE_MONTH_2_THREE_MONTH("ONE_MONTH_2_THREE_MONTH"),
  
  THREE_MONTH_EAILIER("THREE_MONTH_EAILIER"),
  
  UNLIMITED("UNLIMITED"),
  
  WITH_IN_A_MONTH("WITH_IN_A_MONTH");

  private String value;

  ProjectListV30DataListAudienceActivateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListAudienceActivateType fromValue(String value) {
    for (ProjectListV30DataListAudienceActivateType b : ProjectListV30DataListAudienceActivateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListAudienceActivateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListAudienceActivateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListAudienceActivateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListAudienceActivateType.fromValue(value);
    }
  }
}

