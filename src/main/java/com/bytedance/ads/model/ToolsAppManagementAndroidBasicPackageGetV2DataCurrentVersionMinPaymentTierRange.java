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
@JsonAdapter(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange.Adapter.class)
public enum ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange {
  
  SIX_TEN("SIX_TEN"),
  
  TEN_TWENTY("TEN_TWENTY"),
  
  TWENTY_FIFTY("TWENTY_FIFTY"),
  
  ZERO_FIVE("ZERO_FIVE");

  private String value;

  ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange fromValue(String value) {
    for (ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange b : ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange.fromValue(value);
    }
  }
}

