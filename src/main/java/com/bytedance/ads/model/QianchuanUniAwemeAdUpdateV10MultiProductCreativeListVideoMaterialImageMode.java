/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(QianchuanUniAwemeAdUpdateV10MultiProductCreativeListVideoMaterialImageMode.Adapter.class)
public enum QianchuanUniAwemeAdUpdateV10MultiProductCreativeListVideoMaterialImageMode {
  
  LARGE("VIDEO_LARGE"),
  
  VERTICAL("VIDEO_VERTICAL");

  private String value;

  QianchuanUniAwemeAdUpdateV10MultiProductCreativeListVideoMaterialImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniAwemeAdUpdateV10MultiProductCreativeListVideoMaterialImageMode fromValue(String value) {
    for (QianchuanUniAwemeAdUpdateV10MultiProductCreativeListVideoMaterialImageMode b : QianchuanUniAwemeAdUpdateV10MultiProductCreativeListVideoMaterialImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniAwemeAdUpdateV10MultiProductCreativeListVideoMaterialImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniAwemeAdUpdateV10MultiProductCreativeListVideoMaterialImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniAwemeAdUpdateV10MultiProductCreativeListVideoMaterialImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniAwemeAdUpdateV10MultiProductCreativeListVideoMaterialImageMode.fromValue(value);
    }
  }
}

