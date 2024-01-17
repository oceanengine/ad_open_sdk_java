/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(FileMaterialAuditResultGetV2DataListMaterialType.Adapter.class)
public enum FileMaterialAuditResultGetV2DataListMaterialType {
  
  VIDEO("VIDEO"),
  
  PICTURE("PICTURE"),
  
  TITLE("TITLE");

  private String value;

  FileMaterialAuditResultGetV2DataListMaterialType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileMaterialAuditResultGetV2DataListMaterialType fromValue(String value) {
    for (FileMaterialAuditResultGetV2DataListMaterialType b : FileMaterialAuditResultGetV2DataListMaterialType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileMaterialAuditResultGetV2DataListMaterialType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileMaterialAuditResultGetV2DataListMaterialType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileMaterialAuditResultGetV2DataListMaterialType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileMaterialAuditResultGetV2DataListMaterialType.fromValue(value);
    }
  }
}

