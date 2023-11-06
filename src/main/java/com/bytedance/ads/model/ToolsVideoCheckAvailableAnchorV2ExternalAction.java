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
@JsonAdapter(ToolsVideoCheckAvailableAnchorV2ExternalAction.Adapter.class)
public enum ToolsVideoCheckAvailableAnchorV2ExternalAction {
  
  ACTIVE("AD_CONVERT_TYPE_ACTIVE"),
  
  ACTIVE_REGISTER("AD_CONVERT_TYPE_ACTIVE_REGISTER"),
  
  APP_ORDER("AD_CONVERT_TYPE_APP_ORDER"),
  
  APP_PAY("AD_CONVERT_TYPE_APP_PAY"),
  
  APP_UV("AD_CONVERT_TYPE_APP_UV"),
  
  PAY("AD_CONVERT_TYPE_PAY");

  private String value;

  ToolsVideoCheckAvailableAnchorV2ExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsVideoCheckAvailableAnchorV2ExternalAction fromValue(String value) {
    for (ToolsVideoCheckAvailableAnchorV2ExternalAction b : ToolsVideoCheckAvailableAnchorV2ExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsVideoCheckAvailableAnchorV2ExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsVideoCheckAvailableAnchorV2ExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsVideoCheckAvailableAnchorV2ExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsVideoCheckAvailableAnchorV2ExternalAction.fromValue(value);
    }
  }
}

