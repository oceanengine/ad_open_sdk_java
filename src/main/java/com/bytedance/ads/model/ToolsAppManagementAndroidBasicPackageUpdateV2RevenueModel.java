/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(ToolsAppManagementAndroidBasicPackageUpdateV2RevenueModel.Adapter.class)
public enum ToolsAppManagementAndroidBasicPackageUpdateV2RevenueModel {
  
  IAA("IAA"),
  
  IAAP("IAAP"),
  
  IAP("IAP");

  private String value;

  ToolsAppManagementAndroidBasicPackageUpdateV2RevenueModel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementAndroidBasicPackageUpdateV2RevenueModel fromValue(String value) {
    for (ToolsAppManagementAndroidBasicPackageUpdateV2RevenueModel b : ToolsAppManagementAndroidBasicPackageUpdateV2RevenueModel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementAndroidBasicPackageUpdateV2RevenueModel> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementAndroidBasicPackageUpdateV2RevenueModel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementAndroidBasicPackageUpdateV2RevenueModel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementAndroidBasicPackageUpdateV2RevenueModel.fromValue(value);
    }
  }
}

