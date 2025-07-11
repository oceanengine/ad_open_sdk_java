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
@JsonAdapter(DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus.Adapter.class)
public enum DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus {
  
  NEED_PUBLISH("CUSTOM_AUDIENCE_DELIVERY_STATUS_NEED_PUBLISH"),
  
  AVAILABLE("CUSTOM_AUDIENCE_DELIVERY_STATUS_AVAILABLE"),
  
  NEED_PUSH("CUSTOM_AUDIENCE_DELIVERY_STATUS_NEED_PUSH"),
  
  UNAVAILABLE("CUSTOM_AUDIENCE_DELIVERY_STATUS_UNAVAILABLE");

  private String value;

  DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus fromValue(String value) {
    for (DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus b : DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus.fromValue(value);
    }
  }
}

