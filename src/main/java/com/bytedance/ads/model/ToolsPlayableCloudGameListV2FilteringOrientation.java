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
@JsonAdapter(ToolsPlayableCloudGameListV2FilteringOrientation.Adapter.class)
public enum ToolsPlayableCloudGameListV2FilteringOrientation {
  
  HORIZONTAL("HORIZONTAL"),
  
  VERTICAL("VERTICAL");

  private String value;

  ToolsPlayableCloudGameListV2FilteringOrientation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPlayableCloudGameListV2FilteringOrientation fromValue(String value) {
    for (ToolsPlayableCloudGameListV2FilteringOrientation b : ToolsPlayableCloudGameListV2FilteringOrientation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsPlayableCloudGameListV2FilteringOrientation> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPlayableCloudGameListV2FilteringOrientation enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPlayableCloudGameListV2FilteringOrientation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPlayableCloudGameListV2FilteringOrientation.fromValue(value);
    }
  }
}

