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
@JsonAdapter(CgTransferWalletTransferListV30AccountType.Adapter.class)
public enum CgTransferWalletTransferListV30AccountType {
  
  AD("AD"),
  
  AGENT("AGENT"),
  
  LOCAL("LOCAL"),
  
  QIANCHUAN("QIANCHUAN");

  private String value;

  CgTransferWalletTransferListV30AccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferWalletTransferListV30AccountType fromValue(String value) {
    for (CgTransferWalletTransferListV30AccountType b : CgTransferWalletTransferListV30AccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CgTransferWalletTransferListV30AccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferWalletTransferListV30AccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferWalletTransferListV30AccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferWalletTransferListV30AccountType.fromValue(value);
    }
  }
}

