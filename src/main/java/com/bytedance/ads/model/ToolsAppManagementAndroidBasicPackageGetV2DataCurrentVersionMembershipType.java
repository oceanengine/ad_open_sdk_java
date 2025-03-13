/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType.Adapter.class)
public enum ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType {
  
  ANNUAL("ANNUAL"),
  
  LIFETIME("LIFETIME"),
  
  MONTHLY("MONTHLY"),
  
  NONE("NONE"),
  
  WEEKLY_DAILY("WEEKLY_DAILY");

  private String value;

  ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType fromValue(String value) {
    for (ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType b : ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType.fromValue(value);
    }
  }
}

