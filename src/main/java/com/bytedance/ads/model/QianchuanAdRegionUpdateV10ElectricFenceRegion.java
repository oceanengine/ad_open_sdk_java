/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@JsonAdapter(QianchuanAdRegionUpdateV10ElectricFenceRegion.Adapter.class)
public enum QianchuanAdRegionUpdateV10ElectricFenceRegion {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l);

  private Long value;

  QianchuanAdRegionUpdateV10ElectricFenceRegion(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdRegionUpdateV10ElectricFenceRegion fromValue(Long value) {
    for (QianchuanAdRegionUpdateV10ElectricFenceRegion b : QianchuanAdRegionUpdateV10ElectricFenceRegion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdRegionUpdateV10ElectricFenceRegion> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdRegionUpdateV10ElectricFenceRegion enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdRegionUpdateV10ElectricFenceRegion read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanAdRegionUpdateV10ElectricFenceRegion.fromValue(value);
    }
  }
}

