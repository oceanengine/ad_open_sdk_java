/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(BusinessPlatformPartnerOrganizationListV2FilteringStatus.Adapter.class)
public enum BusinessPlatformPartnerOrganizationListV2FilteringStatus {
  
  BOUND("BOUND"),
  
  BINDING("BINDING"),
  
  INVALID("INVALID"),
  
  DELETED("DELETED");

  private String value;

  BusinessPlatformPartnerOrganizationListV2FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BusinessPlatformPartnerOrganizationListV2FilteringStatus fromValue(String value) {
    for (BusinessPlatformPartnerOrganizationListV2FilteringStatus b : BusinessPlatformPartnerOrganizationListV2FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BusinessPlatformPartnerOrganizationListV2FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BusinessPlatformPartnerOrganizationListV2FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BusinessPlatformPartnerOrganizationListV2FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BusinessPlatformPartnerOrganizationListV2FilteringStatus.fromValue(value);
    }
  }
}

