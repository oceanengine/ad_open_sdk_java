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
@JsonAdapter(SecurityOpenMaterialAuditV30BusinessType.Adapter.class)
public enum SecurityOpenMaterialAuditV30BusinessType {
  
  AD("AD"),
  
  QIAN_CHUAN("QIAN_CHUAN"),
  
  LOCAL_LIFE("LOCAL_LIFE");

  private String value;

  SecurityOpenMaterialAuditV30BusinessType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SecurityOpenMaterialAuditV30BusinessType fromValue(String value) {
    for (SecurityOpenMaterialAuditV30BusinessType b : SecurityOpenMaterialAuditV30BusinessType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SecurityOpenMaterialAuditV30BusinessType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SecurityOpenMaterialAuditV30BusinessType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SecurityOpenMaterialAuditV30BusinessType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SecurityOpenMaterialAuditV30BusinessType.fromValue(value);
    }
  }
}

