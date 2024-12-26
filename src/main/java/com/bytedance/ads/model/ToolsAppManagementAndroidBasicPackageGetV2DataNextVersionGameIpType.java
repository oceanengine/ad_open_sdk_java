/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionGameIpType.Adapter.class)
public enum ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionGameIpType {
  
  ANIMATION("Animation"),
  
  ARTISTIC("Artistic"),
  
  FILM("Film"),
  
  LITERARY("Literary"),
  
  NONE("None"),
  
  OTHERS("Others");

  private String value;

  ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionGameIpType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionGameIpType fromValue(String value) {
    for (ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionGameIpType b : ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionGameIpType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionGameIpType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionGameIpType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionGameIpType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionGameIpType.fromValue(value);
    }
  }
}

