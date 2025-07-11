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
@JsonAdapter(ToolsAdminInfoV2SubDistrict.Adapter.class)
public enum ToolsAdminInfoV2SubDistrict {
  
  FOUR_LEVEL("FOUR_LEVEL"),
  
  NONE("NONE"),
  
  ONE_LEVEL("ONE_LEVEL"),
  
  THREE_LEVEL("THREE_LEVEL"),
  
  TWO_LEVEL("TWO_LEVEL");

  private String value;

  ToolsAdminInfoV2SubDistrict(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdminInfoV2SubDistrict fromValue(String value) {
    for (ToolsAdminInfoV2SubDistrict b : ToolsAdminInfoV2SubDistrict.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdminInfoV2SubDistrict> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdminInfoV2SubDistrict enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdminInfoV2SubDistrict read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdminInfoV2SubDistrict.fromValue(value);
    }
  }
}

