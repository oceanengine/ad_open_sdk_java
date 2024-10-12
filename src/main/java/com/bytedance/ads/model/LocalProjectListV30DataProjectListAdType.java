/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(LocalProjectListV30DataProjectListAdType.Adapter.class)
public enum LocalProjectListV30DataProjectListAdType {
  
  GENERAL("GENERAL"),
  
  SEARCHING("SEARCHING");

  private String value;

  LocalProjectListV30DataProjectListAdType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectListV30DataProjectListAdType fromValue(String value) {
    for (LocalProjectListV30DataProjectListAdType b : LocalProjectListV30DataProjectListAdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalProjectListV30DataProjectListAdType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectListV30DataProjectListAdType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectListV30DataProjectListAdType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectListV30DataProjectListAdType.fromValue(value);
    }
  }
}

