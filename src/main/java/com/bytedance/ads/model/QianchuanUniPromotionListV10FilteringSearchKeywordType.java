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
@JsonAdapter(QianchuanUniPromotionListV10FilteringSearchKeywordType.Adapter.class)
public enum QianchuanUniPromotionListV10FilteringSearchKeywordType {
  
  PRODUCT("PRODUCT"),
  
  AWEME("AWEME"),
  
  AD("AD");

  private String value;

  QianchuanUniPromotionListV10FilteringSearchKeywordType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionListV10FilteringSearchKeywordType fromValue(String value) {
    for (QianchuanUniPromotionListV10FilteringSearchKeywordType b : QianchuanUniPromotionListV10FilteringSearchKeywordType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionListV10FilteringSearchKeywordType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionListV10FilteringSearchKeywordType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionListV10FilteringSearchKeywordType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionListV10FilteringSearchKeywordType.fromValue(value);
    }
  }
}

