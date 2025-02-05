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
@JsonAdapter(LocalFileVideoUploadTaskListV30DataListStatus.Adapter.class)
public enum LocalFileVideoUploadTaskListV30DataListStatus {
  
  PROCESS("PROCESS"),
  
  SUCCESS("SUCCESS"),
  
  FAILED("FAILED");

  private String value;

  LocalFileVideoUploadTaskListV30DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalFileVideoUploadTaskListV30DataListStatus fromValue(String value) {
    for (LocalFileVideoUploadTaskListV30DataListStatus b : LocalFileVideoUploadTaskListV30DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalFileVideoUploadTaskListV30DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalFileVideoUploadTaskListV30DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalFileVideoUploadTaskListV30DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalFileVideoUploadTaskListV30DataListStatus.fromValue(value);
    }
  }
}

