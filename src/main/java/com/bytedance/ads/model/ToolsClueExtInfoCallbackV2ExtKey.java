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
@JsonAdapter(ToolsClueExtInfoCallbackV2ExtKey.Adapter.class)
public enum ToolsClueExtInfoCallbackV2ExtKey {
  
  BUSINESS_STATE("BUSINESS_STATE"),
  
  CLUE_INTENTION("CLUE_INTENTION"),
  
  CLUE_TAGS("CLUE_TAGS"),
  
  CLUE_VALIDITY("CLUE_VALIDITY"),
  
  COMMUNICATION_STATE("COMMUNICATION_STATE"),
  
  CUSTOMER_STATE("CUSTOMER_STATE"),
  
  CUSTOMER_TAGS("CUSTOMER_TAGS"),
  
  ORDER_STATE("ORDER_STATE");

  private String value;

  ToolsClueExtInfoCallbackV2ExtKey(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueExtInfoCallbackV2ExtKey fromValue(String value) {
    for (ToolsClueExtInfoCallbackV2ExtKey b : ToolsClueExtInfoCallbackV2ExtKey.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsClueExtInfoCallbackV2ExtKey> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueExtInfoCallbackV2ExtKey enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueExtInfoCallbackV2ExtKey read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsClueExtInfoCallbackV2ExtKey.fromValue(value);
    }
  }
}

