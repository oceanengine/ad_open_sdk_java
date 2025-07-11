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
@JsonAdapter(AdGetV2DataInheritType.Adapter.class)
public enum AdGetV2DataInheritType {
  
  FROM_ACCOUNT("INHERIT_FROM_ACCOUNT"),
  
  FROM_CUSTOMER("INHERIT_FROM_CUSTOMER"),
  
  BY_SYSTEM("INHERIT_BY_SYSTEM");

  private String value;

  AdGetV2DataInheritType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataInheritType fromValue(String value) {
    for (AdGetV2DataInheritType b : AdGetV2DataInheritType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataInheritType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataInheritType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataInheritType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataInheritType.fromValue(value);
    }
  }
}

