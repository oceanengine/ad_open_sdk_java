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
@JsonAdapter(AicElementUploadV30DataElementListUseAs.Adapter.class)
public enum AicElementUploadV30DataElementListUseAs {
  
  BACKGROUND("BACKGROUND"),
  
  FOREGROUND("FOREGROUND"),
  
  POST_VIDEO("POST_VIDEO"),
  
  PRE_VIDEO("PRE_VIDEO"),
  
  RAW("RAW");

  private String value;

  AicElementUploadV30DataElementListUseAs(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AicElementUploadV30DataElementListUseAs fromValue(String value) {
    for (AicElementUploadV30DataElementListUseAs b : AicElementUploadV30DataElementListUseAs.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AicElementUploadV30DataElementListUseAs> {
    @Override
    public void write(final JsonWriter jsonWriter, final AicElementUploadV30DataElementListUseAs enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AicElementUploadV30DataElementListUseAs read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AicElementUploadV30DataElementListUseAs.fromValue(value);
    }
  }
}

