/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(QianchuanAdDetailGetV10DataAudienceNewCustomer.Adapter.class)
public enum QianchuanAdDetailGetV10DataAudienceNewCustomer {
  
  NONE("NONE"),
  
  NO_BUY("NO_BUY"),
  
  NO_BUY_BRAND("NO_BUY_BRAND"),
  
  NO_BUY_DOUYIN("NO_BUY_DOUYIN");

  private String value;

  QianchuanAdDetailGetV10DataAudienceNewCustomer(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataAudienceNewCustomer fromValue(String value) {
    for (QianchuanAdDetailGetV10DataAudienceNewCustomer b : QianchuanAdDetailGetV10DataAudienceNewCustomer.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataAudienceNewCustomer> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataAudienceNewCustomer enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataAudienceNewCustomer read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdDetailGetV10DataAudienceNewCustomer.fromValue(value);
    }
  }
}

