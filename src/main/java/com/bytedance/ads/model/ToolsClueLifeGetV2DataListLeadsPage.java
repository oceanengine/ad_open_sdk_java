/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(ToolsClueLifeGetV2DataListLeadsPage.Adapter.class)
public enum ToolsClueLifeGetV2DataListLeadsPage {
  
  POI("POI"),
  
  PRODUCT_DETAIL("PRODUCT_DETAIL"),
  
  OTHER("OTHER");

  private String value;

  ToolsClueLifeGetV2DataListLeadsPage(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueLifeGetV2DataListLeadsPage fromValue(String value) {
    for (ToolsClueLifeGetV2DataListLeadsPage b : ToolsClueLifeGetV2DataListLeadsPage.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsClueLifeGetV2DataListLeadsPage> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueLifeGetV2DataListLeadsPage enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueLifeGetV2DataListLeadsPage read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsClueLifeGetV2DataListLeadsPage.fromValue(value);
    }
  }
}

