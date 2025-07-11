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
@JsonAdapter(NativeAnchorGetV30DataListAnchorShareType.Adapter.class)
public enum NativeAnchorGetV30DataListAnchorShareType {
  
  OWN_ANCHOR("OWN_ANCHOR"),
  
  SHARE_ANCHOR("SHARE_ANCHOR");

  private String value;

  NativeAnchorGetV30DataListAnchorShareType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorGetV30DataListAnchorShareType fromValue(String value) {
    for (NativeAnchorGetV30DataListAnchorShareType b : NativeAnchorGetV30DataListAnchorShareType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NativeAnchorGetV30DataListAnchorShareType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorGetV30DataListAnchorShareType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorGetV30DataListAnchorShareType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorGetV30DataListAnchorShareType.fromValue(value);
    }
  }
}

