/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(CampaignCreateV2Operation.Adapter.class)
public enum CampaignCreateV2Operation {
  
  ENABLE("enable"),
  
  DISABLE("disable");

  private String value;

  CampaignCreateV2Operation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignCreateV2Operation fromValue(String value) {
    for (CampaignCreateV2Operation b : CampaignCreateV2Operation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CampaignCreateV2Operation> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignCreateV2Operation enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignCreateV2Operation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignCreateV2Operation.fromValue(value);
    }
  }
}

