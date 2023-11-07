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
@JsonAdapter(AdlabGroupDetailV30DataDataOptStatus.Adapter.class)
public enum AdlabGroupDetailV30DataDataOptStatus {
  
  DELETED("DELETED"),
  
  DISABLED("DISABLED"),
  
  ENABLED("ENABLED"),
  
  REACH_QUOTA_LIMIT("REACH_QUOTA_LIMIT");

  private String value;

  AdlabGroupDetailV30DataDataOptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupDetailV30DataDataOptStatus fromValue(String value) {
    for (AdlabGroupDetailV30DataDataOptStatus b : AdlabGroupDetailV30DataDataOptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdlabGroupDetailV30DataDataOptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupDetailV30DataDataOptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupDetailV30DataDataOptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupDetailV30DataDataOptStatus.fromValue(value);
    }
  }
}

