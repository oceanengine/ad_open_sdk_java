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
@JsonAdapter(YuntuAudienceLabelCreateV30ValidDay.Adapter.class)
public enum YuntuAudienceLabelCreateV30ValidDay {
  
  NUMBER_120(120l),
  
  NUMBER_150(150l),
  
  NUMBER_180(180l),
  
  NUMBER_30(30l),
  
  NUMBER_60(60l),
  
  NUMBER_90(90l);

  private Long value;

  YuntuAudienceLabelCreateV30ValidDay(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static YuntuAudienceLabelCreateV30ValidDay fromValue(Long value) {
    for (YuntuAudienceLabelCreateV30ValidDay b : YuntuAudienceLabelCreateV30ValidDay.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<YuntuAudienceLabelCreateV30ValidDay> {
    @Override
    public void write(final JsonWriter jsonWriter, final YuntuAudienceLabelCreateV30ValidDay enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public YuntuAudienceLabelCreateV30ValidDay read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return YuntuAudienceLabelCreateV30ValidDay.fromValue(value);
    }
  }
}

