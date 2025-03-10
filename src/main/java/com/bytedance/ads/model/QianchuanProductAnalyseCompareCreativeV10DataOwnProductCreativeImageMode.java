/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeImageMode.Adapter.class)
public enum QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeImageMode {
  
  AWEME_LIVE_ROOM("AWEME_LIVE_ROOM"),
  
  LARGE("LARGE"),
  
  LARGE_VERTICAL("LARGE_VERTICAL"),
  
  SMALL("SMALL"),
  
  SQUARE("SQUARE"),
  
  UNION_SPLASH("UNION_SPLASH"),
  
  VIDEO_LARGE("VIDEO_LARGE"),
  
  VIDEO_VERTICAL("VIDEO_VERTICAL");

  private String value;

  QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeImageMode fromValue(String value) {
    for (QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeImageMode b : QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanProductAnalyseCompareCreativeV10DataOwnProductCreativeImageMode.fromValue(value);
    }
  }
}

