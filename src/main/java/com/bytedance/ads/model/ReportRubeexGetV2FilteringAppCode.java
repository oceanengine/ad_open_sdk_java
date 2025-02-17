/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(ReportRubeexGetV2FilteringAppCode.Adapter.class)
public enum ReportRubeexGetV2FilteringAppCode {
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_4(4l),
  
  NUMBER_8(8l),
  
  NUMBER_9(9l),
  
  NUMBER_14(14l),
  
  NUMBER_28(28l);

  private Long value;

  ReportRubeexGetV2FilteringAppCode(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportRubeexGetV2FilteringAppCode fromValue(Long value) {
    for (ReportRubeexGetV2FilteringAppCode b : ReportRubeexGetV2FilteringAppCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportRubeexGetV2FilteringAppCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportRubeexGetV2FilteringAppCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportRubeexGetV2FilteringAppCode read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ReportRubeexGetV2FilteringAppCode.fromValue(value);
    }
  }
}

