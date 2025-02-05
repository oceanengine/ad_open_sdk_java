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
@JsonAdapter(ToolsWechatAppletListV30DataListPaymentForm.Adapter.class)
public enum ToolsWechatAppletListV30DataListPaymentForm {
  
  BOTH_OPTIONS_AVAILABLE("BOTH_OPTIONS_AVAILABLE"),
  
  CONTENT_OR_SERVICES("CONTENT_OR_SERVICES"),
  
  UNLOCK_FULL_FEATURES("UNLOCK_FULL_FEATURES");

  private String value;

  ToolsWechatAppletListV30DataListPaymentForm(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatAppletListV30DataListPaymentForm fromValue(String value) {
    for (ToolsWechatAppletListV30DataListPaymentForm b : ToolsWechatAppletListV30DataListPaymentForm.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsWechatAppletListV30DataListPaymentForm> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatAppletListV30DataListPaymentForm enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatAppletListV30DataListPaymentForm read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatAppletListV30DataListPaymentForm.fromValue(value);
    }
  }
}

