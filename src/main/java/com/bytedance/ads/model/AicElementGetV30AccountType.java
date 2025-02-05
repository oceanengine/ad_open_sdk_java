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
@JsonAdapter(AicElementGetV30AccountType.Adapter.class)
public enum AicElementGetV30AccountType {
  
  AGENT("AGENT"),
  
  BP("BP");

  private String value;

  AicElementGetV30AccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AicElementGetV30AccountType fromValue(String value) {
    for (AicElementGetV30AccountType b : AicElementGetV30AccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AicElementGetV30AccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AicElementGetV30AccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AicElementGetV30AccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AicElementGetV30AccountType.fromValue(value);
    }
  }
}

