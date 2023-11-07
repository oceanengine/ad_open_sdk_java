/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
@JsonAdapter(ClueWechatInstanceDetailV2DataWechatListWechatType.Adapter.class)
public enum ClueWechatInstanceDetailV2DataWechatListWechatType {
  
  PERSONAL("PERSONAL"),
  
  PUBLIC("PUBLIC"),
  
  ENTERPRISE("ENTERPRISE");

  private String value;

  ClueWechatInstanceDetailV2DataWechatListWechatType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueWechatInstanceDetailV2DataWechatListWechatType fromValue(String value) {
    for (ClueWechatInstanceDetailV2DataWechatListWechatType b : ClueWechatInstanceDetailV2DataWechatListWechatType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ClueWechatInstanceDetailV2DataWechatListWechatType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueWechatInstanceDetailV2DataWechatListWechatType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueWechatInstanceDetailV2DataWechatListWechatType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueWechatInstanceDetailV2DataWechatListWechatType.fromValue(value);
    }
  }
}

