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
@JsonAdapter(ToolsPlayableListGetV2Status.Adapter.class)
public enum ToolsPlayableListGetV2Status {
  
  VALIDATING("VALIDATING"),
  
  VALIDATE_SUCCESS("VALIDATE_SUCCESS"),
  
  AUDIT_SUCCESS("AUDIT_SUCCESS"),
  
  VALIDATE_FAIL("VALIDATE_FAIL"),
  
  AUDIT_FAIL("AUDIT_FAIL");

  private String value;

  ToolsPlayableListGetV2Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPlayableListGetV2Status fromValue(String value) {
    for (ToolsPlayableListGetV2Status b : ToolsPlayableListGetV2Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsPlayableListGetV2Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPlayableListGetV2Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPlayableListGetV2Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPlayableListGetV2Status.fromValue(value);
    }
  }
}

