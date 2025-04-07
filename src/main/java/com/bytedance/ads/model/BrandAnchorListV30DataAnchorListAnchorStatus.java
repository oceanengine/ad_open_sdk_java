/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(BrandAnchorListV30DataAnchorListAnchorStatus.Adapter.class)
public enum BrandAnchorListV30DataAnchorListAnchorStatus {
  
  AUDITING("AUDITING"),
  
  DELETE("DELETE"),
  
  PASS("PASS"),
  
  REJECT("REJECT");

  private String value;

  BrandAnchorListV30DataAnchorListAnchorStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandAnchorListV30DataAnchorListAnchorStatus fromValue(String value) {
    for (BrandAnchorListV30DataAnchorListAnchorStatus b : BrandAnchorListV30DataAnchorListAnchorStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandAnchorListV30DataAnchorListAnchorStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandAnchorListV30DataAnchorListAnchorStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandAnchorListV30DataAnchorListAnchorStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandAnchorListV30DataAnchorListAnchorStatus.fromValue(value);
    }
  }
}

