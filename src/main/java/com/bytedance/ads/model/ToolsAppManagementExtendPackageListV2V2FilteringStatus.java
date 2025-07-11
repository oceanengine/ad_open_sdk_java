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
@JsonAdapter(ToolsAppManagementExtendPackageListV2V2FilteringStatus.Adapter.class)
public enum ToolsAppManagementExtendPackageListV2V2FilteringStatus {
  
  ALL("ALL"),
  
  NOT_UPDATE("NOT_UPDATE"),
  
  CREATING("CREATING"),
  
  UPDATING("UPDATING"),
  
  ENABLE("ENABLE"),
  
  CREATION_FAILED("CREATION_FAILED"),
  
  UPDATE_FAILED("UPDATE_FAILED"),
  
  PUBLISHED("PUBLISHED");

  private String value;

  ToolsAppManagementExtendPackageListV2V2FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementExtendPackageListV2V2FilteringStatus fromValue(String value) {
    for (ToolsAppManagementExtendPackageListV2V2FilteringStatus b : ToolsAppManagementExtendPackageListV2V2FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementExtendPackageListV2V2FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementExtendPackageListV2V2FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementExtendPackageListV2V2FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementExtendPackageListV2V2FilteringStatus.fromValue(value);
    }
  }
}

