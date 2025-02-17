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
@JsonAdapter(QianchuanAdUpdateV10AudienceActionDays.Adapter.class)
public enum QianchuanAdUpdateV10AudienceActionDays {
  
  NUMBER_7(7l),
  
  NUMBER_15(15l),
  
  NUMBER_30(30l),
  
  NUMBER_60(60l),
  
  NUMBER_90(90l),
  
  NUMBER_180(180l),
  
  NUMBER_365(365l);

  private Long value;

  QianchuanAdUpdateV10AudienceActionDays(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdUpdateV10AudienceActionDays fromValue(Long value) {
    for (QianchuanAdUpdateV10AudienceActionDays b : QianchuanAdUpdateV10AudienceActionDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdUpdateV10AudienceActionDays> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdUpdateV10AudienceActionDays enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdUpdateV10AudienceActionDays read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanAdUpdateV10AudienceActionDays.fromValue(value);
    }
  }
}

