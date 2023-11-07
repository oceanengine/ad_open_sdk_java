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
@JsonAdapter(AdlabGroupDetailV30DataDataCampaignInfoLandingType.Adapter.class)
public enum AdlabGroupDetailV30DataDataCampaignInfoLandingType {
  
  APP("APP"),
  
  DPA("DPA"),
  
  LINK("LINK"),
  
  LIVE("LIVE"),
  
  SHOP("SHOP");

  private String value;

  AdlabGroupDetailV30DataDataCampaignInfoLandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupDetailV30DataDataCampaignInfoLandingType fromValue(String value) {
    for (AdlabGroupDetailV30DataDataCampaignInfoLandingType b : AdlabGroupDetailV30DataDataCampaignInfoLandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdlabGroupDetailV30DataDataCampaignInfoLandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupDetailV30DataDataCampaignInfoLandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupDetailV30DataDataCampaignInfoLandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupDetailV30DataDataCampaignInfoLandingType.fromValue(value);
    }
  }
}

