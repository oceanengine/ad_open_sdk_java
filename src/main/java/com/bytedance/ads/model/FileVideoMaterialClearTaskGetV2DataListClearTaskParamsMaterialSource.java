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
@JsonAdapter(FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource.Adapter.class)
public enum FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource {
  
  AD("AD"),
  
  QIANCHUAN("QIANCHUAN");

  private String value;

  FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource fromValue(String value) {
    for (FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource b : FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource.fromValue(value);
    }
  }
}

