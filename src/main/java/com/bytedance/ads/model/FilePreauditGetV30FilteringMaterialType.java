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
@JsonAdapter(FilePreauditGetV30FilteringMaterialType.Adapter.class)
public enum FilePreauditGetV30FilteringMaterialType {
  
  VIDEO("VIDEO");

  private String value;

  FilePreauditGetV30FilteringMaterialType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FilePreauditGetV30FilteringMaterialType fromValue(String value) {
    for (FilePreauditGetV30FilteringMaterialType b : FilePreauditGetV30FilteringMaterialType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FilePreauditGetV30FilteringMaterialType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FilePreauditGetV30FilteringMaterialType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FilePreauditGetV30FilteringMaterialType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FilePreauditGetV30FilteringMaterialType.fromValue(value);
    }
  }
}

