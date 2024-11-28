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
@JsonAdapter(ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag.Adapter.class)
public enum ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag {
  
  AGE_REMINDER("AGE_REMINDER"),
  
  ANTI_ADDICTION_TIPS("ANTI_ADDICTION_TIPS"),
  
  DEFAULT("DEFAULT"),
  
  MATERIAL_SCREENSHOT("MATERIAL_SCREENSHOT"),
  
  REAL_NAME_VERIFIED("REAL_NAME_VERIFIED");

  private String value;

  ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag fromValue(String value) {
    for (ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag b : ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag.fromValue(value);
    }
  }
}

