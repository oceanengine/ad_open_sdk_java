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
@JsonAdapter(ToolsClueLiteContactGetV2DataListCallDirection.Adapter.class)
public enum ToolsClueLiteContactGetV2DataListCallDirection {
  
  OUT("CALL_OUT"),
  
  IN("CALL_IN");

  private String value;

  ToolsClueLiteContactGetV2DataListCallDirection(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueLiteContactGetV2DataListCallDirection fromValue(String value) {
    for (ToolsClueLiteContactGetV2DataListCallDirection b : ToolsClueLiteContactGetV2DataListCallDirection.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsClueLiteContactGetV2DataListCallDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueLiteContactGetV2DataListCallDirection enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueLiteContactGetV2DataListCallDirection read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsClueLiteContactGetV2DataListCallDirection.fromValue(value);
    }
  }
}

