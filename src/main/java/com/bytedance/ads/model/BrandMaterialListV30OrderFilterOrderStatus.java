/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.33
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
@JsonAdapter(BrandMaterialListV30OrderFilterOrderStatus.Adapter.class)
public enum BrandMaterialListV30OrderFilterOrderStatus {
  
  COMPLETE("COMPLETE"),
  
  DELIVERING("DELIVERING"),
  
  EDITING("EDITING"),
  
  IS_DEL("IS_DEL"),
  
  NEW_ORDER("NEW_ORDER"),
  
  NOT_DELIVER("NOT_DELIVER"),
  
  PAUSE("PAUSE"),
  
  RESUBMITTING("RESUBMITTING"),
  
  RESUBMIT_FAILED("RESUBMIT_FAILED"),
  
  SUBMITTING("SUBMITTING"),
  
  SUBMIT_FAILED("SUBMIT_FAILED"),
  
  WAIT_DELETING("WAIT_DELETING");

  private String value;

  BrandMaterialListV30OrderFilterOrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandMaterialListV30OrderFilterOrderStatus fromValue(String value) {
    for (BrandMaterialListV30OrderFilterOrderStatus b : BrandMaterialListV30OrderFilterOrderStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandMaterialListV30OrderFilterOrderStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandMaterialListV30OrderFilterOrderStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandMaterialListV30OrderFilterOrderStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandMaterialListV30OrderFilterOrderStatus.fromValue(value);
    }
  }
}
