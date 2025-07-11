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
@JsonAdapter(CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus.Adapter.class)
public enum CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus {
  
  NO_TRANSFER("NO_TRANSFER"),
  
  TRANSFER_FAILED("TRANSFER_FAILED"),
  
  TRANSFER_ING("TRANSFER_ING"),
  
  TRANSFER_PART("TRANSFER_PART"),
  
  TRANSFER_SUCCESS("TRANSFER_SUCCESS");

  private String value;

  CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus fromValue(String value) {
    for (CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus b : CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus.fromValue(value);
    }
  }
}

