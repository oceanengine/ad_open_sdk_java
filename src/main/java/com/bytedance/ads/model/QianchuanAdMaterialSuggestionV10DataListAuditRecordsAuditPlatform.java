/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(QianchuanAdMaterialSuggestionV10DataListAuditRecordsAuditPlatform.Adapter.class)
public enum QianchuanAdMaterialSuggestionV10DataListAuditRecordsAuditPlatform {
  
  UNKNOWN("UNKNOWN"),
  
  AD("AD"),
  
  CONTENT("CONTENT");

  private String value;

  QianchuanAdMaterialSuggestionV10DataListAuditRecordsAuditPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdMaterialSuggestionV10DataListAuditRecordsAuditPlatform fromValue(String value) {
    for (QianchuanAdMaterialSuggestionV10DataListAuditRecordsAuditPlatform b : QianchuanAdMaterialSuggestionV10DataListAuditRecordsAuditPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdMaterialSuggestionV10DataListAuditRecordsAuditPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdMaterialSuggestionV10DataListAuditRecordsAuditPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdMaterialSuggestionV10DataListAuditRecordsAuditPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdMaterialSuggestionV10DataListAuditRecordsAuditPlatform.fromValue(value);
    }
  }
}

