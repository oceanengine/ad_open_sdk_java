/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(FileImageAdvertiserV2UploadType.Adapter.class)
public enum FileImageAdvertiserV2UploadType {
  
  FILE("UPLOAD_BY_FILE"),
  
  URL("UPLOAD_BY_URL");

  private String value;

  FileImageAdvertiserV2UploadType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileImageAdvertiserV2UploadType fromValue(String value) {
    for (FileImageAdvertiserV2UploadType b : FileImageAdvertiserV2UploadType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileImageAdvertiserV2UploadType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileImageAdvertiserV2UploadType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileImageAdvertiserV2UploadType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileImageAdvertiserV2UploadType.fromValue(value);
    }
  }
}

