/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType.Adapter.class)
public enum ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType {
  
  ANIMATION("Animation"),
  
  ARTISTIC("Artistic"),
  
  FILM("Film"),
  
  LITERARY("Literary"),
  
  NONE("None"),
  
  OTHERS("Others");

  private String value;

  ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType fromValue(String value) {
    for (ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType b : ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType.fromValue(value);
    }
  }
}

