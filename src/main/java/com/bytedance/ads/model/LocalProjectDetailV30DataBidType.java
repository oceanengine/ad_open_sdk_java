/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
@JsonAdapter(LocalProjectDetailV30DataBidType.Adapter.class)
public enum LocalProjectDetailV30DataBidType {
  
  MANUAL("MANUAL"),
  
  SMART("SMART");

  private String value;

  LocalProjectDetailV30DataBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectDetailV30DataBidType fromValue(String value) {
    for (LocalProjectDetailV30DataBidType b : LocalProjectDetailV30DataBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalProjectDetailV30DataBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectDetailV30DataBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectDetailV30DataBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectDetailV30DataBidType.fromValue(value);
    }
  }
}

