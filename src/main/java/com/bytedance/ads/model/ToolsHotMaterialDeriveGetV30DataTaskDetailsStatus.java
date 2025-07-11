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
@JsonAdapter(ToolsHotMaterialDeriveGetV30DataTaskDetailsStatus.Adapter.class)
public enum ToolsHotMaterialDeriveGetV30DataTaskDetailsStatus {
  
  FAILED("FAILED"),
  
  INIT("INIT"),
  
  PART_SUCCESS("PART_SUCCESS"),
  
  PPOCESSING("PPOCESSING"),
  
  SUCCESS("SUCCESS");

  private String value;

  ToolsHotMaterialDeriveGetV30DataTaskDetailsStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsHotMaterialDeriveGetV30DataTaskDetailsStatus fromValue(String value) {
    for (ToolsHotMaterialDeriveGetV30DataTaskDetailsStatus b : ToolsHotMaterialDeriveGetV30DataTaskDetailsStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsHotMaterialDeriveGetV30DataTaskDetailsStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsHotMaterialDeriveGetV30DataTaskDetailsStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsHotMaterialDeriveGetV30DataTaskDetailsStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsHotMaterialDeriveGetV30DataTaskDetailsStatus.fromValue(value);
    }
  }
}

