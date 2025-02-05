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
@JsonAdapter(AicMaterialGetV30FilteringRadio.Adapter.class)
public enum AicMaterialGetV30FilteringRadio {
  
  Enum_16_9("RATIO_16_9"),
  
  Enum_9_16("RATIO_9_16");

  private String value;

  AicMaterialGetV30FilteringRadio(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AicMaterialGetV30FilteringRadio fromValue(String value) {
    for (AicMaterialGetV30FilteringRadio b : AicMaterialGetV30FilteringRadio.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AicMaterialGetV30FilteringRadio> {
    @Override
    public void write(final JsonWriter jsonWriter, final AicMaterialGetV30FilteringRadio enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AicMaterialGetV30FilteringRadio read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AicMaterialGetV30FilteringRadio.fromValue(value);
    }
  }
}

