/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
@JsonAdapter(ToolsBpAssetManagementShareCancelV30AllAccountsByBp.Adapter.class)
public enum ToolsBpAssetManagementShareCancelV30AllAccountsByBp {
  
  AD("AD");

  private String value;

  ToolsBpAssetManagementShareCancelV30AllAccountsByBp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBpAssetManagementShareCancelV30AllAccountsByBp fromValue(String value) {
    for (ToolsBpAssetManagementShareCancelV30AllAccountsByBp b : ToolsBpAssetManagementShareCancelV30AllAccountsByBp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBpAssetManagementShareCancelV30AllAccountsByBp> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBpAssetManagementShareCancelV30AllAccountsByBp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBpAssetManagementShareCancelV30AllAccountsByBp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBpAssetManagementShareCancelV30AllAccountsByBp.fromValue(value);
    }
  }
}

