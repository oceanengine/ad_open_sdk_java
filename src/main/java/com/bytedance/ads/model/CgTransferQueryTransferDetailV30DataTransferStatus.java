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
@JsonAdapter(CgTransferQueryTransferDetailV30DataTransferStatus.Adapter.class)
public enum CgTransferQueryTransferDetailV30DataTransferStatus {
  
  NO_TRANSFER("NO_TRANSFER"),
  
  TRANSFER_FAILED("TRANSFER_FAILED"),
  
  TRANSFER_ING("TRANSFER_ING"),
  
  TRANSFER_PART("TRANSFER_PART"),
  
  TRANSFER_SUCCESS("TRANSFER_SUCCESS");

  private String value;

  CgTransferQueryTransferDetailV30DataTransferStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferQueryTransferDetailV30DataTransferStatus fromValue(String value) {
    for (CgTransferQueryTransferDetailV30DataTransferStatus b : CgTransferQueryTransferDetailV30DataTransferStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CgTransferQueryTransferDetailV30DataTransferStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferQueryTransferDetailV30DataTransferStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferQueryTransferDetailV30DataTransferStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferQueryTransferDetailV30DataTransferStatus.fromValue(value);
    }
  }
}

