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
@JsonAdapter(EnterpriseOperationLogGetV10DataListBusinessPageOperationType.Adapter.class)
public enum EnterpriseOperationLogGetV10DataListBusinessPageOperationType {
  
  AD("AD"),
  
  LIVE("LIVE"),
  
  DOU("DOU"),
  
  VIDEO("VIDEO");

  private String value;

  EnterpriseOperationLogGetV10DataListBusinessPageOperationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnterpriseOperationLogGetV10DataListBusinessPageOperationType fromValue(String value) {
    for (EnterpriseOperationLogGetV10DataListBusinessPageOperationType b : EnterpriseOperationLogGetV10DataListBusinessPageOperationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnterpriseOperationLogGetV10DataListBusinessPageOperationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnterpriseOperationLogGetV10DataListBusinessPageOperationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnterpriseOperationLogGetV10DataListBusinessPageOperationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnterpriseOperationLogGetV10DataListBusinessPageOperationType.fromValue(value);
    }
  }
}

