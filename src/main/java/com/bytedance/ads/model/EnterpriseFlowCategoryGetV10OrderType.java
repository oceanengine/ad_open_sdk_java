/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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
@JsonAdapter(EnterpriseFlowCategoryGetV10OrderType.Adapter.class)
public enum EnterpriseFlowCategoryGetV10OrderType {
  
  DESC("DESC"),
  
  ASC("ASC");

  private String value;

  EnterpriseFlowCategoryGetV10OrderType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnterpriseFlowCategoryGetV10OrderType fromValue(String value) {
    for (EnterpriseFlowCategoryGetV10OrderType b : EnterpriseFlowCategoryGetV10OrderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnterpriseFlowCategoryGetV10OrderType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnterpriseFlowCategoryGetV10OrderType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnterpriseFlowCategoryGetV10OrderType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnterpriseFlowCategoryGetV10OrderType.fromValue(value);
    }
  }
}

