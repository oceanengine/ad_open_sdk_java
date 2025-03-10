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
@JsonAdapter(ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType.Adapter.class)
public enum ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType {
  
  ORDINARY("ORDINARY"),
  
  PREFERRED("PREFERRED");

  private String value;

  ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType fromValue(String value) {
    for (ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType b : ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBlueFlowKeywordListV30DataListBlueFlowRecommendType.fromValue(value);
    }
  }
}

