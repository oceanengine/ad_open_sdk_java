/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(ToolsAwemeBannedDeleteV30BannedType.Adapter.class)
public enum ToolsAwemeBannedDeleteV30BannedType {
  
  AWEME_TYPE("AWEME_TYPE"),
  
  CUSTOM_TYPE("CUSTOM_TYPE");

  private String value;

  ToolsAwemeBannedDeleteV30BannedType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAwemeBannedDeleteV30BannedType fromValue(String value) {
    for (ToolsAwemeBannedDeleteV30BannedType b : ToolsAwemeBannedDeleteV30BannedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAwemeBannedDeleteV30BannedType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAwemeBannedDeleteV30BannedType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAwemeBannedDeleteV30BannedType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAwemeBannedDeleteV30BannedType.fromValue(value);
    }
  }
}

