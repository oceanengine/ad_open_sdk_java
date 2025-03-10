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
@JsonAdapter(AdvertiserDeliveryPkgConfigV30DataIndustryConfigNecessariesRulesType.Adapter.class)
public enum AdvertiserDeliveryPkgConfigV30DataIndustryConfigNecessariesRulesType {
  
  CHOICE("CHOICE"),
  
  COMPOSE("COMPOSE");

  private String value;

  AdvertiserDeliveryPkgConfigV30DataIndustryConfigNecessariesRulesType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserDeliveryPkgConfigV30DataIndustryConfigNecessariesRulesType fromValue(String value) {
    for (AdvertiserDeliveryPkgConfigV30DataIndustryConfigNecessariesRulesType b : AdvertiserDeliveryPkgConfigV30DataIndustryConfigNecessariesRulesType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdvertiserDeliveryPkgConfigV30DataIndustryConfigNecessariesRulesType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserDeliveryPkgConfigV30DataIndustryConfigNecessariesRulesType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserDeliveryPkgConfigV30DataIndustryConfigNecessariesRulesType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserDeliveryPkgConfigV30DataIndustryConfigNecessariesRulesType.fromValue(value);
    }
  }
}

