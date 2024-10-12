/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(YuntuAudienceLabelCreateV30CalculateRuleFieldFilters.Adapter.class)
public enum YuntuAudienceLabelCreateV30CalculateRuleFieldFilters {
  
  ASR_CONTENT("asr_content"),
  
  OCR_CONTENT("ocr_content"),
  
  PRODUCT_NAME("product_name"),
  
  QUERY("query"),
  
  TITLE("title");

  private String value;

  YuntuAudienceLabelCreateV30CalculateRuleFieldFilters(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static YuntuAudienceLabelCreateV30CalculateRuleFieldFilters fromValue(String value) {
    for (YuntuAudienceLabelCreateV30CalculateRuleFieldFilters b : YuntuAudienceLabelCreateV30CalculateRuleFieldFilters.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<YuntuAudienceLabelCreateV30CalculateRuleFieldFilters> {
    @Override
    public void write(final JsonWriter jsonWriter, final YuntuAudienceLabelCreateV30CalculateRuleFieldFilters enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public YuntuAudienceLabelCreateV30CalculateRuleFieldFilters read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return YuntuAudienceLabelCreateV30CalculateRuleFieldFilters.fromValue(value);
    }
  }
}
