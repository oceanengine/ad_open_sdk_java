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
@JsonAdapter(DouplusOrderListV30DataOrderListOrderSceneType.Adapter.class)
public enum DouplusOrderListV30DataOrderListOrderSceneType {
  
  LIVE("LIVE"),
  
  VIDEO("VIDEO");

  private String value;

  DouplusOrderListV30DataOrderListOrderSceneType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DouplusOrderListV30DataOrderListOrderSceneType fromValue(String value) {
    for (DouplusOrderListV30DataOrderListOrderSceneType b : DouplusOrderListV30DataOrderListOrderSceneType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DouplusOrderListV30DataOrderListOrderSceneType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DouplusOrderListV30DataOrderListOrderSceneType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DouplusOrderListV30DataOrderListOrderSceneType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DouplusOrderListV30DataOrderListOrderSceneType.fromValue(value);
    }
  }
}

