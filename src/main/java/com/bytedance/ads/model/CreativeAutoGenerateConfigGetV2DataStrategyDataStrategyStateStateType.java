/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
@JsonAdapter(CreativeAutoGenerateConfigGetV2DataStrategyDataStrategyStateStateType.Adapter.class)
public enum CreativeAutoGenerateConfigGetV2DataStrategyDataStrategyStateStateType {
  
  IMAGE("Image"),
  
  TEXT("Text");

  private String value;

  CreativeAutoGenerateConfigGetV2DataStrategyDataStrategyStateStateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeAutoGenerateConfigGetV2DataStrategyDataStrategyStateStateType fromValue(String value) {
    for (CreativeAutoGenerateConfigGetV2DataStrategyDataStrategyStateStateType b : CreativeAutoGenerateConfigGetV2DataStrategyDataStrategyStateStateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeAutoGenerateConfigGetV2DataStrategyDataStrategyStateStateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeAutoGenerateConfigGetV2DataStrategyDataStrategyStateStateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeAutoGenerateConfigGetV2DataStrategyDataStrategyStateStateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeAutoGenerateConfigGetV2DataStrategyDataStrategyStateStateType.fromValue(value);
    }
  }
}
