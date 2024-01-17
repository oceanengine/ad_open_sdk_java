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
@JsonAdapter(ToolsBpAssetManagementShareGetV30AssetType.Adapter.class)
public enum ToolsBpAssetManagementShareGetV30AssetType {
  
  APPLETS("APPLETS"),
  
  BYTED_APPLETS("BYTED_APPLETS"),
  
  BYTED_GAME("BYTED_GAME"),
  
  WECHAT_GAME("WECHAT_GAME");

  private String value;

  ToolsBpAssetManagementShareGetV30AssetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBpAssetManagementShareGetV30AssetType fromValue(String value) {
    for (ToolsBpAssetManagementShareGetV30AssetType b : ToolsBpAssetManagementShareGetV30AssetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBpAssetManagementShareGetV30AssetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBpAssetManagementShareGetV30AssetType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBpAssetManagementShareGetV30AssetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBpAssetManagementShareGetV30AssetType.fromValue(value);
    }
  }
}

