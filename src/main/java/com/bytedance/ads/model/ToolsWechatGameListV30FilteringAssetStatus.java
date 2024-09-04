/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@JsonAdapter(ToolsWechatGameListV30FilteringAssetStatus.Adapter.class)
public enum ToolsWechatGameListV30FilteringAssetStatus {
  
  UPGRADED("UPGRADED"),
  
  ORIGINAL("ORIGINAL");

  private String value;

  ToolsWechatGameListV30FilteringAssetStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatGameListV30FilteringAssetStatus fromValue(String value) {
    for (ToolsWechatGameListV30FilteringAssetStatus b : ToolsWechatGameListV30FilteringAssetStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsWechatGameListV30FilteringAssetStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatGameListV30FilteringAssetStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatGameListV30FilteringAssetStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatGameListV30FilteringAssetStatus.fromValue(value);
    }
  }
}

