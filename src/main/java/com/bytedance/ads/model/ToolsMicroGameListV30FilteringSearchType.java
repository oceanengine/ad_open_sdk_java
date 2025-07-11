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
@JsonAdapter(ToolsMicroGameListV30FilteringSearchType.Adapter.class)
public enum ToolsMicroGameListV30FilteringSearchType {
  
  CREATE_ONLY("CREATE_ONLY"),
  
  SHARE_ONLY("SHARE_ONLY");

  private String value;

  ToolsMicroGameListV30FilteringSearchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsMicroGameListV30FilteringSearchType fromValue(String value) {
    for (ToolsMicroGameListV30FilteringSearchType b : ToolsMicroGameListV30FilteringSearchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsMicroGameListV30FilteringSearchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsMicroGameListV30FilteringSearchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsMicroGameListV30FilteringSearchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsMicroGameListV30FilteringSearchType.fromValue(value);
    }
  }
}

