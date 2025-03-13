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
@JsonAdapter(QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType.Adapter.class)
public enum QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType {
  
  PROGRAMMATIC_CREATIVE("PROGRAMMATIC_CREATIVE");

  private String value;

  QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType fromValue(String value) {
    for (QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType b : QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType.fromValue(value);
    }
  }
}

