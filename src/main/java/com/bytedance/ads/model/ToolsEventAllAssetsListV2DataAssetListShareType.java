/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(ToolsEventAllAssetsListV2DataAssetListShareType.Adapter.class)
public enum ToolsEventAllAssetsListV2DataAssetListShareType {
  
  MY_CREATIONS("MY_CREATIONS"),
  
  SHARING("SHARING"),
  
  SHATE_EXPIRED("SHATE_EXPIRED");

  private String value;

  ToolsEventAllAssetsListV2DataAssetListShareType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEventAllAssetsListV2DataAssetListShareType fromValue(String value) {
    for (ToolsEventAllAssetsListV2DataAssetListShareType b : ToolsEventAllAssetsListV2DataAssetListShareType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsEventAllAssetsListV2DataAssetListShareType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEventAllAssetsListV2DataAssetListShareType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEventAllAssetsListV2DataAssetListShareType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEventAllAssetsListV2DataAssetListShareType.fromValue(value);
    }
  }
}

