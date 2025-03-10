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
@JsonAdapter(QueryInvoiceV2FilteringInvoiceType.Adapter.class)
public enum QueryInvoiceV2FilteringInvoiceType {
  
  GENERAL("GENERAL"),
  
  SPECIAL("SPECIAL"),
  
  E_GENERAL("E_GENERAL"),
  
  E_SPECIAL("E_SPECIAL"),
  
  ALL_E_GENERAL("ALL_E_GENERAL"),
  
  ALL_E_SPECIAL("ALL_E_SPECIAL");

  private String value;

  QueryInvoiceV2FilteringInvoiceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QueryInvoiceV2FilteringInvoiceType fromValue(String value) {
    for (QueryInvoiceV2FilteringInvoiceType b : QueryInvoiceV2FilteringInvoiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QueryInvoiceV2FilteringInvoiceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QueryInvoiceV2FilteringInvoiceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QueryInvoiceV2FilteringInvoiceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QueryInvoiceV2FilteringInvoiceType.fromValue(value);
    }
  }
}

