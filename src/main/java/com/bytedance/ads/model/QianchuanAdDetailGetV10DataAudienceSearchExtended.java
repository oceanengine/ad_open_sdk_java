/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(QianchuanAdDetailGetV10DataAudienceSearchExtended.Adapter.class)
public enum QianchuanAdDetailGetV10DataAudienceSearchExtended {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l);

  private Long value;

  QianchuanAdDetailGetV10DataAudienceSearchExtended(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataAudienceSearchExtended fromValue(Long value) {
    for (QianchuanAdDetailGetV10DataAudienceSearchExtended b : QianchuanAdDetailGetV10DataAudienceSearchExtended.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataAudienceSearchExtended> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataAudienceSearchExtended enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataAudienceSearchExtended read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanAdDetailGetV10DataAudienceSearchExtended.fromValue(value);
    }
  }
}

