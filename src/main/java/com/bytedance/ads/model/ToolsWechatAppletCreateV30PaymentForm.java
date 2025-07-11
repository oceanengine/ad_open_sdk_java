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
@JsonAdapter(ToolsWechatAppletCreateV30PaymentForm.Adapter.class)
public enum ToolsWechatAppletCreateV30PaymentForm {
  
  BOTH_OPTIONS_AVAILABLE("BOTH_OPTIONS_AVAILABLE"),
  
  CONTENT_OR_SERVICES("CONTENT_OR_SERVICES"),
  
  UNLOCK_FULL_FEATURES("UNLOCK_FULL_FEATURES");

  private String value;

  ToolsWechatAppletCreateV30PaymentForm(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatAppletCreateV30PaymentForm fromValue(String value) {
    for (ToolsWechatAppletCreateV30PaymentForm b : ToolsWechatAppletCreateV30PaymentForm.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsWechatAppletCreateV30PaymentForm> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatAppletCreateV30PaymentForm enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatAppletCreateV30PaymentForm read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatAppletCreateV30PaymentForm.fromValue(value);
    }
  }
}

