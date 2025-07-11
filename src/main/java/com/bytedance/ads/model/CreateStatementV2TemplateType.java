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
@JsonAdapter(CreateStatementV2TemplateType.Adapter.class)
public enum CreateStatementV2TemplateType {
  
  NOT_STANDARD("NOT_STANDARD"),
  
  STANDARD("STANDARD");

  private String value;

  CreateStatementV2TemplateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreateStatementV2TemplateType fromValue(String value) {
    for (CreateStatementV2TemplateType b : CreateStatementV2TemplateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreateStatementV2TemplateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreateStatementV2TemplateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreateStatementV2TemplateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreateStatementV2TemplateType.fromValue(value);
    }
  }
}

