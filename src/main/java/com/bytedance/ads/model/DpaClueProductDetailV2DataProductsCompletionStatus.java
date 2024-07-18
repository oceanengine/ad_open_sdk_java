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
@JsonAdapter(DpaClueProductDetailV2DataProductsCompletionStatus.Adapter.class)
public enum DpaClueProductDetailV2DataProductsCompletionStatus {
  
  AD_COMPLETED("AD_COMPLETED"),
  
  ALL_COMPLETED("ALL_COMPLETED"),
  
  LEADS_COMPLETED("LEADS_COMPLETED"),
  
  TO_BE_COMPLETED("TO_BE_COMPLETED");

  private String value;

  DpaClueProductDetailV2DataProductsCompletionStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaClueProductDetailV2DataProductsCompletionStatus fromValue(String value) {
    for (DpaClueProductDetailV2DataProductsCompletionStatus b : DpaClueProductDetailV2DataProductsCompletionStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DpaClueProductDetailV2DataProductsCompletionStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaClueProductDetailV2DataProductsCompletionStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaClueProductDetailV2DataProductsCompletionStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaClueProductDetailV2DataProductsCompletionStatus.fromValue(value);
    }
  }
}

