/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(QianchuanEstimateEffectV10DeepBidType.Adapter.class)
public enum QianchuanEstimateEffectV10DeepBidType {
  
  MIN("MIN");

  private String value;

  QianchuanEstimateEffectV10DeepBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanEstimateEffectV10DeepBidType fromValue(String value) {
    for (QianchuanEstimateEffectV10DeepBidType b : QianchuanEstimateEffectV10DeepBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanEstimateEffectV10DeepBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanEstimateEffectV10DeepBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanEstimateEffectV10DeepBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanEstimateEffectV10DeepBidType.fromValue(value);
    }
  }
}

