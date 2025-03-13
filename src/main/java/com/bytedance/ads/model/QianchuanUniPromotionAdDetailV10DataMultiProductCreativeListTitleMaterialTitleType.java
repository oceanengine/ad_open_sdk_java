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
@JsonAdapter(QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListTitleMaterialTitleType.Adapter.class)
public enum QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListTitleMaterialTitleType {
  
  AWEME_CAROUSEL("AWEME_CAROUSEL"),
  
  AWEME_VIDEO("AWEME_VIDEO"),
  
  COMMODITY_CARD("COMMODITY_CARD"),
  
  CUSTOM("CUSTOM"),
  
  DEFAULT_CAROUSEL("DEFAULT_CAROUSEL");

  private String value;

  QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListTitleMaterialTitleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListTitleMaterialTitleType fromValue(String value) {
    for (QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListTitleMaterialTitleType b : QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListTitleMaterialTitleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListTitleMaterialTitleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListTitleMaterialTitleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListTitleMaterialTitleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListTitleMaterialTitleType.fromValue(value);
    }
  }
}

