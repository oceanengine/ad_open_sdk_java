/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(ToolsAppManagementAndroidBasicPackageUpdateV2MinRechargeTier.Adapter.class)
public enum ToolsAppManagementAndroidBasicPackageUpdateV2MinRechargeTier {
  
  Enum_100_TO_200("FROM_100_TO_200"),
  
  FIFTY_TO_HUNDRED("FROM_FIFTY_TO_HUNDRED"),
  
  ONE_TO_FIFTY("FROM_ONE_TO_FIFTY");

  private String value;

  ToolsAppManagementAndroidBasicPackageUpdateV2MinRechargeTier(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementAndroidBasicPackageUpdateV2MinRechargeTier fromValue(String value) {
    for (ToolsAppManagementAndroidBasicPackageUpdateV2MinRechargeTier b : ToolsAppManagementAndroidBasicPackageUpdateV2MinRechargeTier.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementAndroidBasicPackageUpdateV2MinRechargeTier> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementAndroidBasicPackageUpdateV2MinRechargeTier enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementAndroidBasicPackageUpdateV2MinRechargeTier read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementAndroidBasicPackageUpdateV2MinRechargeTier.fromValue(value);
    }
  }
}

