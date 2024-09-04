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
@JsonAdapter(QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource.Adapter.class)
public enum QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource {
  
  AD("AD"),
  
  AWEME_VIDEO("AWEME_VIDEO");

  private String value;

  QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource fromValue(String value) {
    for (QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource b : QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource.fromValue(value);
    }
  }
}

