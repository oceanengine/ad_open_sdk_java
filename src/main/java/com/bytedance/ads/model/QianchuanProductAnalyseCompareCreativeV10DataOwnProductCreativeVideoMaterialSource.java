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
@JsonAdapter(QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeVideoMaterialSource.Adapter.class)
public enum QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeVideoMaterialSource {
  
  AD("AD"),
  
  AWEME_VIDEO("AWEME_VIDEO");

  private String value;

  QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeVideoMaterialSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeVideoMaterialSource fromValue(String value) {
    for (QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeVideoMaterialSource b : QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeVideoMaterialSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeVideoMaterialSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeVideoMaterialSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeVideoMaterialSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeVideoMaterialSource.fromValue(value);
    }
  }
}

