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
@JsonAdapter(ProjectUpdateV30AudienceAutoExtendTargets.Adapter.class)
public enum ProjectUpdateV30AudienceAutoExtendTargets {
  
  AD_TAG("AD_TAG"),
  
  AGE("AGE"),
  
  CUSTOM_AUDIENCE("CUSTOM_AUDIENCE"),
  
  GENDER("GENDER"),
  
  INTEREST_ACTION("INTEREST_ACTION"),
  
  INTEREST_TAG("INTEREST_TAG"),
  
  REGION("REGION");

  private String value;

  ProjectUpdateV30AudienceAutoExtendTargets(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectUpdateV30AudienceAutoExtendTargets fromValue(String value) {
    for (ProjectUpdateV30AudienceAutoExtendTargets b : ProjectUpdateV30AudienceAutoExtendTargets.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectUpdateV30AudienceAutoExtendTargets> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectUpdateV30AudienceAutoExtendTargets enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectUpdateV30AudienceAutoExtendTargets read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectUpdateV30AudienceAutoExtendTargets.fromValue(value);
    }
  }
}

