/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform.Adapter.class)
public enum CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform {
  
  AD("AD"),
  
  AD_ALL("AD_ALL"),
  
  BENDITUI("BENDITUI"),
  
  QIANCHUAN("QIANCHUAN"),
  
  STAR("STAR");

  private String value;

  CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform fromValue(String value) {
    for (CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform b : CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform.fromValue(value);
    }
  }
}

