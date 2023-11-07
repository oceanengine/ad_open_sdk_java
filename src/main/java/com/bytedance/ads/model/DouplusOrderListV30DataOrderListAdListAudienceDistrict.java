/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
@JsonAdapter(DouplusOrderListV30DataOrderListAdListAudienceDistrict.Adapter.class)
public enum DouplusOrderListV30DataOrderListAdListAudienceDistrict {
  
  BUSINESS("BUSINESS"),
  
  COUNTRY("COUNTRY"),
  
  PROVINCE("PROVINCE");

  private String value;

  DouplusOrderListV30DataOrderListAdListAudienceDistrict(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DouplusOrderListV30DataOrderListAdListAudienceDistrict fromValue(String value) {
    for (DouplusOrderListV30DataOrderListAdListAudienceDistrict b : DouplusOrderListV30DataOrderListAdListAudienceDistrict.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DouplusOrderListV30DataOrderListAdListAudienceDistrict> {
    @Override
    public void write(final JsonWriter jsonWriter, final DouplusOrderListV30DataOrderListAdListAudienceDistrict enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DouplusOrderListV30DataOrderListAdListAudienceDistrict read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DouplusOrderListV30DataOrderListAdListAudienceDistrict.fromValue(value);
    }
  }
}

