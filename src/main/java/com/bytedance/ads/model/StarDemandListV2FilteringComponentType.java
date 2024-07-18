/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(StarDemandListV2FilteringComponentType.Adapter.class)
public enum StarDemandListV2FilteringComponentType {
  
  GAME_ANCHOR("GAME_ANCHOR"),
  
  ANCHOR_MOVIE("ANCHOR_MOVIE"),
  
  ANCHOR_E_GAME("ANCHOR_E_GAME"),
  
  ANCHOR_ECOM("ANCHOR_ECOM"),
  
  LIVE_ORDER_COMPONENT("LIVE_ORDER_COMPONENT"),
  
  ENTERPRISE_SALON("ENTERPRISE_SALON"),
  
  CART("CART"),
  
  ANCHOR_ESTATE_SERVICE("ANCHOR_ESTATE_SERVICE"),
  
  MICROAPP_ANCHOR("MICROAPP_ANCHOR"),
  
  ANCHOR_INSURANCE("ANCHOR_INSURANCE"),
  
  ENTERPRISE_ECOM("ENTERPRISE_ECOM"),
  
  ANCHOR_HOME("ANCHOR_HOME"),
  
  BRAND_ANCHOR("BRAND_ANCHOR"),
  
  LINK("LINK"),
  
  ENTERPRISE_DOWNLOAD_APP("ENTERPRISE_DOWNLOAD_APP"),
  
  ENTERPRISE_DOWNLOAD("ENTERPRISE_DOWNLOAD"),
  
  ENTERPRISE_COUPON("ENTERPRISE_COUPON"),
  
  ALL("ALL"),
  
  ENTERPRISE_MICRO_APP("ENTERPRISE_MICRO_APP"),
  
  ENTERPRISE_ORDER_SERVICE("ENTERPRISE_ORDER_SERVICE"),
  
  ENTERPRISE_WEDDING_PHOTO("ENTERPRISE_WEDDING_PHOTO"),
  
  ANCHOR_XIGUA("ANCHOR_XIGUA"),
  
  ANCHOR_CAR("ANCHOR_CAR"),
  
  ENTERPRISE_CAR("ENTERPRISE_CAR"),
  
  ANCHOR_MICRO_APP_POI("ANCHOR_MICRO_APP_POI"),
  
  VARIETY_ANCHOR("VARIETY_ANCHOR"),
  
  ANCHOR_TOURISM("ANCHOR_TOURISM"),
  
  POI("POI"),
  
  ANCHOR_EDUCATION("ANCHOR_EDUCATION"),
  
  ANCHOR_TELECOM("ANCHOR_TELECOM"),
  
  ENTERPRISE_NOVEL("ENTERPRISE_NOVEL"),
  
  ANCHOR_INVESTMENT("ANCHOR_INVESTMENT"),
  
  ANCHOR_DOWNLOAD("ANCHOR_DOWNLOAD");

  private String value;

  StarDemandListV2FilteringComponentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarDemandListV2FilteringComponentType fromValue(String value) {
    for (StarDemandListV2FilteringComponentType b : StarDemandListV2FilteringComponentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarDemandListV2FilteringComponentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarDemandListV2FilteringComponentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarDemandListV2FilteringComponentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarDemandListV2FilteringComponentType.fromValue(value);
    }
  }
}

