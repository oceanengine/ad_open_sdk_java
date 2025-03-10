/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(ToolsTaskRaiseCreateV2BudgetMode.Adapter.class)
public enum ToolsTaskRaiseCreateV2BudgetMode {
  
  LIMIT("LIMIT"),
  
  NO_LIMIT("NO_LIMIT");

  private String value;

  ToolsTaskRaiseCreateV2BudgetMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsTaskRaiseCreateV2BudgetMode fromValue(String value) {
    for (ToolsTaskRaiseCreateV2BudgetMode b : ToolsTaskRaiseCreateV2BudgetMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsTaskRaiseCreateV2BudgetMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsTaskRaiseCreateV2BudgetMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsTaskRaiseCreateV2BudgetMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsTaskRaiseCreateV2BudgetMode.fromValue(value);
    }
  }
}

