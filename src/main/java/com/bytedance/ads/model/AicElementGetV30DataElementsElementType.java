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
@JsonAdapter(AicElementGetV30DataElementsElementType.Adapter.class)
public enum AicElementGetV30DataElementsElementType {
  
  FOLDER("FOLDER"),
  
  FONT("FONT"),
  
  IMAGE("IMAGE"),
  
  MUSIC("MUSIC"),
  
  VIDEO("VIDEO"),
  
  VOICE("VOICE");

  private String value;

  AicElementGetV30DataElementsElementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AicElementGetV30DataElementsElementType fromValue(String value) {
    for (AicElementGetV30DataElementsElementType b : AicElementGetV30DataElementsElementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AicElementGetV30DataElementsElementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AicElementGetV30DataElementsElementType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AicElementGetV30DataElementsElementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AicElementGetV30DataElementsElementType.fromValue(value);
    }
  }
}

