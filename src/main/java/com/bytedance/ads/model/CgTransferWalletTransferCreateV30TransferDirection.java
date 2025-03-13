/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(CgTransferWalletTransferCreateV30TransferDirection.Adapter.class)
public enum CgTransferWalletTransferCreateV30TransferDirection {
  
  IN("TRANSFER_IN"),
  
  OUT("TRANSFER_OUT");

  private String value;

  CgTransferWalletTransferCreateV30TransferDirection(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferWalletTransferCreateV30TransferDirection fromValue(String value) {
    for (CgTransferWalletTransferCreateV30TransferDirection b : CgTransferWalletTransferCreateV30TransferDirection.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CgTransferWalletTransferCreateV30TransferDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferWalletTransferCreateV30TransferDirection enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferWalletTransferCreateV30TransferDirection read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferWalletTransferCreateV30TransferDirection.fromValue(value);
    }
  }
}

