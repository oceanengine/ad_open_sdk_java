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
@JsonAdapter(BrandAwemeListV30DataAwemeUserInfoListAuthStatus.Adapter.class)
public enum BrandAwemeListV30DataAwemeUserInfoListAuthStatus {
  
  AUTHING("AUTHING"),
  
  EXPIRED("EXPIRED"),
  
  UNBIND("UNBIND");

  private String value;

  BrandAwemeListV30DataAwemeUserInfoListAuthStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandAwemeListV30DataAwemeUserInfoListAuthStatus fromValue(String value) {
    for (BrandAwemeListV30DataAwemeUserInfoListAuthStatus b : BrandAwemeListV30DataAwemeUserInfoListAuthStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandAwemeListV30DataAwemeUserInfoListAuthStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandAwemeListV30DataAwemeUserInfoListAuthStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandAwemeListV30DataAwemeUserInfoListAuthStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandAwemeListV30DataAwemeUserInfoListAuthStatus.fromValue(value);
    }
  }
}

