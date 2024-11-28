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
@JsonAdapter(CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus.Adapter.class)
public enum CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus {
  
  NO_TRANSFER("NO_TRANSFER"),
  
  TRANSFER_FAILED("TRANSFER_FAILED"),
  
  TRANSFER_ING("TRANSFER_ING"),
  
  TRANSFER_PART("TRANSFER_PART"),
  
  TRANSFER_SUCCESS("TRANSFER_SUCCESS");

  private String value;

  CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus fromValue(String value) {
    for (CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus b : CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus.fromValue(value);
    }
  }
}

