/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(ToolsAdConvertOptimizedTargetGetV2ConvertType.Adapter.class)
public enum ToolsAdConvertOptimizedTargetGetV2ConvertType {
  
  SOURCE_TYPE_SDK("AD_CONVERT_SOURCE_TYPE_SDK"),
  
  SOURCE_TYPE_XPATH("AD_CONVERT_SOURCE_TYPE_XPATH"),
  
  SOURCE_TYPE_MULTI_CONVERT("AD_CONVERT_SOURCE_TYPE_MULTI_CONVERT"),
  
  TYPE_MICRO_APP_SDK("AD_CONVERT_TYPE_MICRO_APP_SDK"),
  
  TYPE_NATIVE_PROMOTION("AD_CONVERT_TYPE_NATIVE_PROMOTION"),
  
  SOURCE_TYPE_JS("AD_CONVERT_SOURCE_TYPE_JS"),
  
  SOURCE_TYPE_NORMAL_APP_DOWNLOAD("AD_CONVERT_SOURCE_TYPE_NORMAL_APP_DOWNLOAD"),
  
  SOURCE_TYPE_INTERNAL("AD_CONVERT_SOURCE_TYPE_INTERNAL"),
  
  SOURCE_TYPE_APP_API_TEMAI("AD_CONVERT_SOURCE_TYPE_APP_API_TEMAI"),
  
  TYPE_MICRO_APP_API("AD_CONVERT_TYPE_MICRO_APP_API"),
  
  SOURCE_TYPE_H5_API("AD_CONVERT_SOURCE_TYPE_H5_API"),
  
  SOURCE_TYPE_APP_DOWNLOAD("AD_CONVERT_SOURCE_TYPE_APP_DOWNLOAD"),
  
  SOURCE_TYPE_API("AD_CONVERT_SOURCE_TYPE_API"),
  
  SOURCE_TYPE_CONFIG("AD_CONVERT_SOURCE_TYPE_CONFIG"),
  
  SOURCE_TYPE_CPS_GAME("AD_CONVERT_SOURCE_TYPE_CPS_GAME"),
  
  SOURCE_TYPE_OPEN_URL("AD_CONVERT_SOURCE_TYPE_OPEN_URL");

  private String value;

  ToolsAdConvertOptimizedTargetGetV2ConvertType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdConvertOptimizedTargetGetV2ConvertType fromValue(String value) {
    for (ToolsAdConvertOptimizedTargetGetV2ConvertType b : ToolsAdConvertOptimizedTargetGetV2ConvertType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdConvertOptimizedTargetGetV2ConvertType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdConvertOptimizedTargetGetV2ConvertType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdConvertOptimizedTargetGetV2ConvertType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdConvertOptimizedTargetGetV2ConvertType.fromValue(value);
    }
  }
}

