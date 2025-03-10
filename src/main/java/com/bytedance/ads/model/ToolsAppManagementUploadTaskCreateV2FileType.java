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
@JsonAdapter(ToolsAppManagementUploadTaskCreateV2FileType.Adapter.class)
public enum ToolsAppManagementUploadTaskCreateV2FileType {
  
  APK("APK"),
  
  IMAGE("IMAGE"),
  
  VIDEO("VIDEO");

  private String value;

  ToolsAppManagementUploadTaskCreateV2FileType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementUploadTaskCreateV2FileType fromValue(String value) {
    for (ToolsAppManagementUploadTaskCreateV2FileType b : ToolsAppManagementUploadTaskCreateV2FileType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementUploadTaskCreateV2FileType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementUploadTaskCreateV2FileType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementUploadTaskCreateV2FileType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementUploadTaskCreateV2FileType.fromValue(value);
    }
  }
}

