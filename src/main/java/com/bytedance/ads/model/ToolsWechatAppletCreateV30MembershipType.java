/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(ToolsWechatAppletCreateV30MembershipType.Adapter.class)
public enum ToolsWechatAppletCreateV30MembershipType {
  
  ANNUAL("ANNUAL"),
  
  LIFETIME("LIFETIME"),
  
  MONTHLY("MONTHLY"),
  
  NONE("NONE"),
  
  WEEKLY_DAILY("WEEKLY_DAILY");

  private String value;

  ToolsWechatAppletCreateV30MembershipType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatAppletCreateV30MembershipType fromValue(String value) {
    for (ToolsWechatAppletCreateV30MembershipType b : ToolsWechatAppletCreateV30MembershipType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsWechatAppletCreateV30MembershipType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatAppletCreateV30MembershipType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatAppletCreateV30MembershipType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatAppletCreateV30MembershipType.fromValue(value);
    }
  }
}

