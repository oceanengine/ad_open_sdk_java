/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes.Adapter.class)
public enum FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes {
  
  INEFFICIENT_MATERIAL("INEFFICIENT_MATERIAL"),
  
  SIMILAR_MATERIAL("SIMILAR_MATERIAL"),
  
  SIMILAR_QUEUE_MATERIAL("SIMILAR_QUEUE_MATERIAL");

  private String value;

  FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes fromValue(String value) {
    for (FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes b : FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes.fromValue(value);
    }
  }
}

