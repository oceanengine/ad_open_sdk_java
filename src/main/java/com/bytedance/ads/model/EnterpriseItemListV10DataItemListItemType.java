/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(EnterpriseItemListV10DataItemListItemType.Adapter.class)
public enum EnterpriseItemListV10DataItemListItemType {
  
  CONTENT("ITEM_CONTENT"),
  
  AD("ITEM_AD");

  private String value;

  EnterpriseItemListV10DataItemListItemType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnterpriseItemListV10DataItemListItemType fromValue(String value) {
    for (EnterpriseItemListV10DataItemListItemType b : EnterpriseItemListV10DataItemListItemType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnterpriseItemListV10DataItemListItemType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnterpriseItemListV10DataItemListItemType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnterpriseItemListV10DataItemListItemType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnterpriseItemListV10DataItemListItemType.fromValue(value);
    }
  }
}

