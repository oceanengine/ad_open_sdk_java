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
@JsonAdapter(BrandOrderListV30DataOrdersClassify.Adapter.class)
public enum BrandOrderListV30DataOrdersClassify {
  
  EXCHANGE("EXCHANGE"),
  
  INTERNAL("INTERNAL"),
  
  SALE("SALE"),
  
  SUBSIDIARY("SUBSIDIARY"),
  
  SUPPLEMENT("SUPPLEMENT");

  private String value;

  BrandOrderListV30DataOrdersClassify(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandOrderListV30DataOrdersClassify fromValue(String value) {
    for (BrandOrderListV30DataOrdersClassify b : BrandOrderListV30DataOrdersClassify.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandOrderListV30DataOrdersClassify> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandOrderListV30DataOrdersClassify enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandOrderListV30DataOrdersClassify read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandOrderListV30DataOrdersClassify.fromValue(value);
    }
  }
}

