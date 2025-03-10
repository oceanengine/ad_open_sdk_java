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
@JsonAdapter(DpaClueProductListV2FilteringAuditStatus.Adapter.class)
public enum DpaClueProductListV2FilteringAuditStatus {
  
  APPROVE("AUDIT_STATUS_APPROVE"),
  
  INIT("AUDIT_STATUS_INIT"),
  
  REJECT("AUDIT_STATUS_REJECT");

  private String value;

  DpaClueProductListV2FilteringAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaClueProductListV2FilteringAuditStatus fromValue(String value) {
    for (DpaClueProductListV2FilteringAuditStatus b : DpaClueProductListV2FilteringAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DpaClueProductListV2FilteringAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaClueProductListV2FilteringAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaClueProductListV2FilteringAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaClueProductListV2FilteringAuditStatus.fromValue(value);
    }
  }
}

