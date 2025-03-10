/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(CgTransferWalletTransferCanTransferBalanceV30TransferDirection.Adapter.class)
public enum CgTransferWalletTransferCanTransferBalanceV30TransferDirection {
  
  IN("TRANSFER_IN"),
  
  OUT("TRANSFER_OUT");

  private String value;

  CgTransferWalletTransferCanTransferBalanceV30TransferDirection(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferWalletTransferCanTransferBalanceV30TransferDirection fromValue(String value) {
    for (CgTransferWalletTransferCanTransferBalanceV30TransferDirection b : CgTransferWalletTransferCanTransferBalanceV30TransferDirection.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CgTransferWalletTransferCanTransferBalanceV30TransferDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferWalletTransferCanTransferBalanceV30TransferDirection enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferWalletTransferCanTransferBalanceV30TransferDirection read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferWalletTransferCanTransferBalanceV30TransferDirection.fromValue(value);
    }
  }
}

