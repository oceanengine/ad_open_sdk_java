/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(LocalChargeListV30ChargeMethods.Adapter.class)
public enum LocalChargeListV30ChargeMethods {
  
  ONLINE_CHARGE("ONLINE_CHARGE"),
  
  CORPORATE_REMITTANCE("CORPORATE_REMITTANCE"),
  
  ORDER_PAY("ORDER_PAY"),
  
  COMMISSION("COMMISSION"),
  
  DIRECT_CHARGE("DIRECT_CHARGE"),
  
  GOODS_TRANSFER("GOODS_TRANSFER");

  private String value;

  LocalChargeListV30ChargeMethods(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalChargeListV30ChargeMethods fromValue(String value) {
    for (LocalChargeListV30ChargeMethods b : LocalChargeListV30ChargeMethods.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalChargeListV30ChargeMethods> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalChargeListV30ChargeMethods enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalChargeListV30ChargeMethods read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalChargeListV30ChargeMethods.fromValue(value);
    }
  }
}

