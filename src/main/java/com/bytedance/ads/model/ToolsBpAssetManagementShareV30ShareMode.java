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
@JsonAdapter(ToolsBpAssetManagementShareV30ShareMode.Adapter.class)
public enum ToolsBpAssetManagementShareV30ShareMode {
  
  BP_ALL_ACCOUNTS("BP_ALL_ACCOUNTS"),
  
  COMPANY_ALL_ACCOUNTS("COMPANY_ALL_ACCOUNTS"),
  
  PART("PART");

  private String value;

  ToolsBpAssetManagementShareV30ShareMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBpAssetManagementShareV30ShareMode fromValue(String value) {
    for (ToolsBpAssetManagementShareV30ShareMode b : ToolsBpAssetManagementShareV30ShareMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBpAssetManagementShareV30ShareMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBpAssetManagementShareV30ShareMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBpAssetManagementShareV30ShareMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBpAssetManagementShareV30ShareMode.fromValue(value);
    }
  }
}

