/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(StarVasGetExportBoostItemGroupResultV2DataExportStatus.Adapter.class)
public enum StarVasGetExportBoostItemGroupResultV2DataExportStatus {
  
  DOING("DOING"),
  
  FAIL("FAIL"),
  
  PREPARE("PREPARE"),
  
  SUCCESS("SUCCESS");

  private String value;

  StarVasGetExportBoostItemGroupResultV2DataExportStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarVasGetExportBoostItemGroupResultV2DataExportStatus fromValue(String value) {
    for (StarVasGetExportBoostItemGroupResultV2DataExportStatus b : StarVasGetExportBoostItemGroupResultV2DataExportStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarVasGetExportBoostItemGroupResultV2DataExportStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarVasGetExportBoostItemGroupResultV2DataExportStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarVasGetExportBoostItemGroupResultV2DataExportStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarVasGetExportBoostItemGroupResultV2DataExportStatus.fromValue(value);
    }
  }
}

