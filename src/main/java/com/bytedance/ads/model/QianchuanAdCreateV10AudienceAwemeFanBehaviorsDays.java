/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays.Adapter.class)
public enum QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays {
  
  Enum_15("DAYS_15"),
  
  Enum_30("DAYS_30"),
  
  Enum_60("DAYS_60");

  private String value;

  QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays fromValue(String value) {
    for (QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays b : QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays.fromValue(value);
    }
  }
}

