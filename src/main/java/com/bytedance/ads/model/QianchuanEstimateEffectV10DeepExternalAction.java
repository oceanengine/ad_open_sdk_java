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
@JsonAdapter(QianchuanEstimateEffectV10DeepExternalAction.Adapter.class)
public enum QianchuanEstimateEffectV10DeepExternalAction {
  
  AD_CONVERT_TYPE_LIVE_PAY_ROI("AD_CONVERT_TYPE_LIVE_PAY_ROI");

  private String value;

  QianchuanEstimateEffectV10DeepExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanEstimateEffectV10DeepExternalAction fromValue(String value) {
    for (QianchuanEstimateEffectV10DeepExternalAction b : QianchuanEstimateEffectV10DeepExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanEstimateEffectV10DeepExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanEstimateEffectV10DeepExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanEstimateEffectV10DeepExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanEstimateEffectV10DeepExternalAction.fromValue(value);
    }
  }
}

