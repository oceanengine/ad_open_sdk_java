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
@JsonAdapter(QianchuanAdCompensateStatusGetV10DataListCompensateStatus.Adapter.class)
public enum QianchuanAdCompensateStatusGetV10DataListCompensateStatus {
  
  IN_EFFECT("IN_EFFECT"),
  
  INVALID("INVALID"),
  
  CONFIRMING("CONFIRMING"),
  
  PAID("PAID"),
  
  ENDED("ENDED"),
  
  DEFAULT("DEFAULT");

  private String value;

  QianchuanAdCompensateStatusGetV10DataListCompensateStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdCompensateStatusGetV10DataListCompensateStatus fromValue(String value) {
    for (QianchuanAdCompensateStatusGetV10DataListCompensateStatus b : QianchuanAdCompensateStatusGetV10DataListCompensateStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdCompensateStatusGetV10DataListCompensateStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdCompensateStatusGetV10DataListCompensateStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdCompensateStatusGetV10DataListCompensateStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdCompensateStatusGetV10DataListCompensateStatus.fromValue(value);
    }
  }
}

