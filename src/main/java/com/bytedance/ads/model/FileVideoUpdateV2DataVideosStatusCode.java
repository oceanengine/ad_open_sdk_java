/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
@JsonAdapter(FileVideoUpdateV2DataVideosStatusCode.Adapter.class)
public enum FileVideoUpdateV2DataVideosStatusCode {
  
  SUCCESS("SUCCESS"),
  
  FAILURE("FAILURE"),
  
  PARTIAL_FAILURE("PARTIAL_FAILURE"),
  
  IMAGE_BINDING_EXISTED("IMAGE_BINDING_EXISTED"),
  
  VIDEO_BINDING_EXISTED("VIDEO_BINDING_EXISTED");

  private String value;

  FileVideoUpdateV2DataVideosStatusCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileVideoUpdateV2DataVideosStatusCode fromValue(String value) {
    for (FileVideoUpdateV2DataVideosStatusCode b : FileVideoUpdateV2DataVideosStatusCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileVideoUpdateV2DataVideosStatusCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileVideoUpdateV2DataVideosStatusCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileVideoUpdateV2DataVideosStatusCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileVideoUpdateV2DataVideosStatusCode.fromValue(value);
    }
  }
}

