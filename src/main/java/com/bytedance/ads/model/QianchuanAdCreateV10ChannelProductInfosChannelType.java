/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(QianchuanAdCreateV10ChannelProductInfosChannelType.Adapter.class)
public enum QianchuanAdCreateV10ChannelProductInfosChannelType {
  
  SHOP_SELL("SHOP_SELL"),
  
  STAR_SELL("STAR_SELL");

  private String value;

  QianchuanAdCreateV10ChannelProductInfosChannelType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdCreateV10ChannelProductInfosChannelType fromValue(String value) {
    for (QianchuanAdCreateV10ChannelProductInfosChannelType b : QianchuanAdCreateV10ChannelProductInfosChannelType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdCreateV10ChannelProductInfosChannelType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdCreateV10ChannelProductInfosChannelType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdCreateV10ChannelProductInfosChannelType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdCreateV10ChannelProductInfosChannelType.fromValue(value);
    }
  }
}

