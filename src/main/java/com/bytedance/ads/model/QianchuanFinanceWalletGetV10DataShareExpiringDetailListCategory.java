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
@JsonAdapter(QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory.Adapter.class)
public enum QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory {
  
  COMMON("COMMON"),
  
  DEFAULT("DEFAULT"),
  
  SEARCH("SEARCH"),
  
  UNION("UNION");

  private String value;

  QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory fromValue(String value) {
    for (QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory b : QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanFinanceWalletGetV10DataShareExpiringDetailListCategory.fromValue(value);
    }
  }
}

