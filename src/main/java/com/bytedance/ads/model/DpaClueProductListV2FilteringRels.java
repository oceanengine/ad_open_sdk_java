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
@JsonAdapter(DpaClueProductListV2FilteringRels.Adapter.class)
public enum DpaClueProductListV2FilteringRels {
  
  COP("REL_COP"),
  
  OWN("REL_OWN");

  private String value;

  DpaClueProductListV2FilteringRels(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaClueProductListV2FilteringRels fromValue(String value) {
    for (DpaClueProductListV2FilteringRels b : DpaClueProductListV2FilteringRels.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DpaClueProductListV2FilteringRels> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaClueProductListV2FilteringRels enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaClueProductListV2FilteringRels read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaClueProductListV2FilteringRels.fromValue(value);
    }
  }
}

