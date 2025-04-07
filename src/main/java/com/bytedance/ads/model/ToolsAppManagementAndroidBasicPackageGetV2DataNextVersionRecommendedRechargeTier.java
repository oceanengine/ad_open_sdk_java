/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionRecommendedRechargeTier.Adapter.class)
public enum ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionRecommendedRechargeTier {
  
  ABOVE_200("ABOVE_200"),
  
  FROM_100_TO_200("FROM_100_TO_200"),
  
  FROM_FIFTY_TO_HUNDRED("FROM_FIFTY_TO_HUNDRED"),
  
  FROM_ONE_TO_FIFTY("FROM_ONE_TO_FIFTY");

  private String value;

  ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionRecommendedRechargeTier(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionRecommendedRechargeTier fromValue(String value) {
    for (ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionRecommendedRechargeTier b : ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionRecommendedRechargeTier.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionRecommendedRechargeTier> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionRecommendedRechargeTier enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionRecommendedRechargeTier read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementAndroidBasicPackageGetV2DataNextVersionRecommendedRechargeTier.fromValue(value);
    }
  }
}

