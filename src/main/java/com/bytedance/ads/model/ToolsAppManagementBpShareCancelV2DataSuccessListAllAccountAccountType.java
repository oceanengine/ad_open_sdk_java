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
@JsonAdapter(ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType.Adapter.class)
public enum ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType {
  
  STAR("STAR"),
  
  BP("BP"),
  
  AD("AD");

  private String value;

  ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType fromValue(String value) {
    for (ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType b : ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType.fromValue(value);
    }
  }
}

