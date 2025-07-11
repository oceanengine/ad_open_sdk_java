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
@JsonAdapter(DpaDetailGetV2DataListSpuSource.Adapter.class)
public enum DpaDetailGetV2DataListSpuSource {
  
  YUNTU_SPU("YUNTU_SPU"),
  
  OUTER_PLATFORM_SPU("OUTER_PLATFORM_SPU"),
  
  WITHOUT_SPU("WITHOUT_SPU");

  private String value;

  DpaDetailGetV2DataListSpuSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaDetailGetV2DataListSpuSource fromValue(String value) {
    for (DpaDetailGetV2DataListSpuSource b : DpaDetailGetV2DataListSpuSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DpaDetailGetV2DataListSpuSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaDetailGetV2DataListSpuSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaDetailGetV2DataListSpuSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaDetailGetV2DataListSpuSource.fromValue(value);
    }
  }
}

