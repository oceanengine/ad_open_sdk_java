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
@JsonAdapter(QianchuanAwemeProductAvailableGetV10DataProductListChannelType.Adapter.class)
public enum QianchuanAwemeProductAvailableGetV10DataProductListChannelType {
  
  SHOP_SELL("SHOP_SELL"),
  
  STAR_SELL("STAR_SELL");

  private String value;

  QianchuanAwemeProductAvailableGetV10DataProductListChannelType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeProductAvailableGetV10DataProductListChannelType fromValue(String value) {
    for (QianchuanAwemeProductAvailableGetV10DataProductListChannelType b : QianchuanAwemeProductAvailableGetV10DataProductListChannelType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeProductAvailableGetV10DataProductListChannelType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeProductAvailableGetV10DataProductListChannelType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeProductAvailableGetV10DataProductListChannelType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeProductAvailableGetV10DataProductListChannelType.fromValue(value);
    }
  }
}

