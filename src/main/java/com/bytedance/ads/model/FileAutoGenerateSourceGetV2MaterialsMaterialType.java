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
@JsonAdapter(FileAutoGenerateSourceGetV2MaterialsMaterialType.Adapter.class)
public enum FileAutoGenerateSourceGetV2MaterialsMaterialType {
  
  VIDEO("video"),
  
  IMAGE("image");

  private String value;

  FileAutoGenerateSourceGetV2MaterialsMaterialType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileAutoGenerateSourceGetV2MaterialsMaterialType fromValue(String value) {
    for (FileAutoGenerateSourceGetV2MaterialsMaterialType b : FileAutoGenerateSourceGetV2MaterialsMaterialType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileAutoGenerateSourceGetV2MaterialsMaterialType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileAutoGenerateSourceGetV2MaterialsMaterialType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileAutoGenerateSourceGetV2MaterialsMaterialType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileAutoGenerateSourceGetV2MaterialsMaterialType.fromValue(value);
    }
  }
}

