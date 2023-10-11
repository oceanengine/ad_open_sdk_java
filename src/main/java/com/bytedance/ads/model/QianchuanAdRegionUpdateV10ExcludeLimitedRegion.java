/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
@JsonAdapter(QianchuanAdRegionUpdateV10ExcludeLimitedRegion.Adapter.class)
public enum QianchuanAdRegionUpdateV10ExcludeLimitedRegion {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  QianchuanAdRegionUpdateV10ExcludeLimitedRegion(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdRegionUpdateV10ExcludeLimitedRegion fromValue(Long value) {
    for (QianchuanAdRegionUpdateV10ExcludeLimitedRegion b : QianchuanAdRegionUpdateV10ExcludeLimitedRegion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdRegionUpdateV10ExcludeLimitedRegion> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdRegionUpdateV10ExcludeLimitedRegion enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdRegionUpdateV10ExcludeLimitedRegion read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanAdRegionUpdateV10ExcludeLimitedRegion.fromValue(value);
    }
  }
}

