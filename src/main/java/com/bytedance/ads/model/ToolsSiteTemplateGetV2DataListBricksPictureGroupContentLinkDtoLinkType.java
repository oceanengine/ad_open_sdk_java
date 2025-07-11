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
@JsonAdapter(ToolsSiteTemplateGetV2DataListBricksPictureGroupContentLinkDtoLinkType.Adapter.class)
public enum ToolsSiteTemplateGetV2DataListBricksPictureGroupContentLinkDtoLinkType {
  
  QUICK_APP("QUICK_APP"),
  
  SCHEME("SCHEME"),
  
  URL("URL");

  private String value;

  ToolsSiteTemplateGetV2DataListBricksPictureGroupContentLinkDtoLinkType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsSiteTemplateGetV2DataListBricksPictureGroupContentLinkDtoLinkType fromValue(String value) {
    for (ToolsSiteTemplateGetV2DataListBricksPictureGroupContentLinkDtoLinkType b : ToolsSiteTemplateGetV2DataListBricksPictureGroupContentLinkDtoLinkType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsSiteTemplateGetV2DataListBricksPictureGroupContentLinkDtoLinkType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsSiteTemplateGetV2DataListBricksPictureGroupContentLinkDtoLinkType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsSiteTemplateGetV2DataListBricksPictureGroupContentLinkDtoLinkType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsSiteTemplateGetV2DataListBricksPictureGroupContentLinkDtoLinkType.fromValue(value);
    }
  }
}

