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
@JsonAdapter(ToolsAwemeBannedCreateV30BannedType.Adapter.class)
public enum ToolsAwemeBannedCreateV30BannedType {
  
  AWEME_TYPE("AWEME_TYPE"),
  
  CUSTOM_TYPE("CUSTOM_TYPE");

  private String value;

  ToolsAwemeBannedCreateV30BannedType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAwemeBannedCreateV30BannedType fromValue(String value) {
    for (ToolsAwemeBannedCreateV30BannedType b : ToolsAwemeBannedCreateV30BannedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAwemeBannedCreateV30BannedType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAwemeBannedCreateV30BannedType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAwemeBannedCreateV30BannedType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAwemeBannedCreateV30BannedType.fromValue(value);
    }
  }
}

