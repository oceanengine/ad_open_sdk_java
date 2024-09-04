/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@JsonAdapter(BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus.Adapter.class)
public enum BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus {
  
  EXPIRED("EXPIRED"),
  
  FAILED("FAILED"),
  
  NOT_STARTED("NOT_STARTED"),
  
  PROCESSING("PROCESSING"),
  
  SUCCESS("SUCCESS"),
  
  WAITING("WAITING");

  private String value;

  BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus fromValue(String value) {
    for (BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus b : BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BusinessPlatformCompanyInfoGetV30DataCompanyInfoStatus.fromValue(value);
    }
  }
}

