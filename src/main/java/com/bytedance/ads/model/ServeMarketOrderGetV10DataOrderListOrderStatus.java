/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
@JsonAdapter(ServeMarketOrderGetV10DataOrderListOrderStatus.Adapter.class)
public enum ServeMarketOrderGetV10DataOrderListOrderStatus {
  
  UNPAID("UNPAID"),
  
  CANCELED("CANCELED"),
  
  OVERTIME_CANCELED("OVERTIME_CANCELED"),
  
  SERVING("SERVING"),
  
  REFUND_APPLY("REFUND_APPLY"),
  
  REFUND_REJECT("REFUND_REJECT"),
  
  REFUND_APPROVED("REFUND_APPROVED"),
  
  REFUND_SUCCESS("REFUND_SUCCESS"),
  
  DELIVERED("DELIVERED"),
  
  FINISHED("FINISHED"),
  
  OVERTIME_FINISHED("OVERTIME_FINISHED"),
  
  DELIVERY_REJECT("DELIVERY_REJECT");

  private String value;

  ServeMarketOrderGetV10DataOrderListOrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ServeMarketOrderGetV10DataOrderListOrderStatus fromValue(String value) {
    for (ServeMarketOrderGetV10DataOrderListOrderStatus b : ServeMarketOrderGetV10DataOrderListOrderStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ServeMarketOrderGetV10DataOrderListOrderStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ServeMarketOrderGetV10DataOrderListOrderStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ServeMarketOrderGetV10DataOrderListOrderStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ServeMarketOrderGetV10DataOrderListOrderStatus.fromValue(value);
    }
  }
}

