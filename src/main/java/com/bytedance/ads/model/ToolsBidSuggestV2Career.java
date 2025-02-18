/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
@JsonAdapter(ToolsBidSuggestV2Career.Adapter.class)
public enum ToolsBidSuggestV2Career {
  
  FINANCIAL("FINANCIAL"),
  
  COLLEGE_STUDENT("COLLEGE_STUDENT"),
  
  IT("IT"),
  
  MEDICAL_STAFF("MEDICAL_STAFF"),
  
  TEACHER("TEACHER"),
  
  CIVIL_SERVANTS("CIVIL_SERVANTS");

  private String value;

  ToolsBidSuggestV2Career(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidSuggestV2Career fromValue(String value) {
    for (ToolsBidSuggestV2Career b : ToolsBidSuggestV2Career.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidSuggestV2Career> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidSuggestV2Career enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidSuggestV2Career read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBidSuggestV2Career.fromValue(value);
    }
  }
}

