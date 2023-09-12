/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
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
@JsonAdapter(ToolsAdminInfoV2Language.Adapter.class)
public enum ToolsAdminInfoV2Language {
  
  CN("ZH_CN"),
  
  CN_GOV("ZH_CN_GOV");

  private String value;

  ToolsAdminInfoV2Language(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdminInfoV2Language fromValue(String value) {
    for (ToolsAdminInfoV2Language b : ToolsAdminInfoV2Language.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdminInfoV2Language> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdminInfoV2Language enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdminInfoV2Language read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdminInfoV2Language.fromValue(value);
    }
  }
}

