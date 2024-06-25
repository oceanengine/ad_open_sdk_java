/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(QianchuanUniPromotionListV10FilteringSmartBidType.Adapter.class)
public enum QianchuanUniPromotionListV10FilteringSmartBidType {
  
  CONSERVATIVE("SMART_BID_CONSERVATIVE"),
  
  CUSTOM("SMART_BID_CUSTOM");

  private String value;

  QianchuanUniPromotionListV10FilteringSmartBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionListV10FilteringSmartBidType fromValue(String value) {
    for (QianchuanUniPromotionListV10FilteringSmartBidType b : QianchuanUniPromotionListV10FilteringSmartBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionListV10FilteringSmartBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionListV10FilteringSmartBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionListV10FilteringSmartBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionListV10FilteringSmartBidType.fromValue(value);
    }
  }
}

