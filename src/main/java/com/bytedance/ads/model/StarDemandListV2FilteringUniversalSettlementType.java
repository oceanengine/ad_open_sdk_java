/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
@JsonAdapter(StarDemandListV2FilteringUniversalSettlementType.Adapter.class)
public enum StarDemandListV2FilteringUniversalSettlementType {
  
  EXCHANGE("EXCHANGE"),
  
  CPM("CPM"),
  
  STAR_SUPPORT("STAR_SUPPORT"),
  
  FIXED_PRICE("FIXED_PRICE"),
  
  FLOW_SHARE("FLOW_SHARE"),
  
  GIFT("GIFT"),
  
  DOU_PLUS("DOU_PLUS"),
  
  MONEY_SHARE("MONEY_SHARE"),
  
  ALL("ALL"),
  
  RANK("RANK"),
  
  EFFECT("EFFECT"),
  
  CPA("CPA"),
  
  CUSTOMIZE("CUSTOMIZE");

  private String value;

  StarDemandListV2FilteringUniversalSettlementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarDemandListV2FilteringUniversalSettlementType fromValue(String value) {
    for (StarDemandListV2FilteringUniversalSettlementType b : StarDemandListV2FilteringUniversalSettlementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarDemandListV2FilteringUniversalSettlementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarDemandListV2FilteringUniversalSettlementType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarDemandListV2FilteringUniversalSettlementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarDemandListV2FilteringUniversalSettlementType.fromValue(value);
    }
  }
}

