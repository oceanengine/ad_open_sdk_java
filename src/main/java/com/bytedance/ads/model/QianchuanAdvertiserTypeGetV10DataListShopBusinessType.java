/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(QianchuanAdvertiserTypeGetV10DataListShopBusinessType.Adapter.class)
public enum QianchuanAdvertiserTypeGetV10DataListShopBusinessType {
  
  UNKOWN("UNKOWN"),
  
  SHOP_RETAIL("SHOP_RETAIL");

  private String value;

  QianchuanAdvertiserTypeGetV10DataListShopBusinessType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdvertiserTypeGetV10DataListShopBusinessType fromValue(String value) {
    for (QianchuanAdvertiserTypeGetV10DataListShopBusinessType b : QianchuanAdvertiserTypeGetV10DataListShopBusinessType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdvertiserTypeGetV10DataListShopBusinessType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdvertiserTypeGetV10DataListShopBusinessType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdvertiserTypeGetV10DataListShopBusinessType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdvertiserTypeGetV10DataListShopBusinessType.fromValue(value);
    }
  }
}

