/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(LocalProjectDetailV30DataMarketingGoal.Adapter.class)
public enum LocalProjectDetailV30DataMarketingGoal {
  
  LIVE("LIVE"),
  
  VIDEO_IMAGE("VIDEO_IMAGE");

  private String value;

  LocalProjectDetailV30DataMarketingGoal(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectDetailV30DataMarketingGoal fromValue(String value) {
    for (LocalProjectDetailV30DataMarketingGoal b : LocalProjectDetailV30DataMarketingGoal.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalProjectDetailV30DataMarketingGoal> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectDetailV30DataMarketingGoal enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectDetailV30DataMarketingGoal read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectDetailV30DataMarketingGoal.fromValue(value);
    }
  }
}

