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
@JsonAdapter(FilePreauditSubmitV30MaterialChannel.Adapter.class)
public enum FilePreauditSubmitV30MaterialChannel {
  
  AD("AD"),
  
  DOU_PLUS("DOU_PLUS"),
  
  QC("QC");

  private String value;

  FilePreauditSubmitV30MaterialChannel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FilePreauditSubmitV30MaterialChannel fromValue(String value) {
    for (FilePreauditSubmitV30MaterialChannel b : FilePreauditSubmitV30MaterialChannel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FilePreauditSubmitV30MaterialChannel> {
    @Override
    public void write(final JsonWriter jsonWriter, final FilePreauditSubmitV30MaterialChannel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FilePreauditSubmitV30MaterialChannel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FilePreauditSubmitV30MaterialChannel.fromValue(value);
    }
  }
}

