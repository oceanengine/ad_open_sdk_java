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
@JsonAdapter(ClueFormCreateV2ElementsLayer.Adapter.class)
public enum ClueFormCreateV2ElementsLayer {
  
  Enum_1("1"),
  
  Enum_0("0");

  private String value;

  ClueFormCreateV2ElementsLayer(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueFormCreateV2ElementsLayer fromValue(String value) {
    for (ClueFormCreateV2ElementsLayer b : ClueFormCreateV2ElementsLayer.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueFormCreateV2ElementsLayer> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueFormCreateV2ElementsLayer enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueFormCreateV2ElementsLayer read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueFormCreateV2ElementsLayer.fromValue(value);
    }
  }
}

