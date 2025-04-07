/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(ToolsPlayableValidateV2DataStatus.Adapter.class)
public enum ToolsPlayableValidateV2DataStatus {
  
  AUDIT_FAIL("AUDIT_FAIL"),
  
  AUDIT_SUCCESS("AUDIT_SUCCESS"),
  
  VALIDATE_FAIL("VALIDATE_FAIL"),
  
  VALIDATE_SUCCESS("VALIDATE_SUCCESS"),
  
  VALIDATING("VALIDATING");

  private String value;

  ToolsPlayableValidateV2DataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPlayableValidateV2DataStatus fromValue(String value) {
    for (ToolsPlayableValidateV2DataStatus b : ToolsPlayableValidateV2DataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsPlayableValidateV2DataStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPlayableValidateV2DataStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPlayableValidateV2DataStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPlayableValidateV2DataStatus.fromValue(value);
    }
  }
}

