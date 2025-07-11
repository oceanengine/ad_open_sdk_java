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
@JsonAdapter(ToolsAppManagementUploadTaskListV2DataListStatus.Adapter.class)
public enum ToolsAppManagementUploadTaskListV2DataListStatus {
  
  WAITING("WAITING"),
  
  RUNNING("RUNNING"),
  
  SUCCESS("SUCCESS"),
  
  FAILED("FAILED");

  private String value;

  ToolsAppManagementUploadTaskListV2DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementUploadTaskListV2DataListStatus fromValue(String value) {
    for (ToolsAppManagementUploadTaskListV2DataListStatus b : ToolsAppManagementUploadTaskListV2DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementUploadTaskListV2DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementUploadTaskListV2DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementUploadTaskListV2DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementUploadTaskListV2DataListStatus.fromValue(value);
    }
  }
}

