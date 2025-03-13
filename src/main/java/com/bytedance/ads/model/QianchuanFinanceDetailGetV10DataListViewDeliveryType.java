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
@JsonAdapter(QianchuanFinanceDetailGetV10DataListViewDeliveryType.Adapter.class)
public enum QianchuanFinanceDetailGetV10DataListViewDeliveryType {
  
  ALL("ALL"),
  
  DEFAULT("DEFAULT"),
  
  BRAND("BRAND");

  private String value;

  QianchuanFinanceDetailGetV10DataListViewDeliveryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanFinanceDetailGetV10DataListViewDeliveryType fromValue(String value) {
    for (QianchuanFinanceDetailGetV10DataListViewDeliveryType b : QianchuanFinanceDetailGetV10DataListViewDeliveryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanFinanceDetailGetV10DataListViewDeliveryType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanFinanceDetailGetV10DataListViewDeliveryType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanFinanceDetailGetV10DataListViewDeliveryType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanFinanceDetailGetV10DataListViewDeliveryType.fromValue(value);
    }
  }
}

