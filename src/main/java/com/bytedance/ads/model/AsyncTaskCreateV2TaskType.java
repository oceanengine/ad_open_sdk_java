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
@JsonAdapter(AsyncTaskCreateV2TaskType.Adapter.class)
public enum AsyncTaskCreateV2TaskType {
  
  REPORT("REPORT"),
  
  REPORT_DPA("REPORT_DPA"),
  
  REPORT_BIDWORD("REPORT_BIDWORD");

  private String value;

  AsyncTaskCreateV2TaskType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AsyncTaskCreateV2TaskType fromValue(String value) {
    for (AsyncTaskCreateV2TaskType b : AsyncTaskCreateV2TaskType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AsyncTaskCreateV2TaskType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AsyncTaskCreateV2TaskType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AsyncTaskCreateV2TaskType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AsyncTaskCreateV2TaskType.fromValue(value);
    }
  }
}

