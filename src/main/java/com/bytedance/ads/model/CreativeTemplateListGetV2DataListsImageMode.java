/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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
@JsonAdapter(CreativeTemplateListGetV2DataListsImageMode.Adapter.class)
public enum CreativeTemplateListGetV2DataListsImageMode {
  
  HORIZONTAL("VIDEO_HORIZONTAL"),
  
  VERTICAL("VIDEO_VERTICAL");

  private String value;

  CreativeTemplateListGetV2DataListsImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeTemplateListGetV2DataListsImageMode fromValue(String value) {
    for (CreativeTemplateListGetV2DataListsImageMode b : CreativeTemplateListGetV2DataListsImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeTemplateListGetV2DataListsImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeTemplateListGetV2DataListsImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeTemplateListGetV2DataListsImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeTemplateListGetV2DataListsImageMode.fromValue(value);
    }
  }
}

