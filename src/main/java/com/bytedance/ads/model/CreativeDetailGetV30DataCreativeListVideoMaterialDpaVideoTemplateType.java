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
@JsonAdapter(CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType.Adapter.class)
public enum CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType {
  
  CUSTOM("DPA_VIDEO_TEMPLATE_CUSTOM"),
  
  DEPRECATED("DPA_VIDEO_TEMPLATE_DEPRECATED"),
  
  SMART("DPA_VIDEO_TEMPLATE_SMART");

  private String value;

  CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType fromValue(String value) {
    for (CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType b : CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType.fromValue(value);
    }
  }
}

