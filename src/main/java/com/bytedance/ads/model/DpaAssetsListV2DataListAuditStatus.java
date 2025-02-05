/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(DpaAssetsListV2DataListAuditStatus.Adapter.class)
public enum DpaAssetsListV2DataListAuditStatus {
  
  AUDIT_SUCCESS("ASSETS_AUDIT_SUCCESS"),
  
  TO_SUBMIT_AUDIT("ASSETS_TO_SUBMIT_AUDIT"),
  
  PENDING_AUDIT("ASSETS_PENDING_AUDIT"),
  
  AUDIT_DENY("ASSETS_AUDIT_DENY");

  private String value;

  DpaAssetsListV2DataListAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaAssetsListV2DataListAuditStatus fromValue(String value) {
    for (DpaAssetsListV2DataListAuditStatus b : DpaAssetsListV2DataListAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DpaAssetsListV2DataListAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaAssetsListV2DataListAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaAssetsListV2DataListAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaAssetsListV2DataListAuditStatus.fromValue(value);
    }
  }
}

