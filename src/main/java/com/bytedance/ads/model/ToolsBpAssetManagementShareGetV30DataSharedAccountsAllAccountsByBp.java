/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp.Adapter.class)
public enum ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp {
  
  AD("AD");

  private String value;

  ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp fromValue(String value) {
    for (ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp b : ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByBp.fromValue(value);
    }
  }
}

