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
@JsonAdapter(PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus.Adapter.class)
public enum PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus {
  
  DEFAULT_STATUS("DEFAULT_STATUS"),
  
  IN_EFFECT("IN_EFFECT"),
  
  INVALID("INVALID"),
  
  CONFIRMING("CONFIRMING"),
  
  PAID("PAID"),
  
  ENDED("ENDED");

  private String value;

  PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus fromValue(String value) {
    for (PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus b : PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus.fromValue(value);
    }
  }
}

