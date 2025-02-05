/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(QianchuanAdUpdateV10AudienceSearchExtended.Adapter.class)
public enum QianchuanAdUpdateV10AudienceSearchExtended {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l);

  private Long value;

  QianchuanAdUpdateV10AudienceSearchExtended(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdUpdateV10AudienceSearchExtended fromValue(Long value) {
    for (QianchuanAdUpdateV10AudienceSearchExtended b : QianchuanAdUpdateV10AudienceSearchExtended.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdUpdateV10AudienceSearchExtended> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdUpdateV10AudienceSearchExtended enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdUpdateV10AudienceSearchExtended read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanAdUpdateV10AudienceSearchExtended.fromValue(value);
    }
  }
}

