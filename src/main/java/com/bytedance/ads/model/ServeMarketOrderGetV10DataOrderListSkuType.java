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
@JsonAdapter(ServeMarketOrderGetV10DataOrderListSkuType.Adapter.class)
public enum ServeMarketOrderGetV10DataOrderListSkuType {
  
  FREE("FREE"),
  
  TRY("TRY"),
  
  PAY("PAY");

  private String value;

  ServeMarketOrderGetV10DataOrderListSkuType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ServeMarketOrderGetV10DataOrderListSkuType fromValue(String value) {
    for (ServeMarketOrderGetV10DataOrderListSkuType b : ServeMarketOrderGetV10DataOrderListSkuType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ServeMarketOrderGetV10DataOrderListSkuType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ServeMarketOrderGetV10DataOrderListSkuType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ServeMarketOrderGetV10DataOrderListSkuType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ServeMarketOrderGetV10DataOrderListSkuType.fromValue(value);
    }
  }
}

