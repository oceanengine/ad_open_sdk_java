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
@JsonAdapter(QianchuanAwemeVideoGetV10DataVideoListIsRecommend.Adapter.class)
public enum QianchuanAwemeVideoGetV10DataVideoListIsRecommend {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  QianchuanAwemeVideoGetV10DataVideoListIsRecommend(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeVideoGetV10DataVideoListIsRecommend fromValue(Long value) {
    for (QianchuanAwemeVideoGetV10DataVideoListIsRecommend b : QianchuanAwemeVideoGetV10DataVideoListIsRecommend.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeVideoGetV10DataVideoListIsRecommend> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeVideoGetV10DataVideoListIsRecommend enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeVideoGetV10DataVideoListIsRecommend read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanAwemeVideoGetV10DataVideoListIsRecommend.fromValue(value);
    }
  }
}

