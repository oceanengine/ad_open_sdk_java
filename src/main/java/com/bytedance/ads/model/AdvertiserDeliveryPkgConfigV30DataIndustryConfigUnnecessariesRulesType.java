/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType.Adapter.class)
public enum AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType {
  
  CHOICE("CHOICE"),
  
  COMPOSE("COMPOSE");

  private String value;

  AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType fromValue(String value) {
    for (AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType b : AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType.fromValue(value);
    }
  }
}

