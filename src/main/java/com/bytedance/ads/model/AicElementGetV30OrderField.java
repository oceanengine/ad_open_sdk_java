/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(AicElementGetV30OrderField.Adapter.class)
public enum AicElementGetV30OrderField {
  
  CREATED_TIME("CREATED_TIME"),
  
  UPDATE_TIME("UPDATE_TIME");

  private String value;

  AicElementGetV30OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AicElementGetV30OrderField fromValue(String value) {
    for (AicElementGetV30OrderField b : AicElementGetV30OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AicElementGetV30OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final AicElementGetV30OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AicElementGetV30OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AicElementGetV30OrderField.fromValue(value);
    }
  }
}

