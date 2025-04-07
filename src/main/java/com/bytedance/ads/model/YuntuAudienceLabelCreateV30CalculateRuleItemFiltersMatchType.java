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
@JsonAdapter(YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType.Adapter.class)
public enum YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType {
  
  NUMBER_0(0l);

  private Long value;

  YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType fromValue(Long value) {
    for (YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType b : YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType.fromValue(value);
    }
  }
}

