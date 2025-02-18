/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
@JsonAdapter(EnterpriseCommentListGetV10FilterEmotion.Adapter.class)
public enum EnterpriseCommentListGetV10FilterEmotion {
  
  ANY_EMOTION("ANY_EMOTION"),
  
  POS_EMOTION("POS_EMOTION"),
  
  NEG_EMOTION("NEG_EMOTION"),
  
  NEU_EMOTION("NEU_EMOTION");

  private String value;

  EnterpriseCommentListGetV10FilterEmotion(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnterpriseCommentListGetV10FilterEmotion fromValue(String value) {
    for (EnterpriseCommentListGetV10FilterEmotion b : EnterpriseCommentListGetV10FilterEmotion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnterpriseCommentListGetV10FilterEmotion> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnterpriseCommentListGetV10FilterEmotion enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnterpriseCommentListGetV10FilterEmotion read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnterpriseCommentListGetV10FilterEmotion.fromValue(value);
    }
  }
}

