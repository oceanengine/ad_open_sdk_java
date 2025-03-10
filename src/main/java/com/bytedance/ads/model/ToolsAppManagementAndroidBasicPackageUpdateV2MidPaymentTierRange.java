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
@JsonAdapter(ToolsAppManagementAndroidBasicPackageUpdateV2MidPaymentTierRange.Adapter.class)
public enum ToolsAppManagementAndroidBasicPackageUpdateV2MidPaymentTierRange {
  
  ABOVE_500("ABOVE_500"),
  
  BELOW_100("BELOW_100"),
  
  FROM_100_TO_500("FROM_100_TO_500");

  private String value;

  ToolsAppManagementAndroidBasicPackageUpdateV2MidPaymentTierRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementAndroidBasicPackageUpdateV2MidPaymentTierRange fromValue(String value) {
    for (ToolsAppManagementAndroidBasicPackageUpdateV2MidPaymentTierRange b : ToolsAppManagementAndroidBasicPackageUpdateV2MidPaymentTierRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementAndroidBasicPackageUpdateV2MidPaymentTierRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementAndroidBasicPackageUpdateV2MidPaymentTierRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementAndroidBasicPackageUpdateV2MidPaymentTierRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementAndroidBasicPackageUpdateV2MidPaymentTierRange.fromValue(value);
    }
  }
}

