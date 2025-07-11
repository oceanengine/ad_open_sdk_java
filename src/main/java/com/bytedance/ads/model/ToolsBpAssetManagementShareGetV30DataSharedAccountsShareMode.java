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
@JsonAdapter(ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode.Adapter.class)
public enum ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode {
  
  BP_ALL_ACCOUNTS("BP_ALL_ACCOUNTS"),
  
  COMPANY_ALL_ACCOUNTS("COMPANY_ALL_ACCOUNTS"),
  
  PART("PART");

  private String value;

  ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode fromValue(String value) {
    for (ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode b : ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBpAssetManagementShareGetV30DataSharedAccountsShareMode.fromValue(value);
    }
  }
}

