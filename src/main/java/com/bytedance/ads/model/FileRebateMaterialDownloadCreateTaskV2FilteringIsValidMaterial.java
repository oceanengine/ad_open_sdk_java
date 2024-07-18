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
@JsonAdapter(FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial.Adapter.class)
public enum FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial {
  
  NO("NO"),
  
  YES("YES");

  private String value;

  FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial fromValue(String value) {
    for (FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial b : FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial.fromValue(value);
    }
  }
}

