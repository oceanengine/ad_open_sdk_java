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
@JsonAdapter(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus.Adapter.class)
public enum ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus {
  
  ALL("ALL"),
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED"),
  
  AUDIT_DOING("AUDIT_DOING"),
  
  AUDIT_REJECTED("AUDIT_REJECTED"),
  
  ENABLE("ENABLE");

  private String value;

  ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus fromValue(String value) {
    for (ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus b : ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus.fromValue(value);
    }
  }
}

