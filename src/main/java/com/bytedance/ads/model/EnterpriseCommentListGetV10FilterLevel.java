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
@JsonAdapter(EnterpriseCommentListGetV10FilterLevel.Adapter.class)
public enum EnterpriseCommentListGetV10FilterLevel {
  
  ONE("LEVEL_ONE"),
  
  ALL("LEVEL_ALL"),
  
  TWO("LEVEL_TWO");

  private String value;

  EnterpriseCommentListGetV10FilterLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnterpriseCommentListGetV10FilterLevel fromValue(String value) {
    for (EnterpriseCommentListGetV10FilterLevel b : EnterpriseCommentListGetV10FilterLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnterpriseCommentListGetV10FilterLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnterpriseCommentListGetV10FilterLevel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnterpriseCommentListGetV10FilterLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnterpriseCommentListGetV10FilterLevel.fromValue(value);
    }
  }
}

