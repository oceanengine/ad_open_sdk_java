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
@JsonAdapter(ToolsAppManagementUploadTaskCreateV2AccountType.Adapter.class)
public enum ToolsAppManagementUploadTaskCreateV2AccountType {
  
  AD("AD"),
  
  BP("BP");

  private String value;

  ToolsAppManagementUploadTaskCreateV2AccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementUploadTaskCreateV2AccountType fromValue(String value) {
    for (ToolsAppManagementUploadTaskCreateV2AccountType b : ToolsAppManagementUploadTaskCreateV2AccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementUploadTaskCreateV2AccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementUploadTaskCreateV2AccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementUploadTaskCreateV2AccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementUploadTaskCreateV2AccountType.fromValue(value);
    }
  }
}

