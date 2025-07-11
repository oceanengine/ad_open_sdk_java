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
@JsonAdapter(QueryRebateAccountingInfoV2FilteringApprovalStatus.Adapter.class)
public enum QueryRebateAccountingInfoV2FilteringApprovalStatus {
  
  AGENT_APPROVING("AGENT_APPROVING"),
  
  BUSINESS_APPROVING("BUSINESS_APPROVING"),
  
  APPROVED("APPROVED");

  private String value;

  QueryRebateAccountingInfoV2FilteringApprovalStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QueryRebateAccountingInfoV2FilteringApprovalStatus fromValue(String value) {
    for (QueryRebateAccountingInfoV2FilteringApprovalStatus b : QueryRebateAccountingInfoV2FilteringApprovalStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QueryRebateAccountingInfoV2FilteringApprovalStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QueryRebateAccountingInfoV2FilteringApprovalStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QueryRebateAccountingInfoV2FilteringApprovalStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QueryRebateAccountingInfoV2FilteringApprovalStatus.fromValue(value);
    }
  }
}

