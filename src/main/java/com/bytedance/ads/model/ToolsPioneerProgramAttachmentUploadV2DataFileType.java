/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(ToolsPioneerProgramAttachmentUploadV2DataFileType.Adapter.class)
public enum ToolsPioneerProgramAttachmentUploadV2DataFileType {
  
  AD_SETTING_DATA("AD_SETTING_DATA"),
  
  BASIC_STAT_DATA("BASIC_STAT_DATA"),
  
  DEEP_STAT_DAILY_DATA("DEEP_STAT_DAILY_DATA"),
  
  DEEP_STAT_HOURLY_DATA("DEEP_STAT_HOURLY_DATA"),
  
  MATERIAL_MAPPING_DATA("MATERIAL_MAPPING_DATA");

  private String value;

  ToolsPioneerProgramAttachmentUploadV2DataFileType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPioneerProgramAttachmentUploadV2DataFileType fromValue(String value) {
    for (ToolsPioneerProgramAttachmentUploadV2DataFileType b : ToolsPioneerProgramAttachmentUploadV2DataFileType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsPioneerProgramAttachmentUploadV2DataFileType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPioneerProgramAttachmentUploadV2DataFileType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPioneerProgramAttachmentUploadV2DataFileType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPioneerProgramAttachmentUploadV2DataFileType.fromValue(value);
    }
  }
}

