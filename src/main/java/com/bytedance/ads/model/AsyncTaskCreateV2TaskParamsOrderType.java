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
@JsonAdapter(AsyncTaskCreateV2TaskParamsOrderType.Adapter.class)
public enum AsyncTaskCreateV2TaskParamsOrderType {
  
  ASC("ASC"),
  
  DESC("DESC");

  private String value;

  AsyncTaskCreateV2TaskParamsOrderType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AsyncTaskCreateV2TaskParamsOrderType fromValue(String value) {
    for (AsyncTaskCreateV2TaskParamsOrderType b : AsyncTaskCreateV2TaskParamsOrderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AsyncTaskCreateV2TaskParamsOrderType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AsyncTaskCreateV2TaskParamsOrderType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AsyncTaskCreateV2TaskParamsOrderType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AsyncTaskCreateV2TaskParamsOrderType.fromValue(value);
    }
  }
}

