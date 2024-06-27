/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(ToolsLiveAuthorizeListV2Status.Adapter.class)
public enum ToolsLiveAuthorizeListV2Status {
  
  AUTHORIZE_OVERDUE("AUTHORIZE_OVERDUE"),
  
  APPLY_OVERDUE("APPLY_OVERDUE"),
  
  AUTHORIZING("AUTHORIZING"),
  
  APPLYING("APPLYING");

  private String value;

  ToolsLiveAuthorizeListV2Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsLiveAuthorizeListV2Status fromValue(String value) {
    for (ToolsLiveAuthorizeListV2Status b : ToolsLiveAuthorizeListV2Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsLiveAuthorizeListV2Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsLiveAuthorizeListV2Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsLiveAuthorizeListV2Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsLiveAuthorizeListV2Status.fromValue(value);
    }
  }
}

