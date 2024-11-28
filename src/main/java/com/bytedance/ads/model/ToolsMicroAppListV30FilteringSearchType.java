/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(ToolsMicroAppListV30FilteringSearchType.Adapter.class)
public enum ToolsMicroAppListV30FilteringSearchType {
  
  CREATE_ONLY("CREATE_ONLY"),
  
  SHARE_ONLY("SHARE_ONLY");

  private String value;

  ToolsMicroAppListV30FilteringSearchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsMicroAppListV30FilteringSearchType fromValue(String value) {
    for (ToolsMicroAppListV30FilteringSearchType b : ToolsMicroAppListV30FilteringSearchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsMicroAppListV30FilteringSearchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsMicroAppListV30FilteringSearchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsMicroAppListV30FilteringSearchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsMicroAppListV30FilteringSearchType.fromValue(value);
    }
  }
}

