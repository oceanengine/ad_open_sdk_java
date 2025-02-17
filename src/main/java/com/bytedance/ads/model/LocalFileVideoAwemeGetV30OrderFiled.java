/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(LocalFileVideoAwemeGetV30OrderFiled.Adapter.class)
public enum LocalFileVideoAwemeGetV30OrderFiled {
  
  ARRIVE_SHOP("ARRIVE_SHOP"),
  
  ESTIMATE("ESTIMATE"),
  
  LIKE_CNT("LIKE_CNT"),
  
  PAY_ORDER_CNT("PAY_ORDER_CNT"),
  
  PUBLISH_TIME("PUBLISH_TIME");

  private String value;

  LocalFileVideoAwemeGetV30OrderFiled(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalFileVideoAwemeGetV30OrderFiled fromValue(String value) {
    for (LocalFileVideoAwemeGetV30OrderFiled b : LocalFileVideoAwemeGetV30OrderFiled.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalFileVideoAwemeGetV30OrderFiled> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalFileVideoAwemeGetV30OrderFiled enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalFileVideoAwemeGetV30OrderFiled read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalFileVideoAwemeGetV30OrderFiled.fromValue(value);
    }
  }
}

