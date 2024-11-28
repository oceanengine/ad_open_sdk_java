/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(CreativeProceduralCreativeUpdateV2CreativeVideoMaterialsDpaVideoTemplateType.Adapter.class)
public enum CreativeProceduralCreativeUpdateV2CreativeVideoMaterialsDpaVideoTemplateType {
  
  SMART("DPA_VIDEO_TEMPLATE_SMART"),
  
  DEPRECATED("DPA_VIDEO_TEMPLATE_DEPRECATED"),
  
  CUSTOM("DPA_VIDEO_TEMPLATE_CUSTOM");

  private String value;

  CreativeProceduralCreativeUpdateV2CreativeVideoMaterialsDpaVideoTemplateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeProceduralCreativeUpdateV2CreativeVideoMaterialsDpaVideoTemplateType fromValue(String value) {
    for (CreativeProceduralCreativeUpdateV2CreativeVideoMaterialsDpaVideoTemplateType b : CreativeProceduralCreativeUpdateV2CreativeVideoMaterialsDpaVideoTemplateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeProceduralCreativeUpdateV2CreativeVideoMaterialsDpaVideoTemplateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeProceduralCreativeUpdateV2CreativeVideoMaterialsDpaVideoTemplateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeProceduralCreativeUpdateV2CreativeVideoMaterialsDpaVideoTemplateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeProceduralCreativeUpdateV2CreativeVideoMaterialsDpaVideoTemplateType.fromValue(value);
    }
  }
}

