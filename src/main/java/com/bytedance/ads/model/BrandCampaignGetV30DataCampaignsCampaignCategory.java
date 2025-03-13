/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(BrandCampaignGetV30DataCampaignsCampaignCategory.Adapter.class)
public enum BrandCampaignGetV30DataCampaignsCampaignCategory {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_4(4l);

  private Long value;

  BrandCampaignGetV30DataCampaignsCampaignCategory(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandCampaignGetV30DataCampaignsCampaignCategory fromValue(Long value) {
    for (BrandCampaignGetV30DataCampaignsCampaignCategory b : BrandCampaignGetV30DataCampaignsCampaignCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandCampaignGetV30DataCampaignsCampaignCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandCampaignGetV30DataCampaignsCampaignCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandCampaignGetV30DataCampaignsCampaignCategory read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return BrandCampaignGetV30DataCampaignsCampaignCategory.fromValue(value);
    }
  }
}

