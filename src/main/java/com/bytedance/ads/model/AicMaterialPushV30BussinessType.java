/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(AicMaterialPushV30BussinessType.Adapter.class)
public enum AicMaterialPushV30BussinessType {
  
  AD("AD"),
  
  LOCAL("LOCAL"),
  
  QIANCHUAN("QIANCHUAN");

  private String value;

  AicMaterialPushV30BussinessType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AicMaterialPushV30BussinessType fromValue(String value) {
    for (AicMaterialPushV30BussinessType b : AicMaterialPushV30BussinessType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AicMaterialPushV30BussinessType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AicMaterialPushV30BussinessType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AicMaterialPushV30BussinessType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AicMaterialPushV30BussinessType.fromValue(value);
    }
  }
}

