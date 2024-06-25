/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(AdlabGroupDetailV30DataDataAdInfoAudienceDistrict.Adapter.class)
public enum AdlabGroupDetailV30DataDataAdInfoAudienceDistrict {
  
  BUSINESS_DISTRICT("BUSINESS_DISTRICT"),
  
  CITY("CITY"),
  
  COUNTY("COUNTY"),
  
  NONE("NONE"),
  
  REGION("REGION");

  private String value;

  AdlabGroupDetailV30DataDataAdInfoAudienceDistrict(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupDetailV30DataDataAdInfoAudienceDistrict fromValue(String value) {
    for (AdlabGroupDetailV30DataDataAdInfoAudienceDistrict b : AdlabGroupDetailV30DataDataAdInfoAudienceDistrict.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdlabGroupDetailV30DataDataAdInfoAudienceDistrict> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupDetailV30DataDataAdInfoAudienceDistrict enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupDetailV30DataDataAdInfoAudienceDistrict read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupDetailV30DataDataAdInfoAudienceDistrict.fromValue(value);
    }
  }
}

