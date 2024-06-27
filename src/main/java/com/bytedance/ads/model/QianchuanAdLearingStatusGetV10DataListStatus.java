/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(QianchuanAdLearingStatusGetV10DataListStatus.Adapter.class)
public enum QianchuanAdLearingStatusGetV10DataListStatus {
  
  LEARNING("LEARNING"),
  
  LEARNED("LEARNED"),
  
  LEARN_FAILED("LEARN_FAILED"),
  
  DEFAULT("DEFAULT");

  private String value;

  QianchuanAdLearingStatusGetV10DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdLearingStatusGetV10DataListStatus fromValue(String value) {
    for (QianchuanAdLearingStatusGetV10DataListStatus b : QianchuanAdLearingStatusGetV10DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdLearingStatusGetV10DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdLearingStatusGetV10DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdLearingStatusGetV10DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdLearingStatusGetV10DataListStatus.fromValue(value);
    }
  }
}

