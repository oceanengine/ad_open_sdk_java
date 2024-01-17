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
@JsonAdapter(ToolsEventAssetsGetV2AssetType.Adapter.class)
public enum ToolsEventAssetsGetV2AssetType {
  
  THIRD_EXTERNAL("THIRD_EXTERNAL"),
  
  APP("APP"),
  
  QUICK_APP("QUICK_APP"),
  
  MINI_PROGRAME("MINI_PROGRAME");

  private String value;

  ToolsEventAssetsGetV2AssetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEventAssetsGetV2AssetType fromValue(String value) {
    for (ToolsEventAssetsGetV2AssetType b : ToolsEventAssetsGetV2AssetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEventAssetsGetV2AssetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEventAssetsGetV2AssetType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEventAssetsGetV2AssetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEventAssetsGetV2AssetType.fromValue(value);
    }
  }
}

