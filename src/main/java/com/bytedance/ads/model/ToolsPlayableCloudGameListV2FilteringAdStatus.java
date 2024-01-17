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
@JsonAdapter(ToolsPlayableCloudGameListV2FilteringAdStatus.Adapter.class)
public enum ToolsPlayableCloudGameListV2FilteringAdStatus {
  
  INUSE("INUSE"),
  
  DELETE("DELETE"),
  
  UNUSED("UNUSED");

  private String value;

  ToolsPlayableCloudGameListV2FilteringAdStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPlayableCloudGameListV2FilteringAdStatus fromValue(String value) {
    for (ToolsPlayableCloudGameListV2FilteringAdStatus b : ToolsPlayableCloudGameListV2FilteringAdStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsPlayableCloudGameListV2FilteringAdStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPlayableCloudGameListV2FilteringAdStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPlayableCloudGameListV2FilteringAdStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPlayableCloudGameListV2FilteringAdStatus.fromValue(value);
    }
  }
}

