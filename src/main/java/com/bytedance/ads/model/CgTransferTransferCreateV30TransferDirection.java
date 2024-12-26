/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(CgTransferTransferCreateV30TransferDirection.Adapter.class)
public enum CgTransferTransferCreateV30TransferDirection {
  
  IN("TRANSFER_IN"),
  
  OUT("TRANSFER_OUT");

  private String value;

  CgTransferTransferCreateV30TransferDirection(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferTransferCreateV30TransferDirection fromValue(String value) {
    for (CgTransferTransferCreateV30TransferDirection b : CgTransferTransferCreateV30TransferDirection.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CgTransferTransferCreateV30TransferDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferTransferCreateV30TransferDirection enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferTransferCreateV30TransferDirection read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferTransferCreateV30TransferDirection.fromValue(value);
    }
  }
}

