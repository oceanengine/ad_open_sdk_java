/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion.Adapter.class)
public enum QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion fromValue(Long value) {
    for (QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion b : QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion.fromValue(value);
    }
  }
}

