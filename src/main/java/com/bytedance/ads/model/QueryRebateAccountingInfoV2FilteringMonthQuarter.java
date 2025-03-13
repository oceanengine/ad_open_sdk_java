/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(QueryRebateAccountingInfoV2FilteringMonthQuarter.Adapter.class)
public enum QueryRebateAccountingInfoV2FilteringMonthQuarter {
  
  ALLYEAR("AllYear"),
  
  APR("Apr"),
  
  AUG("Aug"),
  
  DEC("Dec"),
  
  FEB("Feb"),
  
  FIRHALF("FirHalf"),
  
  JAN("Jan"),
  
  JUL("Jul"),
  
  JUN("Jun"),
  
  MAR("Mar"),
  
  MAY("May"),
  
  NOV("Nov"),
  
  OCT("Oct"),
  
  Q1("Q1"),
  
  Q2("Q2"),
  
  Q3("Q3"),
  
  Q4("Q4"),
  
  SECHALF("SecHalf"),
  
  SEP("Sep");

  private String value;

  QueryRebateAccountingInfoV2FilteringMonthQuarter(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QueryRebateAccountingInfoV2FilteringMonthQuarter fromValue(String value) {
    for (QueryRebateAccountingInfoV2FilteringMonthQuarter b : QueryRebateAccountingInfoV2FilteringMonthQuarter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QueryRebateAccountingInfoV2FilteringMonthQuarter> {
    @Override
    public void write(final JsonWriter jsonWriter, final QueryRebateAccountingInfoV2FilteringMonthQuarter enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QueryRebateAccountingInfoV2FilteringMonthQuarter read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QueryRebateAccountingInfoV2FilteringMonthQuarter.fromValue(value);
    }
  }
}

