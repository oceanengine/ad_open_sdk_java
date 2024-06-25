/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(ToolsBpAssetManagementShareV30AllAccountsByBp.Adapter.class)
public enum ToolsBpAssetManagementShareV30AllAccountsByBp {
  
  AD("AD");

  private String value;

  ToolsBpAssetManagementShareV30AllAccountsByBp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBpAssetManagementShareV30AllAccountsByBp fromValue(String value) {
    for (ToolsBpAssetManagementShareV30AllAccountsByBp b : ToolsBpAssetManagementShareV30AllAccountsByBp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBpAssetManagementShareV30AllAccountsByBp> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBpAssetManagementShareV30AllAccountsByBp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBpAssetManagementShareV30AllAccountsByBp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBpAssetManagementShareV30AllAccountsByBp.fromValue(value);
    }
  }
}

