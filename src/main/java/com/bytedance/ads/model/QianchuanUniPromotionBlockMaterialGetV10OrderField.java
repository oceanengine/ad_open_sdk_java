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
@JsonAdapter(QianchuanUniPromotionBlockMaterialGetV10OrderField.Adapter.class)
public enum QianchuanUniPromotionBlockMaterialGetV10OrderField {
  
  CREATE_TIME("create_time"),
  
  PLAY_CNT("play_cnt"),
  
  LIKE_CNT("like_cnt"),
  
  STAT_COST("stat_cost");

  private String value;

  QianchuanUniPromotionBlockMaterialGetV10OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionBlockMaterialGetV10OrderField fromValue(String value) {
    for (QianchuanUniPromotionBlockMaterialGetV10OrderField b : QianchuanUniPromotionBlockMaterialGetV10OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionBlockMaterialGetV10OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionBlockMaterialGetV10OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionBlockMaterialGetV10OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionBlockMaterialGetV10OrderField.fromValue(value);
    }
  }
}

