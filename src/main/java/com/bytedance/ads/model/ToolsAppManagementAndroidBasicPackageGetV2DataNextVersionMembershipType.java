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
@JsonAdapter(ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionMembershipType.Adapter.class)
public enum ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionMembershipType {
  
  ANNUAL("ANNUAL"),
  
  LIFETIME("LIFETIME"),
  
  MONTHLY("MONTHLY"),
  
  NONE("NONE"),
  
  WEEKLY_DAILY("WEEKLY_DAILY");

  private String value;

  ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionMembershipType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionMembershipType fromValue(String value) {
    for (ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionMembershipType b : ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionMembershipType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionMembershipType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionMembershipType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionMembershipType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionMembershipType.fromValue(value);
    }
  }
}

