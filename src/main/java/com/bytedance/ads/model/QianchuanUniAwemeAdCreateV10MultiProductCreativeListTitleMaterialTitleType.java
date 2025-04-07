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
@JsonAdapter(QianchuanUniAwemeAdCreateV10MultiProductCreativeListTitleMaterialTitleType.Adapter.class)
public enum QianchuanUniAwemeAdCreateV10MultiProductCreativeListTitleMaterialTitleType {
  
  COMMODITY_CARD("COMMODITY_CARD"),
  
  CUSTOM("CUSTOM");

  private String value;

  QianchuanUniAwemeAdCreateV10MultiProductCreativeListTitleMaterialTitleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniAwemeAdCreateV10MultiProductCreativeListTitleMaterialTitleType fromValue(String value) {
    for (QianchuanUniAwemeAdCreateV10MultiProductCreativeListTitleMaterialTitleType b : QianchuanUniAwemeAdCreateV10MultiProductCreativeListTitleMaterialTitleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniAwemeAdCreateV10MultiProductCreativeListTitleMaterialTitleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniAwemeAdCreateV10MultiProductCreativeListTitleMaterialTitleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniAwemeAdCreateV10MultiProductCreativeListTitleMaterialTitleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniAwemeAdCreateV10MultiProductCreativeListTitleMaterialTitleType.fromValue(value);
    }
  }
}

