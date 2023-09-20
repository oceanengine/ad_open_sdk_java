/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@JsonAdapter(ReportCampaignGetV2FilteringDeliveryMode.Adapter.class)
public enum ReportCampaignGetV2FilteringDeliveryMode {
  
  ADLAB_FREE("ADLAB_FREE"),
  
  STANDARD("STANDARD");

  private String value;

  ReportCampaignGetV2FilteringDeliveryMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCampaignGetV2FilteringDeliveryMode fromValue(String value) {
    for (ReportCampaignGetV2FilteringDeliveryMode b : ReportCampaignGetV2FilteringDeliveryMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCampaignGetV2FilteringDeliveryMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCampaignGetV2FilteringDeliveryMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCampaignGetV2FilteringDeliveryMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCampaignGetV2FilteringDeliveryMode.fromValue(value);
    }
  }
}
