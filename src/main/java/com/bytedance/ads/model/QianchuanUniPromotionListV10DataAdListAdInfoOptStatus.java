/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(QianchuanUniPromotionListV10DataAdListAdInfoOptStatus.Adapter.class)
public enum QianchuanUniPromotionListV10DataAdListAdInfoOptStatus {
  
  DELETE("DELETE"),
  
  DISABLE("DISABLE"),
  
  ENABLE("ENABLE"),
  
  QUOTA_DISABLE("QUOTA_DISABLE"),
  
  ROI2_DISABLE("ROI2_DISABLE");

  private String value;

  QianchuanUniPromotionListV10DataAdListAdInfoOptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionListV10DataAdListAdInfoOptStatus fromValue(String value) {
    for (QianchuanUniPromotionListV10DataAdListAdInfoOptStatus b : QianchuanUniPromotionListV10DataAdListAdInfoOptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionListV10DataAdListAdInfoOptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionListV10DataAdListAdInfoOptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionListV10DataAdListAdInfoOptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionListV10DataAdListAdInfoOptStatus.fromValue(value);
    }
  }
}

