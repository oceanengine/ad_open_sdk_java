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
@JsonAdapter(BrandCampaignOperateV30Operate.Adapter.class)
public enum BrandCampaignOperateV30Operate {
  
  MODIFY("MODIFY"),
  
  REVOKE_MODIFY("REVOKE_MODIFY"),
  
  SUBMIT("SUBMIT");

  private String value;

  BrandCampaignOperateV30Operate(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandCampaignOperateV30Operate fromValue(String value) {
    for (BrandCampaignOperateV30Operate b : BrandCampaignOperateV30Operate.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandCampaignOperateV30Operate> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandCampaignOperateV30Operate enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandCampaignOperateV30Operate read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandCampaignOperateV30Operate.fromValue(value);
    }
  }
}

