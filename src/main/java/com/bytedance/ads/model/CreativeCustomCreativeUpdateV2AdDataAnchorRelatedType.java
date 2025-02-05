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
@JsonAdapter(CreativeCustomCreativeUpdateV2AdDataAnchorRelatedType.Adapter.class)
public enum CreativeCustomCreativeUpdateV2AdDataAnchorRelatedType {
  
  SELECT("SELECT"),
  
  AUTO("AUTO"),
  
  OFF("OFF");

  private String value;

  CreativeCustomCreativeUpdateV2AdDataAnchorRelatedType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeCustomCreativeUpdateV2AdDataAnchorRelatedType fromValue(String value) {
    for (CreativeCustomCreativeUpdateV2AdDataAnchorRelatedType b : CreativeCustomCreativeUpdateV2AdDataAnchorRelatedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeCustomCreativeUpdateV2AdDataAnchorRelatedType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeCustomCreativeUpdateV2AdDataAnchorRelatedType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeCustomCreativeUpdateV2AdDataAnchorRelatedType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeCustomCreativeUpdateV2AdDataAnchorRelatedType.fromValue(value);
    }
  }
}

