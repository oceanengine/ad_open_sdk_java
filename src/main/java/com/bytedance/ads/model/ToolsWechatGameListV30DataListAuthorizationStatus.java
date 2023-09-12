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
@JsonAdapter(ToolsWechatGameListV30DataListAuthorizationStatus.Adapter.class)
public enum ToolsWechatGameListV30DataListAuthorizationStatus {
  
  AUTHORIZED("AUTHORIZED"),
  
  AUTHORIZATION_FAILED("AUTHORIZATION_FAILED"),
  
  UNAUTHORIZED("UNAUTHORIZED");

  private String value;

  ToolsWechatGameListV30DataListAuthorizationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatGameListV30DataListAuthorizationStatus fromValue(String value) {
    for (ToolsWechatGameListV30DataListAuthorizationStatus b : ToolsWechatGameListV30DataListAuthorizationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsWechatGameListV30DataListAuthorizationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatGameListV30DataListAuthorizationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatGameListV30DataListAuthorizationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatGameListV30DataListAuthorizationStatus.fromValue(value);
    }
  }
}

