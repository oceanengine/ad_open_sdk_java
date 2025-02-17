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
@JsonAdapter(DpaAssetV2DetailReadV2DataAssetListAuditStatus.Adapter.class)
public enum DpaAssetV2DetailReadV2DataAssetListAuditStatus {
  
  REVIEW_FAIL("REVIEW_FAIL"),
  
  REVIEW_SUCCESS("REVIEW_SUCCESS"),
  
  UNDER_REVIEW("UNDER_REVIEW"),
  
  UNREVIEWED("UNREVIEWED");

  private String value;

  DpaAssetV2DetailReadV2DataAssetListAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaAssetV2DetailReadV2DataAssetListAuditStatus fromValue(String value) {
    for (DpaAssetV2DetailReadV2DataAssetListAuditStatus b : DpaAssetV2DetailReadV2DataAssetListAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DpaAssetV2DetailReadV2DataAssetListAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaAssetV2DetailReadV2DataAssetListAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaAssetV2DetailReadV2DataAssetListAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaAssetV2DetailReadV2DataAssetListAuditStatus.fromValue(value);
    }
  }
}

