/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(AicElementGetV30FilteringElementType.Adapter.class)
public enum AicElementGetV30FilteringElementType {
  
  FOLDER("FOLDER"),
  
  FONT("FONT"),
  
  IMAGE("IMAGE"),
  
  MUSIC("MUSIC"),
  
  VIDEO("VIDEO"),
  
  VOICE("VOICE");

  private String value;

  AicElementGetV30FilteringElementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AicElementGetV30FilteringElementType fromValue(String value) {
    for (AicElementGetV30FilteringElementType b : AicElementGetV30FilteringElementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AicElementGetV30FilteringElementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AicElementGetV30FilteringElementType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AicElementGetV30FilteringElementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AicElementGetV30FilteringElementType.fromValue(value);
    }
  }
}
